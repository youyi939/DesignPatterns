package test;

/**
 * @Author: KenChen
 * @Description: 用懒汉式单例模式模拟产生美国当今总统对象
 * @Date: Create in  2022/5/11 11:46
 */
public class SingletonLazy {

    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();    //输出总统的名字
        President zt2 = President.getInstance();
        zt2.getName();    //输出总统的名字
        if (zt1 == zt2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
    }
}

class President {

    private static volatile President instance = null;

    private President() {
        System.out.println("产生一个总统!");
    }

    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有了一个总统，不能产生新总统!");
        }
        return instance;
    }

    public void getName() {
        System.out.println("总统：特朗普大哥");
    }
}


