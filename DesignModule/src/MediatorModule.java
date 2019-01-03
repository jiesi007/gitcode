/**
 * Created by jiesi on 2019/1/3.
 */
public class MediatorModule {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);
        m.colleague(c1);   //让中介者认识各个同事类对象
        m.colleague(c2);

        c1.send("666");
    }
}

abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}

abstract class Colleague {
    protected Mediator mediator;//每个同事间都有一个中介者；

    public Colleague(Mediator mediator) {
        this.mediator = mediator;//得到中介者对象
    }

}

class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void colleague(ConcreteColleague1 colleague) {        //需要了解所有的具体同事对象
        colleague1 = colleague;
    }

    public void colleague(ConcreteColleague2 colleague) {        //需要了解所有的具体同事对象
        colleague2 = colleague;
    }

    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.Notify(message);
        } else {
            colleague1.Notify(message);
        }

    }
}

class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void Notify(String message) {
        System.out.println("同事一得到消息： " + message);

    }

}

class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void Notify(String message) {
        System.out.println("同事二得到消息： " + message);

    }

}