/**
 * Created by jiesi on 2018/11/20.
 */
public class TestBean extends BaseBean {
    private int id;
    private  int getid(){
        return id;
    }
    private void setid(int id){
         this.id=id;
    }
    public static void main(String[] args){
        TestBean testBean=new TestBean();
        testBean.setid(9);
        System.out.println(testBean.toString());

//        Date date=new Date();
//        System.out.println(date.toString());
//
//        Date dNow = new Date( );
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
//
//        System.out.println("当前时间为: " + ft.format(dNow));

//
//        Date date=new Date();
//        //b的使用，月份简称
//        String str=String.format(Locale.US,"英文月份简称：%tb",date);
//        System.out.println(str);
//        System.out.printf("本地月份简称：%tb%n",date);
//
//        //B的使用，月份全称
//        str=String.format(Locale.US,"英文月份全称：%tB",date);
//        System.out.println(str);
//        System.out.printf("本地月份全称：%tB%n",date);
//        //a的使用，星期简称
//        str=String.format(Locale.US,"英文星期的简称：%ta",date);
//        System.out.println(str);
//        //A的使用，星期全称
//        System.out.printf("本地星期的简称：%tA%n",date);
//        //C的使用，年前两位
//        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n",date);
//        //y的使用，年后两位
//        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n",date);
//        //j的使用，一年的天数
//        System.out.printf("一年中的天数（即年的第几天）：%tj%n",date);
//        //m的使用，月份
//        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n",date);
//        //d的使用，日（二位，不够补零）
//        System.out.printf("两位数字的日（不足两位前面补0）：%td%n",date);
//        //e的使用，日（一位不补零）
//        System.out.printf("月份的日（前面不补0）：%te",date);


//        try {
//            System.out.println(new Date( ) + "\n");
//            Thread.sleep(1000*3);   // 休眠3秒,有意思，这个直接让编译器💤。。。
//            System.out.println(new Date( ) + "\n");
//        } catch (Exception e) {
//            System.out.println("Got an exception!");
//        }




    }
}

