import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * Created by jiesi on 2018/11/26.
 */
//通过Callable 和Future创建线程


/*
public class CallableThreadTest implements Callable<Integer> {
    public static void main(String[] args) {
        CallableThreadTest ctt = new CallableThreadTest();
        FutureTast<Integer> ft = new FutureTast<>(ctt);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                new thread(ft, "又返回值的线程".start());

            }
        }

        try {
            System.out.println("子线程的返回值为： " + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        @Override
        public Integer call () throws Exception {//作为线程的执行体，有返回值
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);

            }
            return i;

        }
    }
}
*/




/*
* 如果用实现接口的方式，那么还可以继承其他类
* 但是如果用thread的话，就不能了，但方便之处在于不用写currentThread，直接用this指针获得当前线程就行。
* currentthread来实现这个方式
* */