package studentVoenka;

import comparator.StudentComaparatorByAge;
import comparator.StudentComparatorByName;
import exception.BoundException;
import model.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {

    Scanner sc = new Scanner(System.in);
    private Student[] stGroup = new Student[10];

    public Student[] scan() {

        for (int i = 0; i < stGroup.length; i++) {

            stGroup[i] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean(), sc.next(), sc.next());

        }
        return stGroup;

    }

    public void add(Student h, int posit) {
        if (posit > stGroup.length) {
            try {
                throw new BoundException("Bound exception");
            } catch (BoundException e) {
                e.printStackTrace();
            }

        } else {
            stGroup[posit - 1] = h;
        }
    }


    public Student search(String name) {
        for (Student stud : stGroup) {
            if (stud != null && stud.getName().equals(name)) {
                return stud;

            }
        }
        return null;

    }

    public Student del(int p) {

        for (int i = 0; i <= stGroup.length; i++) {
            if (i == p) {
                stGroup[i - 1] = null;
                break;
            }

        }
        return null;

    }

    @Override
    public Student[] preziv() {
        int count = 0;

        for (int i = 0; i < stGroup.length; i++) {
            if (stGroup[i] != null && stGroup[i].getAge() >= 18 && stGroup[i].getAge() <= 60) {
                count++;
            }
        }

        Student[] reec = new Student[count];
        count = 0;
        for (int i = 0; i < stGroup.length; i++) {
            if (stGroup[i] != null && stGroup[i].getAge() >= 18 && stGroup[i].getAge() <= 60) {
                reec[count] = stGroup[i];
                count++;
            }
        }
        return reec;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stGroup.length; i++) {

            if (stGroup[i] != null) {

                sb.append((i + 1) + "  " + stGroup[i].toString());

            } else {
                sb.append((i + 1) + " " + "Empty");

            }

            sb.append(System.lineSeparator());

        }
        return sb.toString();

    }

    public void sortByLastName() {
        Arrays.sort(this.stGroup, new StudentComparatorByName());
    }

    public void sortByAge() {
        Arrays.sort(this.stGroup, new StudentComaparatorByAge());
    }

    public void txtStuden(FileOutputStream fos) {

        String buffer = this.toString();
        byte[] buf = buffer.getBytes();
        for (byte eachBuffer : buf) {
            try {

                fos.write(eachBuffer);
            } catch (IOException e) {
                System.out.println("exception");
                e.printStackTrace();
            }
        }

    }

}
