package com.accenture.showcase.observer.observer;

/**
 * 	StudentB.java
 * 	具体的观察者(学生B)
 */
public class StudentB extends Observer{
    @Override
    public void receive(String message) {
        System.out.println("学生B收到消息："+message);
    }
}
