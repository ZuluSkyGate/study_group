package study_group.study_group.iterator;

import java.util.List;

import study_group.student.Student;

import java.util.Iterator;

public class StudentIterator implements Iterator<Student> {
    private int index;
    private List<Student> studentList;

    public StudentIterator(List<Student> studentList) {
        this.studentList = studentList;
    }


    @Override
    public boolean hasNext() {
        return studentList.size() > index;
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}
