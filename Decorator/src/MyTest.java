import org.junit.Test;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/6/8 下午2:41
 */
public class MyTest {

    @Test
    public void test1(){
        Person person = new Employee();
        person = new ManagerA(person);
        person = new ManagerB(person);
        person.doCoding();
    }

}
