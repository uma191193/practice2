package com.maahi.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CHatGPTRequest {
    
    private String model;
    private List<Message> messages;
    
    public CHatGPTRequest(String model, String content) {
        this.model = model; //model is type of CHAT_GPT version.
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", content)); // content is our query.
    }
}
