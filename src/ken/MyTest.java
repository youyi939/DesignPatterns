package ken;

import java.sql.DriverManager;

/**
 * @Author: KenChen
 * @Description: 静态代码块，构造代码块，构造器代码块执行顺序实验
 * @Date: Create in  2021/6/8 下午5:34
 */
public class MyTest {

    public static void main(String[] args) throws Exception{

        Class.forName("ken.Son").newInstance();
    }

}
