package 设计模式.观察者模式;

/**
 * @author YangChenxi
 */
public class test {
    public static void main(String[] args) {
        //1.先创建一个具体的被观察者，也就是公众号
        ConcreteSubject concreteSubject = new ConcreteSubject("唐唐说奇案");
        //2.这时候模拟有用户关注了这个公众号,注意，用户是具体的观察者
        ConcreteObserver user1 = new ConcreteObserver("杨晨曦");
        ConcreteObserver user2 = new ConcreteObserver("王玮昳");
        ConcreteObserver user3 = new ConcreteObserver("tom");
        //订阅的动作
        concreteSubject.attach(user1);
        concreteSubject.attach(user2);
        concreteSubject.attach(user3);
        //3，更新
        concreteSubject.notify("更新啦");


    }
}
