import groovy.transform.ToString;

public class Student {

    public String name;
    public int score;

    public Student(String stuName, int stuScore) {
        this.name = stuName;
        this.score = stuScore;
    }

    @Override
    public String toString() {
        return String.format("Student(name:%s,score:%d) ", name, score);
    }

    public static void main(String[] args) {
        Array<Student> stus = new Array<>();
        stus.addLast(new Student("allen", 99));
        stus.addLast(new Student("bob", 87));
        stus.addLast(new Student("jack", 92));
        System.out.println(stus);
    }
}
