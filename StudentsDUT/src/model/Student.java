package model;

import model.Human;

import java.util.Scanner;

public class Student extends Human {

    Scanner sc = new Scanner(System.in);
    private String univer;
    private String group;


    public Student(String name, String lastName, int age, boolean conviction, String univer, String group) {
        super(name, lastName, age, conviction);
        this.univer = univer;
        this.group = group;
    }

    public Student() {
        super();
    }

    public String getUniver() {
        return univer;
    }

    public void setUniver(String univer) {

        this.univer = univer;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public void voice() {
        System.out.println("I'm a Student");
    }

    @Override
    public String toString() {

        return "Student" + "[" + super.toString() + " ,univer= " + univer + " , group= " + group + "]";

    }
}
