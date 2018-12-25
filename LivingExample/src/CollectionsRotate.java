import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jiesi on 2018/11/26.
 */
public class CollectionsRotate {
    public static void main(String []args){
        List list= Arrays.asList("one two three Four five six".split (" "));
        Collections.rotate(list, 3);
        System.out.println("rotate: " + list);
    }
}
