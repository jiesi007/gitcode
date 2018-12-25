/**
 * Created by jiesi on 2018/12/25.
 */
//简单工厂最大有点在于
public class FactoryModule {
    public static void main(String[] args) {
        Factory operFactory = new AddFactory();
        Operation oper=operFactory.CreateOperation();
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result=oper.GetResult(oper.getNumberA(),oper.getNumberB());
        System.out.println(result);

    }
}

interface Factory {
    Operation CreateOperation();

}

class AddFactory implements Factory {
    public Operation CreateOperation()
    {
        return new OperationAdd();
    }
}