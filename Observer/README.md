## 观察者模式介绍
GUI系统，订阅 -- 发布系统，这个模式的一个重要作用就是解耦，将被观察者和观察者解耦，使得他们之间依赖性变小，甚至做到毫无依赖。

## 定义
定义对象间的一种一对多的依赖关系,以便当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并自动刷新。

## 使用场景
- 关联行为场景，注意，关联行为是可拆分的，而不是 “组合” 关系
- 事件多级触发场景
- 跨系统的信息交换场景，如消息队列、时间总线的处理机制。

## UML 类图

![image](https://github.com/aixiaozi/DesignPattern/raw/master/image/observerUML.PNG)


## 简化步骤
1、创建具体被观察者(学校广播)继承抽象 被观察者
2、创建具体观察者（学生）继承抽象观察者
3、绑定联系
4、发送通知

## 参考链接
- [观察者模式UML和实现代码](https://my.oschina.net/u/2003960/blog/541199)
- [观察者模式](https://design-patterns.readthedocs.io/zh_CN/latest/behavioral_patterns/observer.html)
- [设计模式之观察者模式（Observer）与Java委托](https://blog.csdn.net/u013393958/article/details/80262206)
