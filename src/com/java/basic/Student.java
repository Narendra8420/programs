package com.java.basic;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private  int id;
    private String name;
    private String address;

    public Student(int id, String name, String address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public static void main(String[] args) {

        List<Student> list= new ArrayList();
        Student s1= new Student(100, "Narendra", "Awb");
        Student s2= new Student(101, "vijay","Parli");
        List<Integer> list1= new ArrayList<>();
        list1.add(121);
        list1.add(121);
        System.out.println(list1);

        list.add(s1);
        list.add(s2);
        for (int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        Object obj= list.size();
        System.out.println(obj);

//        System.out.println(s1);
  //      System.out.println(s2);
    }
    public String toString()
    {
        return "Student id: "+id+"\n  Student Name:  "+name+"" +
                "\n  Student Address:  "+address;
    }

}
