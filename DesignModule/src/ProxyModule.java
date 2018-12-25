/**
 * Created by jiesi on 2018/12/25.
 */
public class ProxyModule {
    public static void main(String[] args) {
        Girl jiao = new Girl();
        jiao.setName("fengjiao");
        Proxy dali=new Proxy(jiao);
        dali.Giveapple();
        dali.GiveFlowers();
    }

}
/*
* Pursuit和Proxy代理相似的地方？？
* 应该都有送礼物的三个方法，只不过Proxy送的礼物是Pursuit的买的,两者有相同的方法，所以要提出接口*/

class Girl {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String a) {
        this.name = a;
    }
}

interface GiveGift {
    void Giveapple();

    void GiveFlowers();
}

class Pursuit implements GiveGift {
    Girl girl;

    public Pursuit(Girl mm) {
        this.girl = mm;
    }

    public void Giveapple() {
        System.out.println("apple here~");
    }

    public void GiveFlowers() {
        System.out.println("flowers here~");
    }
}

class Proxy implements GiveGift {    //让代理去实现送礼物的接口
    Pursuit gg;

    public Proxy(Girl mm) {
        this.gg = new Pursuit(mm);   //明白了，这里实际上还是追求者的
    }

    public void Giveapple() {
        gg.Giveapple();
    }

    public void GiveFlowers() {
        gg.GiveFlowers();
    }
}