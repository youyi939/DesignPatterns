/**
 * @Author: KenChen
 * @Description: 客户类
 * @Date: Create in  2022/5/16 15:23
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
        System.out.println(product.toString());
    }

}

//指挥者
class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
