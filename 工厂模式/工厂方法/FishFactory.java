package 设计模式.工厂模式.工厂方法;

/**
 * @author YangChenxi
 */
public class FishFactory {
    /*
    返回类型也可以是yellable
     */
    public yellable create(){
        System.out.println("fish was created!");
        return new Fish();
    }

}
