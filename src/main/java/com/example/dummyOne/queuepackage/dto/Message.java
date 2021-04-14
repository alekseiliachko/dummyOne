package com.example.dummyOne.queuepackage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    String payload;
    String topic;
}
