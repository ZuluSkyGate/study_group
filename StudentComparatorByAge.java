package study_group;

import java.util.Comparator;


public class StudentComparatorByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
