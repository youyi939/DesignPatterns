import org.junit.Test;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/6/7 下午4:15
 */
public class Client {

    public static void main(String[] args) {
        AbstractSubject subject = new ConcreteSubject();

        AbstractObserver observer = new AbstractObserver() {
            @Override
            public void update() {
                System.out.println("A");
            }
        };

        AbstractObserver observer2 = new AbstractObserver() {
            @Override
            public void update() {
                System.out.println("B");
            }
        };

        AbstractObserver observer3 = new AbstractObserver() {
            @Override
            public void update() {
                System.out.println("C");
            }
        };


        subject.addObserver(observer);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.notification();


        System.out.println("****************************");

        subject.removeObserver(observer2);
        subject.notification();

    }
}
