/**
 * @Author: KenChen
 * @Description: 饿汉模式单例
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的
 * 可以直接用于多线程而不会出现问题。
 * @Date: Create in  2022/5/11 11:41
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}
