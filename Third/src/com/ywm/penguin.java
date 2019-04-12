package com.ywm;

/**
 * Create by YWM on 2019/4/12.
 */
public class penguin {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 &&age <=10){
            this.age = age;
        }else{
            this.age = 6;
        }
    }

    @Override
    public String toString() {
        return "penguin{" +
                "age=" + age +
                '}';
    }
}
