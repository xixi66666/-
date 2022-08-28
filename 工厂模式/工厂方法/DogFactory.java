package 设计模式.工厂模式.工厂方法;

public class DogFactory {
    public Dog CreateDog(){
        System.out.println("a Dog Create");
        return new Dog();
    }
}
