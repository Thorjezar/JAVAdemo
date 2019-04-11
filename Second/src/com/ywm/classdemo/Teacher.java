package com.ywm.classdemo;


/**
 * Create by YWM on 2019/4/9.
 */
public class Teacher {

    public String name;
    public int age;
    public char gender;

    public void Teaching(){
        System.out.println("老师上了一节课");
    }
    public String level(int score) {
        /*
         * score >= 90 优秀
         * 80 <=score<90 良好
         * 60 <=score<80 中等
         * score<60 差
         * */
        String result = "差";
        if (score >= 90) {
            result = "优秀";
        } else {
            if (score >= 80) {
                result = "良好";
            } else {
                if (score >= 60) {
                    result = "中等";
                }
            }
        }
      return result;
    }

    public Teacher(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Teacher() {

    }

    public void test(Teacher teacher){
        teacher = new Teacher();
        System.out.println(teacher);
    }

//    @Override
/*    public String toString() {
        return "Teacher{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }*/

    //    GC.currentLatencyTarget()
}