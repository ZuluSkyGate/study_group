package study_group.student;

public class Student implements Comparable<Student> {
    private long id;
    private String name;
    private int age;
    // private int typeSort; (костыль на выбор сортировки, как вариант )) )

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Stdent{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
        
    }

    @Override
    public  int compareTo(Student o) {
        return name.compareTo(o.name);
    }

}
