package 设计模式.单例模式;
/*
在懒汉式的基础上加了synchronized，保证线程安全，但是降低了效率
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){

    }
    public static synchronized Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
