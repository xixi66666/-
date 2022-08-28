package 设计模式.观察者模式;

/**
 * @author YangChenxi
 * Observer : 抽象观察者
 * 拿微信公众号来举例，假设微信用户就是观察者，
 * 微信公众号是被观察者，有多个的微信用户关注了程序猿这个公众号，
 * 当这个公众号更新时就会通知这些订阅的微信用户。
 */
public interface Observer {
    public void update(String massage);
}
