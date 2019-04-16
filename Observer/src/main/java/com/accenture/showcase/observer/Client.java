package com.accenture.showcase.observer;

import com.accenture.showcase.observer.observer.StudentA;
import com.accenture.showcase.observer.observer.StudentB;
import com.accenture.showcase.observer.observer.StudentC;

public class Client {
    public static void main(String[] args){
        //创建被观察者(学校广播)
        SchoolsBroadcast schoolsBroadcast = new SchoolsBroadcast();
        //创建观察者(学生)
        StudentA studentA = new StudentA();
        //绑定观察者 建立联系
        schoolsBroadcast.registerReceiver(studentA);
        schoolsBroadcast.registerReceiver(new StudentB());
        schoolsBroadcast.registerReceiver(new StudentC());
        //被观察者(学校广播)发出通知
        schoolsBroadcast.notifyObserver("放学");
        System.out.println("=====================");
        //解绑观察者(学生A)
        schoolsBroadcast.unRegisterReceiver(studentA);
        //被观察者(学校广播)发出通知
        schoolsBroadcast.notifyObserver("学生A请假");
    }
}
