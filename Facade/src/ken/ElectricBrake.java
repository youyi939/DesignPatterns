package ken;

/**
 * @Author: KenChen
 * @Description: 电源总开关
 * @Date: Create in  2021/6/9 下午4:52
 */
public class ElectricBrake {
    private Computer computer = new Computer();
    private Tv tv = new Tv();
    private Fridge fridge = new Fridge();

    public void turnOffAll(){
        computer.turnOffComputer();
        tv.turnOffTv();
        fridge.turnOff();
    }

}
