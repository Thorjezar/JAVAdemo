/**
 * Create by YWM on 2019/4/12.
 */
public class Student {
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name;
    private int age;

    public int getAge(){
        return this.age;
    }

    static  {
        System.out.println("这是代码块儿");
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("输入的年龄有误,已初始化");
            this.age = 16;
        }else
        {
            this.age = age;
        }

    }

    public void show(){
        System.out.println("学生信息如下");
        System.out.print("编号："+id);
        System.out.print("姓名："+name);
        System.out.print("年龄："+age);
    }
}
