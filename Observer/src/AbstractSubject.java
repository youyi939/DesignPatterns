/**
 * @Author: KenChen
 * @Description:    抽象主题角色
 * @Date: Create in  2021/6/7 下午4:09
 */
public interface AbstractSubject {

    public void addObserver(AbstractObserver observer);
    public void removeObserver(AbstractObserver observer);
    public void notification();
}
