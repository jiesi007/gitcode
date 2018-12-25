import java.awt.geom.RoundRectangle2D;

/**
 * Created by jiesi on 2018/12/25.
 */
//简单工厂也有适用不好的时候：比如我们不想修改工厂类，不想增加case，而是想要增加运算类和相应的工厂。
/*简单工厂
public class FactoryModule {
    public static void main(String[] args) {
        LeiFeng oneperson=null;
        oneperson=SimpleFactory.CreateLeiFeng("大学生学雷锋");


    }
}
class LeiFeng{
    public void Sweep(){
        System.out.println("扫地");
    }
    public void Wash(){
        System.out.println("洗衣服");
    }
}
class Undergraduate extends LeiFeng{

}
class Volunteer extends LeiFeng{

}
class SimpleFactory{
    public static LeiFeng CreateLeiFeng(String type){
        LeiFeng result=null;
        switch(type){
            case "大学生学雷锋"
                result=new Undergraduate();
                break;
            case "社会志愿者学雷锋"
                result=new Volunteer();
                break;
        }
        return result;
    }
}


*/
//工厂模式克服了简单的工厂开放封闭原则。

public class FactoryModule {
    public static void main(String[] args) {
        Factory factory=new UndergraduateFactory();
        LeiFeng student=factory.CreateLeiFeng();

        student.Sweep();
        student.Wash();

    }
}
//////////////////多加的工厂类///////////////////
interface Factory{
    LeiFeng CreateLeiFeng();
}
class UndergraduateFactory implements Factory{
    public LeiFeng CreateLeiFeng(){
        return new Undergraduate();
    }
}
class VolunteerFactory implements Factory{
    public LeiFeng CreateLeiFeng(){
        return new Volunteer();
    }
}

/////////////////////////////////////////////
class LeiFeng{
    public void Sweep(){
        System.out.println("扫地");
    }
    public void Wash(){
        System.out.println("洗衣服");
    }
}
class Undergraduate extends LeiFeng{

}
class Volunteer extends LeiFeng{

}

