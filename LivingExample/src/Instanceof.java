/**
 * Created by jiesi on 2018/12/7.
 */
interface A {
}

class B implements A {

}

class C extends B {
}

public class Instanceof {

    public static void main(String[] args) {
        A a = null;
        B b = null;
        boolean res;
        System.out.println("instanceoftest test case 1: ------------------");
        res = a instanceof A;
        System.out.println("a instanceof A: " + res);
        res = b instanceof B;
        System.out.println("b instanceof B: " + res);
        System.out.println("/ninstanceoftest test case 2: ------------------");
        a = new B();
        b = new B();

        res = a instanceof A;//
        System.out.println("a instanceof A: " + res);

        res = a instanceof B;
        System.out.println("a instanceof B: " + res);

        res = b instanceof A;
        System.out.println("b instanceof A: " + res);

        res = b instanceof B;//
        System.out.println("b instanceof B: " + res);


        B b2 = (C) new C();

        res = b2 instanceof A;
        System.out.println("b2 instanceof A: " + res);

        res = b2 instanceof B;
        System.out.println("b2 instanceof B: " + res);

        res = b2 instanceof C;
        System.out.println("b2 instanceof C: " + res);

    }
}


