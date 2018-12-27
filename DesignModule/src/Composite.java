/**
 * Created by jiesi on 2018/12/27.
 */
public class Composite {
    public static void main(String[] args) {

    }
}

abstract class Component{
    protected String name;
    public Component(String name){
        this.name=name;
    }
    public abstract void add(Component c);//这是用来增加叶子节点的方法
    public abstract void Remove(Component c);
    public abstract void Display(int depth);
}
class Leaf extends Component{   //代表叶子节点对象，叶节点没有子节点
    public Leaf(String name){
        super(name);
    }
    public void add(Component c){

    }
    public void Remove(Component c){

    }
    public void Display(int depth){

    }
}