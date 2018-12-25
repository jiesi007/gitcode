/**
 * Created by jiesi on 2018/12/24.
 */

class Component {
    public void Operation(){
        System.out.println("Component");
    }
}

class ConcreteComponent{
    public void Operation(){
        System.out.println("Component");
    }
}

abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component=component;
    }

    public void Opeartor() {
        if (component != null) {
            component.Operation();
        }
//            System.out.println("AAA");

    }
}

class ConcreteDecoratorA extends Decorator {
    public void Opeartor() {
        System.out.println("AAA");
    }
  /*  public void setComponent() {
        System.out.println("子类在这里");
    }*/
}

public class TestDecorator {
    public static void main(String[] args) {
        ConcreteComponent c=new ConcreteComponent();
        ConcreteDecoratorA d1=new ConcreteDecoratorA();
        //d1.setComponent();
    }
}