/**
 * Created by jiesi on 2018/12/24.
 */
public class DecoratorModule {
    public static void main(String[] args) {
        PersonDecoratorModule person = new PersonDecoratorModule();
        person.setName("小明");
/*先实例化person，然后用实例化的xz包装person，然后用ld包装xz.
*   每个装饰类装饰什么功能和如何被调用是分离的。
* */
        FineryDecoratorModule xz = new Suit();//西装
        FineryDecoratorModule ld = new Tie();//领带
        FineryDecoratorModule px=new LeatherShoes();//皮鞋

        xz.setPerson(person);
        ld.setPerson(xz);
        px.setPerson(ld);
/*
        这样写行吗？
        xz.setPerson(person);
        ld.setPerson(person);
        px.setPerson(person);*/
        px.show();

    }
}

  class PersonDecoratorModule {      //被装饰者
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name+" ");
    }
}

 abstract class FineryDecoratorModule extends PersonDecoratorModule{  //抽象装饰类
    private PersonDecoratorModule person;
    public void setPerson( PersonDecoratorModule person){
        this.person=person;
     }
     @Override
    public  void show(){
        if(person!=null){
            person.show();
        }
    }
}
//具体的装饰类


 class Suit extends FineryDecoratorModule {
    @Override
    public void show() {
        super.show();
        System.out.println("西装");
    }
}

class Tie extends FineryDecoratorModule {
    @Override
    public void show() {
        super.show();
        System.out.println("领带");
    }
}

class LeatherShoes extends FineryDecoratorModule {
    @Override

    public void show() {
        super.show();
        System.out.println("皮鞋");
    }
}