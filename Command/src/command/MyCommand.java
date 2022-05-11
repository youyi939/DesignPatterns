package command;

/**
 * @Author: KenChen
 * @Description: command类的实现类
 * @Date: Create in  2021/6/15 下午4:43
 */
public class MyCommand implements Command {

    private Receiver receiver  = new Receiver();


    @Override
    public void exe() {
        System.out.println("厨师接收到订单，准备开始做菜");
        this.receiver.action();
    }
}
