import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiesi on 2018/11/26.
 */
public class CollectionToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        String[] s1 = list.toArray(new String[0]);//这里是一个方法
        //将集合转为String类型的数组

        for(int i=0;i<s1.length;i++){
            String contents=s1[i];
            System.out.println(contents);
        }
    }
}
