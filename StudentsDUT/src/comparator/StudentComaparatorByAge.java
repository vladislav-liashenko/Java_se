package comparator;

import model.Student;

import java.util.Comparator;

public class StudentComaparatorByAge implements Comparator {

    public int compare(Object o1, Object o2) {
        int result = NullComparator.checkNull(o1, o2);
        if (result == NullComparator.NOT_NULL) {
            Student a = (Student) o1;
            Student b = (Student) o2;


            if (a.getAge() > b.getAge()) {
                result = 1;
            }
            if (a.getAge() < b.getAge()) {
                result = -1;
            }
            if (a.getAge() == b.getAge()) {
                result = 0;
            }
        }
        return result;

    }

}
