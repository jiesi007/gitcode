import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by jiesi on 2018/11/24.
 */
public class HashSetDelete {
    //集合删除
    public static void main(String[] args) {

        HashSet collection = new HashSet();
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";

        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);

        Iterator iterator = collection.iterator();
        while (iterator.hasNext())

        {
            System.out.println(iterator.next() + " ");
        }

        collection.remove(str2);

        iterator = collection.iterator();//相当于复原了
        while (iterator.hasNext())

        {
            System.out.println(iterator.next() + " ");
        }


        int size = collection.size();

    }
}
