/**
 * Created by jiesi on 2018/12/27.
 */
public class SingletonModule {

}

class Singleton {
    // 懒汉式,这样是线程不安全的；
//    private static Singleton instance;
//
//    private Singleton() {//构造方法让其为private，这样外界就不能用new出来了
//
//    }
//
//    public static Singleton getInstance() {
//        //懒汉模式
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
    //线程安全的双重加锁方法
    private static Singleton instance;
    private static Object syncRoot = new Object();

    public static void getInstance() {
        if (instance == null) {             //判断以免重复加锁
            synchronized (syncRoot) {
                if (instance == null) {         //判断对象是否存在
                    instance=new Singleton();
                }
            }
        }
    }


}

/*    // 饿汉式,就是直接生成
    private static final Singleton instance = new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
    return instance;
    }

    */

