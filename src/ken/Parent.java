package ken;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/6/8 下午5:30
 */
public class Parent {
    static {
        System.out.println("parent的静态代码块");
    }
    {
        System.out.println("parent的构造代码块");
    }

    public Parent() {
        System.out.println("parent的构造器代码");
    }
}
