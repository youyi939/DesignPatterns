/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/6/8 下午3:26
 */
public class ManagerB extends Manager {

    public ManagerB(Person person) {
        this.person = person;
    }

    @Override
    public void doCoding() {
        super.doCoding();
        doEnd();
    }

    private void doEnd(){
        System.out.println("经理B处理后期事物");
    }

}
