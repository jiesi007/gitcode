//package synch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jiesi on 2018/11/10.
 */
public class InputTest {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name=in.nextLine();
//        System.out.println("Hello: "+name);

//        double x=10000.0/3;
//        System.out.printf("%8.2f",x);//小数点后两位;每个以%字符开始的格式说明符都用相应的参数替换；
//        System.out.println();
//        Scanner in1=new Scanner(System.in);
//        System.out.print("Select an option(1,2,3,4)");
//        int choice=in1.nextInt();
//        switch(choice)
//        {
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//
//        }
//        InputTest p=new InputTest();
//        String message="The current position is "+p;
//        System.out.println(message);//可以输出类名和散列码；
//
//        String a="abc";
//        char tmp=a.charAt(1);

        //System.out.println(tmp);

//        Collection<String> c=new ArrayList<String>();
//        c.add("hello");
//        c.add("world");
//        Iterator<String>iter=c.iterator();
//        iter.next();
//        iter.remove();
//        System.out.println(c);

//        /*p356*/
//        List<String> staff = new LinkedList<>();
//        staff.add("Amy");
//        staff.add("Bob");
//        staff.add("Carl");
//        Iterator<String> iter = staff.iterator();
//        String first = iter.next();
//        String second = iter.next();
//        iter.remove();//直接就删除了第二个元素啦～～～，这种链表删除元素好轻松有没有啊～～～；
//        System.out.println(staff);
//        boolean flag = staff.contains("Bob");
//        System.out.println(flag);
//        /*p357*/
//        List<String> staff1 = new LinkedList<>();
//        staff1.add("Amy");
//        staff1.add("Bob");
//        staff1.add("Carl");
//        ListIterator<String> iter1 = staff1.listIterator();//listIterator方法返回了一个实现了LisIterator
//        iter1.next();
//        iter1.add("JUliet");
//        /*p372*/
//
//
        System.out.println("case1：     ");
        Map<String, Employee> staff = new HashMap<>();
        staff.put("3214",new Employee("jiesi"));
        staff.put("2314",new Employee("jianhui"));
        staff.put("1243",new Employee("laosiji"));

        //print all entries
        System.out.println(staff);
        //System.out.println();
        //remove an entry
        staff.remove("2314");
        //replace
        staff.put("1243",new Employee("laosiji.."));
        ///////

        //p225  对象克隆
        System.out.println("case2：     ");
        Employee original=new Employee("jiesi");
        //653   synchronized关键字
        //682
        Employee e;
        e=new Employee("jiesi");
        System.out.println(e.getClass().getName()+" ");
        //195

        //


    }


}

class Employee
{
    private static int nextId=1;
    private String name;
    private double salary;
    private int id;
    public Employee(String n){
        name =n;
        salary=100;
        id=0;
    }
    public static int getNextId()
    {
        return nextId;
    }
    public static void main(String[] args){//注意Employee类也有一个静态的main方法用于单元测试；
    //试试运行java Employee 和 java inputTest;执行两个方法

        Employee e=new Employee("Harry");
        System.out.println();
    }



}

class Bank
{
    private final double[]accounts;
    private Lock bankLock;
    private Condition sufficientFunds;
    public Bank(int n,double initialBalance)
    {
        accounts=new double[n];
        Arrays.fill(accounts,initialBalance);
        bankLock=new ReentrantLock();//获得一个可重入锁
        sufficientFunds=bankLock.newCondition();//获得一个条件对象
    }

    public void transfer(int from,int to, double amount)throws InterruptedException{
        bankLock.lock();//先将这加锁
        try
        {
            while(accounts[from]<amount)
               sufficientFunds.await();
            accounts[from]-=amount;
            accounts[to]+=amount;
            sufficientFunds.signalAll();//解除所有等待线程的阻塞

        }
        finally {
            bankLock.unlock();
        }
    }

    public double getTotalBalance()
    {
        bankLock.lock();
        try{
            double sum=0;
            for(double a:accounts)
                sum+=a;
            return sum;
        }
        finally
        {
            bankLock.unlock();
        }
    }
}



