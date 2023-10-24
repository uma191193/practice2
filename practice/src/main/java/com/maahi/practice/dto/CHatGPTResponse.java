package com.maahi.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CHatGPTResponse {
    
    private List<Choices> choices;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Choices {
        private int index;
        private Message message;
    }
}
