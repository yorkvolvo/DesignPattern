package com.accenture.showcase.observer.observer;


/**
 * Observer.java
 * 	抽象观察者
 */
public abstract class Observer {
    //收到通知
    public abstract void receive(String message);
}
