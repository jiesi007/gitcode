import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiesi on 2018/12/27.
 */
public class ComponentMOdule {
    public static void main(String[] args) {
        Composite root=new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
        Composite comp=new Composite("Composite X");
        comp.add(new Leaf("Leaf XA:)"));
        comp.add(new Leaf("Leaf XA:)"));
        root.add(comp);

        Composite comp2=new Composite("Composote XY");
        comp2.add(new Leaf("Leaf XYA:)"));
        comp2.add(new Leaf("Leaf XYB:)"));
        comp.add(comp);
        root.Display(1);

    }
}


/*Component 对象声明接口，在适当的情况下实现所有类共有接口的默认行为，声明一个接口用于访问和管理的子部件。
Leaf代表叶节点对象。    Composite 定义有支节点行为，用来存储子部件。在Component接口中实现与子部件有关的操作。
* */
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
        super(name);//如果超类中是有参的构造函数，则
    }
    public void add(Component c){

    }
    public void Remove(Component c){

    }
    public void Display(int depth){
        System.out.println("depth"+name);
    }
}
class Composite extends Component{
    private List<Component> child =new ArrayList<Component>();
    public Composite(String name){
        super(name);
    }
    public void add(Component c){

    }
    public void Remove(Component c){

    }
    public void Display(int depth){
        for(Component component : child){
            component.Display(depth+2);
        }
    }

}