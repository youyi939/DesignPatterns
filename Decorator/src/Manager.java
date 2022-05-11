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

    public static void main(String[] args) throws Exception {
        ClassLoader loader1=String.class.getClassLoader();
        ClassLoader loader2=Manager.class.getClassLoader().getParent();
        Class<Manager> clz1= (Class<Manager>) loader2.loadClass("Manager");
        Class<Manager> clz2= (Class<Manager>)Class.forName("Manager");

        Thread.currentThread().getContextClassLoader();

        System.out.println(clz1==clz2);
    }

}
