package 设计模式.工厂模式.工厂方法;

public class Cat implements yellable{
    private String name;
    private String sound;
    public void yell(){
        System.out.println("cccccccccc");
    }
    public Cat(){

    }

    public Cat(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
