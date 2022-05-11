package test;

/**
 * @Author: KenChen
 * @Description: 饿汉单例示例
 * @Date: Create in  2022/5/11 14:52
 */
public class SingletonEager {

    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.getName();

        Person person2 = Person.getInstance();
        person2.getName();

        if (person == person2){
            System.out.println("是同一个人");
        }else {
            System.out.println("不是同一个");
        }
    }

}

class Person{
    private static final Person instance = new Person();

    private Person() {
        System.out.println("选出了一个总统！");
    }

    public static Person getInstance(){
        return instance;
    }

    public void getName(){
        System.out.println("总统是特朗普！");
    }


}