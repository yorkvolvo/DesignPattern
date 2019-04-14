package com.example.singleton.java;

/*
* 饿汉式
*
* 优点：   线程安全，调用效率高，但是不能延时加载
* 缺点：   如果程序从头到位都没用使用这个单例的话，单例的对象还是会创建
* */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    /*构造函数私有，不对外开放*/
    private SingletonHungry(){}

    public static SingletonHungry getInstance(){
        return instance;
    }

}