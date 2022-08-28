package 设计模式.工厂模式.工厂方法;

public class test {
    public static void main(String[] args) {
        yellable pet1 = new CatFactory().CreateCat();
        yellable pet2 = new DogFactory().CreateDog();
        yellable pet3 = new FishFactory().create();
        pet3.yell();
        pet1.yell();
        pet2.yell();
    }
}
