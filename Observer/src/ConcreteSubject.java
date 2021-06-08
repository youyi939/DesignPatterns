import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: KenChen
 * @Description: 具体主题角色
 * @Date: Create in  2021/6/7 下午4:11
 */
public class ConcreteSubject implements AbstractSubject {
    List<AbstractObserver> list = new ArrayList<AbstractObserver>();

    @Override
    public void addObserver(AbstractObserver observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(AbstractObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notification() {
        for (AbstractObserver observer : list){
            observer.update();
        }
    }
}
