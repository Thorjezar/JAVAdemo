package com.ywm;

import com.ywm.classdemo.Car;
import com.ywm.classdemo.Student;
import com.ywm.classdemo.Teacher;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car();
            car.age = 6;
            car.brand = "audi";
            car.color = "黑色";
            car.width = 1.8f;
            car.height = 2f;
        Car car2 = new Car("红色",20,"大众",1.8f,1.9f);

        float speed = car.getSpeed(100f,2f);
        float speed2 = car.getSpeed(100f,1.5f);

        System.out.println(car.brand+"-"+car.color+"-时速"+speed);
        car.start("北京");
        System.out.println(car2.brand+"-"+car2.color+"-时速"+speed2);
        car2.start("上海");

        Student student = new Student();
        student.id = 13;
        student.name = "张三";
        student.age = 22;
        student.gender = "男";

        student.show();

        Teacher teacher = new Teacher();
        teacher.Teaching();
        teacher.name = "张老师";
        teacher.age = 35;
        teacher.gender = '男';
        String level = teacher.level(70);
        System.out.println(level);
        System.out.println(teacher);
        teacher.test(teacher);
    }
}
