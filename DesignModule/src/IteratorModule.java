import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiesi on 2018/12/27.
 */
//提供一种方法顺序访问一个聚合对象中各个元素，而不暴露内部表示
public class IteratorModule {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.setItems("passenger1");
        a.setItems("passenger2");
        a.setItems("passenger3");

        Iterator i = new ConcreteIterator(a);
        Object item = i.First();
        while (!i.isdone()) {
            System.out.println(i.CurrentItem()+" 请买票！");
            i.Next();
        }
    }
}
abstract class Aggregate {
    public abstract Iterator CreateIterator();//关联迭代器，就是有这个数据的意思。
}

class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<Object>();

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
    public int Count(){
        return items.size();
    }
    public Object getItems(int index){
        return items.get(index);
    }
    public void setItems(Object item){
        items.add(item);
    }
}


abstract class Iterator {
    public abstract Object First();

    public abstract Object Next();

    public abstract boolean isdone();

    public abstract Object CurrentItem();
}

class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;//定一个具体的聚集对象
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Object First() {
        return aggregate.getItems(0);
    }

    public Object Next() {
        Object ret=null;
        current++;
        if(current<aggregate.Count()){
            ret=aggregate.getItems(current);
        }
        return ret;
    }

    public boolean isdone() {
        return current>=aggregate.Count()?true:false;
    }

    public Object CurrentItem() {
        return aggregate.getItems(current);
    }

}