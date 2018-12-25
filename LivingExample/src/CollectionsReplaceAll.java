
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jiesi on 2018/11/26.
 */
public class CollectionsReplaceAll {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :" + list);
        Collections.replaceAll(list, "one", "hundrea");
        System.out.println("replaceAll: " + list);
    }
}
/*
Arrays类的静态方法返回了一个普通数组的List包装器，(注意不可修改里面的元素)这个方法可以将数组传递给一个期望得到列表或者集合参数的方法。返回的是一个视图对象，可以用get 和set。
aslist方法可以接受可变数目的参数。asList方法可以接受可变数目的参数。
        Collections.nCopies(n,anObject);
        Collections有很多返回集合的方法，Collections.singleton(anObject)返回一个视图对象，对象实现了Set接口，（注意，不可以修改单元素集）
        Set<String>deepThoughts=Collections.empty.Set();



* List list =Arrays.asList("one two three four five six one three four".split(" ");
* System.out.println(list);
* Collections.replaceAll(list,"one","hundrea");将one替换为hundrea
* */