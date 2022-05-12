package SimpleFactory;

/**
 * @Author: KenChen
 * @Description: 简单工厂模式示例
 * @Date: Create in  2022/5/11 17:52
 */
public class Client {

    public static void main(String[] args) {
        Product product1 = SimpleFactory.makeProduct(Const.PRODUCT_A);
        Product product2 = SimpleFactory.makeProduct(Const.PRODUCT_B);

        product1.show();
        product2.show();
    }

    //    抽象产品
    public interface Product {
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

    final class Const{
        static final int PRODUCT_A = 1;
        static final int PRODUCT_B = 2;
    }


//    工厂类
    static class SimpleFactory{
        public static Product makeProduct(int kind){
            switch (kind){
                case 1:
                    return new ConcreteProduct1();
                case 2:
                    return new ConcreteProduct2();
                default:
                    break;
            }
            return null;
        }
    }

}
