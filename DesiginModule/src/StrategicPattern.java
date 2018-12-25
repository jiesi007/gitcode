/**
 * Created by jiesi on 2018/12/19.
 */

/*public class StrategicPattern {
    public static void main(String[] args) {
        Person xc = new Person("jiesi");
        Finery dx=new Tshirt();
        Finery kk=new BigTshirt();

        dx.show();
        kk.show();
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }
//    public

}

abstract class Finery {
    public abstract void show();
}

class Tshirt extends Finery {
    public void show()
    {
        System.out.println("Tshirt");
    }
}

class BigTshirt extends Finery {
    public void show()
    {
        System.out.println("BIGThirt");
    }
}*/
public class StrategicPattern {
    public static void main(String[] args){
        Person xc=new Person("xioacai");

    }
}

 class Person{
    public Person(){}
    private String name;
    public Person(String name){
        this.name=name;
    }
    public void show(){
        System.out.println(name);
    }
}

//相当于那个Decorate
abstract class Finery extends Person{
    protected Person component;
    public void Decorate(Person component){
        this.component=component;
    }
    @Override           //看看是哦福合理
    public void show(){
        if(component!=null){
            component.show();
        }
    }
}

class Tshirt extends Finery{
    public void show(){
        super.show();
        System.out.println(" wear Tshirt");
    }
}

