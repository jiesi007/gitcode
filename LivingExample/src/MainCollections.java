/**
 * Created by jiesi on 2018/11/23.
 */

import java.util.*;
/*请注意：
                            轻量级集合包装器：
* Collections类包含很多实例化方法:(注意不和和collection接口混淆)
* 个人总结
* 1.Collections.rotate    //转换
* 2.Collections.replaceAll//代替整个集合
* 3.Collection.nCopies(100,"DEFAULT");//创建一个包含100个字符的List,每个字符串都被设置为"DEFAULT"
* 4.Collections.emptySet();//
* 5.Collections.reverse(...,3);//集合在制定位置（例如3）反转；
*/

public class MainCollections {
    public static void main(String[] args) {


        Hashtable ht = new Hashtable();
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Threee");
        Enumeration e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());

        }

        Enumeration e2 = ht.elements();
        while (e2.hasMoreElements()) {
            System.out.println(e2.nextElement());
        }

        Map map1 = new HashMap();
        map1.put("key1", "JJ");
        map1.put("key2", "KK");
        map1.put("key3", "LL");
        map1.put("key4", "MM");
        displayAll(map1.keySet());

        SortedMap map2 = new TreeMap();

        LinkedHashMap map3 = new LinkedHashMap();
////////////////////////////////////////////////////////////
        List lnkLst = new LinkedList();

        List aryLst = new ArrayList();

        Set hashSet = new HashSet();

        SortedSet treeSet = new TreeSet();

    }

    static void displayAll(Collection col) {
        Iterator iter = col.iterator();
        while (iter.hasNext()) {
            System.out.println((String) iter.next() + " ");
        }
        System.out.println();
    }
}


/*
* 同步视图：
* 在Java中我们用视图机制来确保常规集合的线程安全
* Map<String,Employee>map=Collections.synchronizedMap(new Hashmap<String,Employee>);
* 上面的方法就可以让我们多线程访问视图了
* */
