/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/6/8 下午3:16
 */
public abstract class Manager implements Person{
    Person person;

    public void doCoding(){
        person.doCoding();
    }

}
