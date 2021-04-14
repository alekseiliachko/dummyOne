package com.example.dummyOne.queuepackage.excpetion;

public class QueueMessageBrokerException extends RuntimeException {
    public QueueMessageBrokerException() {
        super("queue message broker error");
    }
}
