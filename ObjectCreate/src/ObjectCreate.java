import java.lang.reflect.Constructor;

/**
 * Created by jiesi on 2018/11/26.
 *
 * @author jiesi
 * @version 1.1
 */

public class ObjectCreate {
    public static void main(String[] args) {

    }
}


//
class Student {
    private int id;

    public Student(Integer id) {
        this.id = id;
    }



/*Java类对象创建的时机：若干种方式：*/

    // 方法三：使用Constructor类的newInstance方法(反射机制)
    public static void main(String[] args) throws Exception {
        Constructor<Student> constructor = Student.class.getConstructor(Integer.class);
        Student stu3 = constructor.newInstance(123);//可以调用私有构造函数

    }
}
//方法二 用Class类的newInstance方法（反射机制）

/*
* Student student2=(Student)Class.forName("Student类全限定名").newInstance();
* 或者
* Student stu=Student.class.newInstance();
* */
//方法四 Clone方法创建对象
//无论何时我们调用一个对象的clone方法，JVM都会帮我们创建一个新的、一样的对象，特别需要说明的是，用clone方法创建对象的过程中并不会调用任何构造函数。

class StudentClone implements Cloneable {
    private int id;

    public StudentClone(Integer id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        Constructor<StudentClone> constructor = StudentClone.class.getConstructor(Integer.class);
        StudentClone stu3 = constructor.newInstance(123);
        StudentClone stu4 = (StudentClone) stu3.clone();    //4是3的克隆

    }
}

//方法五   反序列化机制创建对象
//当我们反序列化一个对象时候，JVM会给我们创建一个单独的对象，，造次过程中，并不会调用任何构造函数。为了反序列化一个对象，我们要实现一个Serializable接口，比如说：


/*

在Java对象初始化过程中，主要涉及三种执行对象初始化的结构，分别是 实例变量初始化、实例代码块初始化 以及 构造函数初始化。

总的来说；类实例化的一般过程是：父类的类构造器<clinit>() -> 子类的类构造器<clinit>() -> 父类的成员变量和实例代码块 -> 父类的构造函数 -> 子类的成员变量和实例代码块 -> 子类的构造函数。


//父类
class Foo {
    int i = 1;

    Foo() {
        System.out.println(i);             -----------(1)
        int x = getValue();
        System.out.println(x);             -----------(2)
    }

    {
        i = 2;
    }

    protected int getValue() {
        return i;
    }
}

//子类
class Bar extends Foo {
    int j = 1;

    Bar() {
        j = 2;
    }

    {
        j = 3;
    }

    @Override
    protected int getValue() {
        return j;
    }
}

public class ConstructorExample {
    public static void main(String... args) {
        Bar bar = new Bar();
        System.out.println(bar.getValue());             -----------(3)
    }
}/* Output:
            2
            0
            2

根据上文所述的类实例化过程，我们可以将Foo类的构造函数和Bar类的构造函数等价地分别变为如下形式：

    //Foo类构造函数的等价变换：
    Foo() {
        i = 1;      //最先
        i = 2;      //然后是实例话代码块
        System.out.println(i);
        int x = getValue();
        System.out.println(x);
    }

    //Bar类构造函数的等价变换
    Bar() {
        Foo();
        j = 1;      //最先
        j = 3;      //构造函数
        j = 2       //实例话代码块
    }
---------------------
 *///:~




