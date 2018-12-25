import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jiesi on 2018/12/6.
 */
public class SortTest {

    static class A implements Comparable<A> {
        private String name;
        private Integer order;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        @Override
        public String toString() {
            return "name is " + name + " order is " + order;
        }

        @Override

        public int compareTo(A a) {
            return this.order.compareTo(a.getOrder());
        }

    }

    static class B {
        private String name;
        private String order;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        @Override
        public String toString() {
            return "name is " + name + " order is " + order;
        }
    }

    public static void main(String[] args) {

        //第一种方法示例：
        List<String> lists = new ArrayList<String>();
        lists.add("5");
        lists.add("2");
        lists.add("9");
        //lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序
        Collections.sort(lists);

        //第一种方法示例：
        List<A> listA = new ArrayList<A>();
        A a1 = new A();
        a1.setName("a1");
        a1.setOrder(11);
        A a2 = new A();
        a2.setName("a2");
        a2.setOrder(2);
        listA.add(a1);
        listA.add(a2);
        //list中的对象A实现Comparable接口
        Collections.sort(listA);

        System.out.println(lists);
        System.out.println(listA);


        List<B> listB = new ArrayList<B>();
        B b1 = new B();
        b1.setName("b1");
        b1.setOrder("a");
        B b2 = new B();
        b2.setName("b2");
        b2.setOrder("b");
        listB.add(b1);
        listB.add(b2);

        //根据Collections.sort重载方法来实现
        Collections.sort(listB, new Comparator<B>() {
            @Override
            public int compare(B b1, B b2) {
                return b1.getOrder().compareTo(b2.getOrder());
            }
        });

        System.out.println(listB);
    }
}
