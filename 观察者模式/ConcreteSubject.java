package 设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YangChenxi
 * ConcreteSubject : 具体被观察者
 */
public class ConcreteSubject implements Subject{
    public List<Observer> list = new ArrayList<>();
    private String name;
    public ConcreteSubject(String name){
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer : list){
            observer.update(name + message);
        }
    }
}
