package com.example.singleton.java;

public class SingletonStatic {

    private SingletonStatic(){}

    private static SingletonStatic getInstance(){
        return SingletonHolder.instalce;
    }

    private static class SingletonHolder{
        private static final SingletonStatic instalce = new SingletonStatic();
    }
}
