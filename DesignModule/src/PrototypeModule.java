import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by jiesi on 2018/12/25.
 */
public class PrototypeModule {
    public static void main(String[] args) {

        Resume a = new Resume("p1");
        a.SetBaseInfo("男", "p1");
        a.SetWorkInfo("2000-2010", "meituan");

    }

}

class Resume implements Cloneable{
    private String name;
    private String sex;
    private String timeArea;
    private String company;
    public Resume(String name){
        this.name=name;
    }
    public void SetBaseInfo(String sex,String name){
        this.name=name;
        this.sex=sex;
    }
    public void SetWorkInfo(String timeArea,String company){
        this.timeArea=timeArea;
        this.company=company;
    }
}

/*
abstract class Prototype{
    private String id;
    public Prototype(String id){
        this.id=id;
    }
    public String getid(){
        return id;
    }
    public abstract Prototype Clone();
}

class ConcretePrototype1 extends Prototype{
    public ConcretePrototype1(String id) {
        super(id);

    }
    public Prototype Clone(){
     //   return this.MemberwiseClone();???
    }
}
*/
