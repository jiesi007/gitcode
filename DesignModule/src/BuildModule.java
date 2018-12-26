import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiesi on 2018/12/25.
 */
public class BuildModule {
    public static void main(String[] args) {
        Boss laoban = new Boss();
        StockObserver tongshi1 = new StockObserver("薛松源", laoban);
        laoban.Attach(tongshi1);
        laoban.Notify();

    }
}



//接口
interface Subject {
    void Attach(Observer observers);//增加

    //void Detach();//减少
    void Notify();
    //String Subject();
}

class Boss implements Subject {
    private String action;
    private List<Observer> observer = new ArrayList<Observer>();

    public void Attach(Observer observers) {
        observer.add(observers);
    }

    public void Notify() {
        for (Observer a : observer) {
            a.Update();
        }
    }
}

//抽象类
abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void Update();
}

class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    public void Update() {
        System.out.println("继续工作");
    }
}