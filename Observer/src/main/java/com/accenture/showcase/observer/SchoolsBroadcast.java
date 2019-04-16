package com.accenture.showcase.observer;

import com.accenture.showcase.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * SchoolsBroadcast.java
 * 	具体的 被观察者（学校广播）
 */
public class SchoolsBroadcast implements Observable{
    //用来存储观察者
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void notifyObserver(String message) {
        System.out.println("学校发出通知："+message);
        for(Observer ob:observers) {
            ob.receive(message);
        }
    }

    //绑定观察者（可以移动到抽象被观察者中）
    public void registerReceiver(Observer observer) {
        observers.add(observer);
    }

    //解绑观察者（可以移动到抽象被观察者中）
    public void unRegisterReceiver(Observer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }
}

