import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiesi on 2018/12/27.
 */
public class ChainofResponsibility {
    public static void main(String[] args) {
        CommonManager cM = new CommonManager();
        MajorDomo mD = new MajorDomo();
        GeneralManager GM = new GeneralManager();
        cM.setSuperior(mD);             //设置上级
        mD.setSuperior(GM);

        Request request =new Request();
        request.setRequestContent("qingjia");
        request.setRequesttype("jianhuiqingjai ");
        request.setNumber(1);
        cM.RequestApplications(request);

    }
}

abstract class Manager {
    protected Manager manager;

    public void setSuperior(Manager g1) {
        this.manager = g1;
    }

    public abstract void RequestApplications(Request request);

}

class CommonManager extends Manager {
    public void RequestApplications(Request request){

    }
}

class MajorDomo extends Manager {
    public void RequestApplications(Request request){

    }
}

class GeneralManager extends Manager {
    public void RequestApplications(Request request){

    }
}

class Request {
    private String requesttype;
    private String requestContent;
    private int number;

    public void setRequesttype(String rq) {
        this.requesttype = rq;
    }

    public void setRequestContent(String rq) {
        this.requestContent = rq;
    }

    public void setNumber(int ss) {
        this.number = ss;
    }

}