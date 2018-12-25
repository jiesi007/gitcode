import java.util.*;

/**
 * Created by jiesi on 2018/12/6.
 */
public class IteratorTest {
    public static void main(String []args) {

        Map<Integer,String> map=new HashMap();
        map.put(1,"jiesi");
        map.put(2,"google");
        map.put(3,"apple");
        displayMap(map);


        List <Integer> array=new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(4);
        displayAll(array);





    }


    static void displayMap(Map map){
        Iterator iter=map.keySet().iterator();
        while(iter.hasNext()){
            Integer id=(Integer)iter.next();
            System.out.println(id+" ");
        }
    }

    static void displayAll(Collection e){
        Iterator iter=e.iterator();
        while(iter.hasNext()){
            Integer id=(Integer)iter.next();
            System.out.println(id+" ");
        }
    }
}


