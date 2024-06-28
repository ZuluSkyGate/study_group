package study_group;

public class Main {
    public static void main(String[] args) {
        Servise servise = new Servise();

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