package com.accenture.showcase.proxypattern;

public class RealSubject extends Subject{
    @Override
    public void visit() {
        //RealSubject's visit ogic
        System.out.println("Real Subject!");
    }
}
