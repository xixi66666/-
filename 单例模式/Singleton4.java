package 设计模式.单例模式;
/*
完美的写法之一：静态内部类
优点在于：消除了饿汉式的缺点，如果只加载了Singleton4，里面的Holder是不会被加载的
    只有到用到Holder里面的getInstance的时候才会被加载
 */
public class Singleton4 {
    private Singleton4(){
    }
    //创建一个静态内部类Holder，在内部类中创建Instance
    private  static class SingletonHolder{
        private final static Singleton4 Instance = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.Instance;
    }

}
