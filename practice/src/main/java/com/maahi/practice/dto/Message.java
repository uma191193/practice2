package com.maahi.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
  private String role; //Who is using either user or assistant ?
  private String content; //What you are searching for ? can be called as "Prompt" also.
}
