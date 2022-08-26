package 设计模式.工厂模式.简单工厂;

public class test {
    public static void main(String[] args) {
        yellable pet1 = new CatFactory().CreateCat();
        yellable pet2 = new DogFactory().CreateDog();
        pet1.yell();
        pet2.yell();
    }
}
