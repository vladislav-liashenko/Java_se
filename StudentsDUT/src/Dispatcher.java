import model.Student;
import studentVoenka.Group;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Dispatcher {

    public static void main(String[] args) {
        Student student1 = new Student("Vlad", "Liash", 16, true, "Dut", "Knd");
        Student student2 = new Student("Artem", "Karp", 12, true, "Dut", "Knd");
        Student student3 = new Student("Fedor", "Bold", 17, true, "Dut", "Knd");
        Student student4 = new Student("Illia", "Korzh", 11, true, "Dut", "Knd");
        Student student5 = new Student("Andrey", "Ahulak", 22, true, "Dut", "Knd");
        Student student6 = new Student("Karlson", "Nison", 14, true, "Dut", "Knd");
        Student student7 = new Student("Victor", "Vinchi", 195, true, "Dut", "Knd");
        Student student8 = new Student("Pablo", "Escobar", 195, true, "Dut", "Knd");
        Student student9 = new Student("Vito", "Carleone", 195, true, "Dut", "Knd");
        Student student10 = new Student("Bruce", "Lee", 195, true, "Dut", "Knd");
        Student student11 = new Student("Mr", "Creon", 195, true, "Dut", "Knd");

        Group stGroup = new Group();
        //stGroup.scan();
        stGroup.sortByLastName();

        System.out.println();
        stGroup.add(student1, 1);
        stGroup.add(student2, 2);
        stGroup.add(student3, 3);
        stGroup.add(student4, 4);
        stGroup.add(student5, 5);
        stGroup.add(student6, 6);
        stGroup.add(student7, 7);
        stGroup.add(student8, 8);
        stGroup.add(student9, 9);
        stGroup.add(student10, 10);
        stGroup.add(student11, 11);
        stGroup.del(1);

        stGroup.sortByLastName();
        stGroup.del(10);
        System.out.println(stGroup);


        System.out.println(stGroup.search("Fedor") + " found");

        Student[] recruterArray = stGroup.preziv();
        for (Student student : recruterArray) {
            System.out.println("Come with me my  " + student);
        }


        FileOutputStream fos;
        try {
            fos = new FileOutputStream("file.txt");
            stGroup.txtStuden(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
