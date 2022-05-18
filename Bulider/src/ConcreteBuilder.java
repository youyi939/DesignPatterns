/**
 * @Author: KenChen
 * @Description: 具体建造者等相关对象
 * @Date: Create in  2022/5/17 10:03
 */

//具体建造者，实现抽象建造者的方法
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("建造partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造partC");
    }
}

//抽象建造者，包含创建产品各个子部件的抽象方法
abstract class Builder {
    Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }

}

//产品角色，包含多个组成部件的复杂对象
class Product {

    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        //        显示产品特性
        System.out.println("产品构建完成");
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}
