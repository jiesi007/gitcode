import java.util.Hashtable;

/**
 * Created by jiesi on 2019/1/3.
 */
public class FlyweightModule {
    public static void main(String[] args) {
        WebsiteFactory f = new WebsiteFactory();
        Website fx = f.GetwetsiteCategory("产品展示");
        fx.use();
        Website fy = f.GetwetsiteCategory("产品展示");
        fy.use();
        Website fz = f.GetwetsiteCategory("产品展示");

    }
}

abstract class Website {
    public abstract void use();
}

class ConcreteWebsite {
    public void use() {
        System.out.println();
    }
}

class WebsiteFactory {
    private Hashtable flyweight = new Hashtable();

    public Website GetwetsiteCategory(String key) {
        if (!flyweight.containsKey(key)) {
            flyweight.put(key, new ConcreteWebsite());
        }
        return ((Website) flyweight.keySet());
    }

    public int getwebsiteCount() {
        return flyweight.size();
    }

}


