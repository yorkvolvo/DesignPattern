package com.example.singleton.java;

public class SingletonLazy {

    //类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
    private static SingletonLazy instance;

    //构造器私有化
    private SingletonLazy(){}

    //方法同步，调用效率低
    public static synchronized SingletonLazy getInstance(){
        if(instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }
}