import java.util.*;

/**
 * Created by jiesi on 2018/11/24.
 */
public class UnmodifiableList {
    public static void main(String[] argv)
            throws Exception {
        List stuff = Arrays.asList(new String[]{"a", "b"});
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);//这里是只读集合

        try {
            list.set(0, "new value");
        } catch (UnsupportedClassVersionError e) {
        }
        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        Map map = new HashMap();
        map = Collections.unmodifiableMap(map);
    }
}

