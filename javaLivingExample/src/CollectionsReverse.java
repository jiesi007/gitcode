import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by jiesi on 2018/11/24.
 */
public class CollectionsReverse {
    public static void main(String[] args) {
        //        集合反转

        String[] coins = {"A", "B", "C", "D", "E"};
        List l = new ArrayList();
        for (int i = 0; i < coins.length; i++) {
            l.add(coins[i]);
        }

        ListIterator iter = l.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Collections.reverse(l);            //来求reverse
        iter = l.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());


        }
    }
}
