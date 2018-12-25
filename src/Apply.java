/**
 * Created by jiesi on 2018/12/18.
 */

//import static net.mindview.util.Print.*;
/*
* 完全解耦
* apply的process本来可以接受任何的processor，
* */

class Process{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}

class Upcase extends Process {
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}


public class Apply {
    public static void process(Process p, Object s) {
        System.out.println("Using Pricessor " + p.name());
        System.out.println(p.process(s));
    }
        public static String s="Disagreement with beliefs is by definition incorrect";

        public static void main(String []args){
            process(new Upcase(),s);
    }

}
