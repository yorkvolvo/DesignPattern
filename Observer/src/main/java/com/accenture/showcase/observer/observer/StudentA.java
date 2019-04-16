package com.accenture.showcase.observer.observer;

/**
 * 	StudentA.java
 * 	具体的观察者(学生A)
 */
public class StudentA extends Observer{
    @Override
    public void receive(String message) {
        System.out.println("学生A收到消息："+message);
    }
}

