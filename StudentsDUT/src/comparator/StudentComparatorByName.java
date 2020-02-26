package comparator;

import model.Student;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator {

    public StudentComparatorByName() {
        super();

    }

    @Override
    public int compare(Object o1, Object o2) {
        int result = NullComparator.checkNull(o1, o2);
        if (result == NullComparator.NOT_NULL) {
            Student a = (Student) o1;
            Student b = (Student) o2;
            result = (a.getLastName().compareToIgnoreCase(b.getLastName()));
        }

        return result;
    }
}