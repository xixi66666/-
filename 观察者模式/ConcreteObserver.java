package 设计模式.观察者模式;

/**
 * @author YangChenxi
 * ConcrereObserver : 具体观察者
 * 微信用户是观察者
 */
public class ConcreteObserver implements Observer {
    private String name;
    public ConcreteObserver(String name){
        this.name = name;
    }
    @Override
    public void update(String massage) {
        System.out.println(name + "您订阅的 " + massage);
    }
}
