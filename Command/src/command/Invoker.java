package command;

/**
 * @Author: KenChen
 * @Description: 调用者，负责调用命令
 * @Date: Create in  2021/6/15 下午4:45
 */
public class Invoker {
    private Command command = new MyCommand();


    public void action(){
        System.out.println("服务员拿着订单去后厨找厨子，让他做菜");
        command.exe();
    }
}
