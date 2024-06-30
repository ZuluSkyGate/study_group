package study_group.builder;

import study_group.student.Student;

public class StudentBuilder {
    private long genId;

    public Student build(String name, int age) {
        return new Student(genId++, name, age);
    }
}
