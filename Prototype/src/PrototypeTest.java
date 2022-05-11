/**
 * @Author: KenChen
 * @Description: 原型模式示例
 * Java 中的 Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆
 * 这里的 Cloneable 接口就是抽象原型类。
 * @Date: Create in  2022/5/11 16:08
 */
//原型模式的测试类
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println(obj1==obj2);
    }

}

//具体原型类
class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("具体原型创建成果");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("具体原型复制成功");
        return (Realizetype)super.clone();
    }

}