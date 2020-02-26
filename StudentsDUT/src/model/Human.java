package model;

public class Human {

    private String name;
    private String lastName;
    private int age;
    private boolean conviction;


    public Human(String name, String lastName, int age, boolean conviction) {
        super();
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        this.conviction = conviction;
    }

    public Human() {
        super();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getConviction() {
        return conviction;
    }

    public void setConviction(boolean conviction) {
        this.conviction = conviction;
    }

    public void voice() {
        System.out.println("I'm a human!");
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", lastName=" + lastName + ", age=" + age + ", conviction=" + conviction;
    }

}
