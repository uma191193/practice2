package com.maahi.practice.controller;

import com.maahi.practice.dto.CHatGPTRequest;
import com.maahi.practice.dto.CHatGPTResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
@RequestMapping("/bot")
@Log4j2
public class ChatGPTController {
    
    @Value("${chatgpt.model}")
    private String model;
    
    @Value("${chatgpt.url}")
    private String url;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/chat")
    public String chat(@RequestParam("content") String content) {
        CHatGPTRequest chatGPTRequest = new CHatGPTRequest(model, content);
        log.info("Your Request {} is processing.", content);
        CHatGPTResponse chatGPTResponse = restTemplate.postForObject(url, chatGPTRequest, CHatGPTResponse.class);
        if (Objects.nonNull(chatGPTResponse)) {
            log.info("Your Request is processed successfully.");
            return chatGPTResponse.getChoices().get(0).getMessage().getContent();
        } else {
            return "Received empty response.";
        }
    }
}
