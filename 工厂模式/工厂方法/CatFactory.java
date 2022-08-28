package 设计模式.工厂模式.工厂方法;

public class CatFactory {
    public Cat CreateCat(){
        System.out.println("a cat created");
        return new Cat();
    }
}
