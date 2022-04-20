package lab1;

public class Main {
    public static void main(String[] args) {
        Course course1 = new AdvancedJavaCourse("The Advanced Java course", "J123");
        Course course2 = new IntroJavaCourse("Intro to Programming and Java", "J111");
        Course course3 = new IntroToProgrammingCourse("Intro To Programming", "P111");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
