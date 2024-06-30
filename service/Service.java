package study_group.service;

import study_group.builder.StudentBuilder;
import study_group.student.Student;
import study_group.study_group.StudyGroup;

public class Service {
    private StudyGroup studyGroup;
    private StudentBuilder studentBuilder;

    public Service() {
        studyGroup = new StudyGroup();
        studentBuilder = new StudentBuilder();
    }


    public void addStudent(String name, int age) {
        Student student = studentBuilder.build(name, age);
        studyGroup.addStudent(student);
    }


    public String getStudentListInfo(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Список студентов:\n");

        // Iterator<Student> iterator =  studyGroup.iterator();
        // while (iterator.hasNext()) {
        // Student student = iterator.next();
        // stringBuilder.append(student);
        // stringBuilder.append("\n"); 
        // }
        
        for (Student student: studyGroup) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void sortByName() {
        studyGroup.sortByName();
    }

    public void sortByAge() {
        studyGroup.sortByAge();
    }


}
