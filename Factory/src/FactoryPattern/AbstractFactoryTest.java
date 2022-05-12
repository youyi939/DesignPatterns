package FactoryPattern;

/**
 * @Author: KenChen
 * @Description: 普通工厂模式示例
 * @Date: Create in  2022/5/12 11:48
 */
public class AbstractFactoryTest {


    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteProduct1Factory();
        AbstractFactory factory2 = new ConcreteProduct2Factory();
        Product product = factory1.makeProduct();
        Product product2 = factory2.makeProduct();

        product.show();
        product2.show();
    }

    //    抽象产品类，提供接口方法
    interface Product {
        void show();
    }

    //    具体产品类
    static class ConcreteProduct1 implements Product {

        @Override
        public void show() {
            System.out.println("具体产品1");
        }
    }

    static class ConcreteProduct2 implements Product {

        @Override
        public void show() {
            System.out.println("具体产品2");
        }
    }

    //    抽象工厂接口
    interface AbstractFactory {
        Product makeProduct();
    }

    static class ConcreteProduct1Factory implements AbstractFactory{

        @Override
        public Product makeProduct() {
            System.out.println("工厂1生产--------> 产品1");
            return new ConcreteProduct1();
        }
    }

    static class ConcreteProduct2Factory implements AbstractFactory{

        @Override
        public Product makeProduct() {
            System.out.println("工厂2生产--------> 产品2");
            return new ConcreteProduct2();
        }
    }


}
