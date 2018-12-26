import java.lang.invoke.SwitchPoint;

/**
 * Created by jiesi on 2018/12/26.
 */
public class AbstractFactoryModule {

    public static void main(String[] args) {
        User user = new User();
        iFactory factory=new SqlserverFactory();//这里是工厂方式的写法奥～～
        iUser userA=factory.CreateUser();
        userA.insert(user);
        userA.getUser(1);

//        SqlserverUser su = new SqlserverUser();   //su是不是被固定死了？？
//        su.insert(user);
//        su.getUser(1);
    }
}


class User {
    private int id;
    public int ID;
    private String name;
//    public void
}

interface iUser {
    void insert(User user);

    User getUser(int id);
}

class SqlserverUser implements iUser {
    public void insert(User user) {
        System.out.println("SqlserverUser 增加记录");
    }

    public User getUser(int id) {
        System.out.println("SqlserverUser 得到记录");
        return null;
    }
}

class AccessUser implements iUser {
    public void insert(User user) {
        System.out.println("AccessUser 增加记录");
    }

    public User getUser(int id) {
        System.out.println("AccessUser 得到记录");
        return null;
    }
}


interface iFactory {
    iUser CreateUser();//接口中还有接口，定义了一个创建访问User表对象的抽象的工厂接口
}

class SqlserverFactory implements iFactory {
    public iUser CreateUser() {
        return new SqlserverUser();
    }
}

class AccessFactory implements iFactory {
    public iUser CreateUser(){
        return new AccessUser();
    }
}
