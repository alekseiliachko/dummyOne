package com.example.dummyOne.queuepackage.listener;

import com.example.dummyOne.queuepackage.config.QueueConfig;
import com.example.dummyOne.queuepackage.dto.Message;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface QueueHttpListener {

    @PostMapping(QueueConfig.THIS_LISTENER_PATH)
    public ResponseEntity<String> receiver(@RequestHeader HttpHeaders headers, @RequestBody Message message);
}
