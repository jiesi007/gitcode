/**
 * Created by jiesi on 2018/12/26.
 */
public class TestClass {
    public static void main(String[] args) {
        Person a = new Person("jiesi");
        a.getname();
    }
}

class Person {
    private String name;

    Person(String str) {
        this.name = str;
    }

    public String getname() {
        return name;
    }

}
