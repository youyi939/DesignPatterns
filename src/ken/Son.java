package ken;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/6/8 下午5:32
 */
public class Son extends Parent{
    static {
        System.out.println("son的静态代码块");
    }

    {
        System.out.println("son的构造代码块");
    }

    public Son() {
        super();
        System.out.println("son的构造器代码");
    }
}
