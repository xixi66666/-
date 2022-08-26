package 设计模式.单例模式;
/*
懒汉式，线程不安全的
优点：在需要的时候才进行创建
 */
public class Singleton1 {
    private static Singleton1 singleton1;
    private Singleton1(){

    }
    /*
    在这里，如果线程A调用getInstance方法判断为null，进行对象的创建。线程b用用getInstance并进行判断的时候，A还没有
    创建完成，这时候b也进行创建。所以是线程不安全的
     */
    public static Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
