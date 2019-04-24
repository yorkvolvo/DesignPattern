package com.accenture.showcase.proxypattern;

public class ProxySubject extends Subject {
    private RealSubject realSubject;//持有真实主题的引用

    public ProxySubject(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        //通过 RealSubject 引用的对象调用 RealSubject 的业务逻辑
       realSubject.visit();
    }
}
