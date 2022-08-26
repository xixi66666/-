package 设计模式.单例模式;
/*
饿汉式

这种构造单例的方法是线程安全的

使用场景：
● 要求生成唯一序列号的环境；
● 在整个项目中需要一个共享访问点或共享数据，例如一个Web页面上的计数器，可以不用把每次刷新都记录到数据库中，
使用单例模式保持计数器的值，并确保是线程安全的；
● 创建一个对象需要消耗的资源过多，如要访问IO和数据库等资源；
● 需要定义大量的静态常量和静态方法（如工具类）的环境，可以采用单例模式（当然，也可以直接声明为static的方式）。

唯一缺点：不用是否用到都会加载到内存中
 */
public class Singleton {
    //1.首先初始化一个静态的final类对象
    private static final Singleton singleton = new Singleton();
    //2.将这个类的构造方法设置成private类型，即其他类中不能直接调用这个类的构造方法
    private Singleton(){}
    //3.让其他的类通过getInstance()来获取对象
    public static Singleton getInstance(){
        return singleton;
    }
    //4.类中其他方法，尽量是static
}
