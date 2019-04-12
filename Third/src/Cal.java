/**
 * Create by YWM on 2019/4/12.
 */
public class Cal {

    public static int num;

    public static void show(){
        System.out.print("初始化\t"+num+"\t");
    }

    public static void main(String[] args) {
        Cal cal = new Cal();
        Cal.num++;
        num++;
        Cal.show();
        Cal cal2 = new Cal();
        cal2.num++;
        cal2.show();

    }

}
