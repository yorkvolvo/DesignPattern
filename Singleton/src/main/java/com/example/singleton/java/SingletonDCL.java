package com.example.singleton.java;

public class SingletonDCL {

    private static SingletonDCL instance;

    private SingletonDCL(){}

    public static SingletonDCL getInstance(){
        if(instance == null){
            synchronized (SingletonDCL.class){
                if (instance == null){
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
