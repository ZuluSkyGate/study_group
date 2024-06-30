package study_group;

import study_group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service servise = new Service();

        servise.addStudent("Паша", 18);
        servise.addStudent("Маша", 19);
        servise.addStudent("Даша", 18);
        servise.addStudent("Саша", 17);

        System.out.println(servise.getStudentListInfo());
        servise.sortByName();
        System.out.println(servise.getStudentListInfo());
        servise.sortByAge();
        System.out.println(servise.getStudentListInfo());

    }
}