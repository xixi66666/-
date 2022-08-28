package 设计模式.工厂模式.抽象工厂;

/**
 * @author YangChenxi
 */
public class test {
    public static void main(String[] args) {
        HumanFactory china = new 具体工厂_小日本();
        Food food = china.createFood();
        Language language = china.createLanguage();
        Country country = china.createCountry();
        food.defineFood();
        System.out.println(china.toString());
    }
}
