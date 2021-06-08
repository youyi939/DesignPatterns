/**
 * @Author: KenChen
 * @Description: 被装饰对象
 * @Date: Create in  2021/6/8 下午3:09
 */
public class Employee implements Person {

    @Override
    public void doCoding() {
        System.out.println("敲代码");
    }
}
