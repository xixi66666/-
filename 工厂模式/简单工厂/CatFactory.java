package 设计模式.工厂模式.简单工厂;

public class CatFactory {
    public Cat CreateCat(){
        System.out.println("a cat created");
        return new Cat();
    }
}
