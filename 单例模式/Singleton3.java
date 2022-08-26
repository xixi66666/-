package 设计模式.单例模式;
/*
双重检查单例写法，首先静态的synchronized则是类锁，一个类一把锁。影响效率，这里取消类锁改用方法锁
 */
public class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3(){

    }
    public static  Singleton3 getInstance() {
        //第一重判断
        if (singleton3 == null) {
            synchronized ("aaa") {
                //第二重判断
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(Singleton3.getInstance().hashCode());
            }).start();
        }
    }
}
