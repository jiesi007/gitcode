/**
 * Created by jiesi on 2018/11/14.
 */
//   toString的用法一：object方法，你写的每个类都继承该方法，但是一般上他不会满足需求
class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

//    public String toString() {
//        return "I'm a Villain and my name is " + name;
//    }
}

public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

//    public String toString() {
//        return "Orc" + orcNumber + ":" + super.toString();
//    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}