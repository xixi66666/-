package 设计模式.工厂模式.简单工厂;

public class DogFactory {
    public Dog CreateDog(){
        System.out.println("a Dog Create");
        return new Dog();
    }
}
