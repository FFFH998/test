package com.briup.jd1911;

public class hello {
    private String name;
    private int age;

    public hello(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "hello{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        String s = "第一次使用";
        int s2=1;
        System.out.println(s);
        /*

         */
        /**
         *
         */

    }
}
