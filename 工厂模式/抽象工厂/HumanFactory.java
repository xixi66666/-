package 设计模式.工厂模式.抽象工厂;

/**
 * @author YangChenxi
 */
public abstract class HumanFactory {
    abstract Country createCountry();
    abstract Food createFood();
    abstract Language createLanguage();
}
