package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CourseLike> courses = new ArrayList<>();
        courses.add(new AdvancedJavaCourse("ADV Java", "J123"));
        courses.add(new IntroJavaCourse("A Java Course", "J567"));
        courses.add(new IntroToProgrammingCourse("New To You Programming", "P123"));

        for (CourseLike c: courses) {
            System.out.println(c);
            writeItOut(c);
        }
    }

    public static void writeItOut(CourseLike cl) {
        System.out.println(cl.getCourseName());
    }
}
