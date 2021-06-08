/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/6/8 下午3:17
 */
public class ManagerA extends Manager {


    public ManagerA(Person person) {
        this.person = person;
    }

    @Override
    public void doCoding() {
        doEarly();
        super.doCoding();
    }

    private void doEarly(){
        System.out.println("经理A处理前期事物");
    }

}
