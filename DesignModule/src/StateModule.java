/**
 * Created by jiesi on 2018/12/26.
 */
public class StateModule {
    public static void main(String[] args) {
       Context c=new Context(new concreteStateA());
       c.request();
       c.request();//不断的请求，同时更改状态。

    }
}

abstract class state {
    public abstract void Handle(Context context);
}


class Context {
    private state state;

    public Context(state state) {
        this.state = state;
    }
    public state getState(){
        return state;
    }
    public void setState(state sta){
        this.state=sta;
    }
    public void request() {
        state.Handle(this);
    }
}
class concreteStateA extends state{
    public  void Handle(Context context){
        context.setState(new concreteStateB());
    }
}
class concreteStateB extends state{
    public  void Handle(Context context){
        context.setState(new concreteStateA());
    }
}
