/**
 * @Author: KenChen
 * @Description: 懒汉模式 单例
 * 注意：如果编写的是多线程程序，则不要删除上例代码中的关键字
 * volatile 和 synchronized，否则将存在线程非安全的问题。
 * 如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，
 * 会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
 * @Date: Create in  2022/5/11 11:37
 */
public class LazySingleton {

    //保证 instance 在所有线程中同步
    private static volatile LazySingleton instance = null;

    //private 避免类在外部被实例化
    private LazySingleton() {
    }

    //getInstance 方法前加同步
    public static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
