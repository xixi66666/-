package 设计模式.工厂模式.工厂方法;

/**
 * @author YangChenxi
 */
public class Fish implements yellable {
    private String name;
    private String sound;

    public Fish() {
    }

    public Fish(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    @Override
    public void yell() {
        System.out.println("gulugulu");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
