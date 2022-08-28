package 设计模式.工厂模式.抽象工厂;

/**
 * @author YangChenxi
 */
public class 具体工厂_中国 extends HumanFactory {

    @Override
    Country createCountry() {
        return new Country_China();
    }

    @Override
    Food createFood() {
        return new Food_rice();
    }

    @Override
    Language createLanguage() {
        return new Language_Chinese();
    }
}
