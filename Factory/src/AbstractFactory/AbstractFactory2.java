package AbstractFactory;

/**
 * @Author: KenChen
 * @Description: 抽象工厂模式示例
 * @Date: Create in  2022/5/13 11:42
 */
public class AbstractFactory2 {

    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        Product product1 = factory1.makeProduct1();
        Product product2 = factory1.makeProduct2();
    }


    //抽象工厂
    interface AbstractFactory {
        TestProduct1 makeProduct1();

        TestProduct2 makeProduct2();
    }

    //    具体工厂
    static class ConcreteFactory1 implements AbstractFactory {


        @Override
        public TestProduct1 makeProduct1() {
            System.out.println("具体工厂1生产 产品1");
            return new TestProduct1();
        }

        @Override
        public TestProduct2 makeProduct2() {
            System.out.println("具体工厂1生产 产品2");
            return new TestProduct2();
        }
    }

    //    抽象产品
    interface Product {
        void show();
    }

    //    具体产品
    static class TestProduct1 implements Product {

        @Override
        public void show() {
            System.out.println("具体产品1");
        }
    }

    static class TestProduct2 implements Product {

        @Override
        public void show() {
            System.out.println("具体产品2");
        }
    }
}