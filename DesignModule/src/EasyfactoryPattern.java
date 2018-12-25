import java.io.Console;
import java.util.Scanner;

/**
 * Created by jiesi on 2018/12/19.
 */
public class EasyfactoryPattern {
    public static void main(String[] args) {
        try {
            Operation oper;
            oper = OperationFactory.createOperate("+");
            oper.setNumberA(Integer.valueOf(1));
            oper.setNumberB(Integer.valueOf(2));

            double result=oper.GetResult(oper.getNumberA(),oper.getNumberB());
            System.out.println(result);

        } catch (Exception ex) {
            System.out.println("Error input!");
        }
    }

}


class Operation {
   private double numberA = 0;
   private double numberB = 0;
   private double result = 0;
   double getNumberA() {
       return numberA;
   }

   double getNumberB() {
       return numberB;
   }

   void setNumberA(double numberA) {
       this.numberA = numberA;
   }

   void setNumberB(double numberB) {
       this.numberB = numberB;
   }

   public  double GetResult(double NumberA, double NumberB) {
       return result;
   }
}


class OperationAdd extends Operation {
    double result = 0;

    public double GetResult(double NumberA, double NumberB) {
        result = NumberA + NumberB;
        return result;
    }
}

class OperationSub extends Operation {
    double result = 0;

    public double GetResult(double NumberA, double NumberB) {
        result = NumberA - NumberB;
        return result;
    }
}

class OperationMul extends Operation {
    double result = 0;

    public double GetResult(double NumberA, double NumberB) {
        result = NumberA * NumberB;
        return result;
    }
}

class OperationDiv extends Operation {
    double result = 0;

    public double GetResult(double NumberA, double NumberB) {
        try {
            result = NumberA / NumberB;
            return result;
        } catch (Exception exception) {
            System.out.println("除数不能为0");
        }
        return result;
    }
}

/*
* 简单工厂模式*/
class OperationFactory
{
    public static Operation createOperate(String operate){
        Operation oper=null;
        switch(operate){
            case "+":
                oper=new OperationAdd();
                break;
            case "-":
                oper=new OperationSub();
                break;
            case "*":
                oper=new OperationMul();
                break;
            case"/":
                oper=new OperationDiv();
                break;
        }
        return oper;
    }
}