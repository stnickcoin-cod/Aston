import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    public static void removeStudentsWithLowAverage(Set<Student> students) {
        students.removeIf(student -> student.calculateAverageGrade() < 3.0);
    }

    public static void promoteStudentsToNextCourse(Set<Student> students) {
        for (Student student : students) {
            if (student.calculateAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        List<String> studentNames = students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getName)
                .collect(Collectors.toList());

        if (studentNames.isEmpty()) {
            System.out.println("На курсе " + course + " студентов нет.");
        } else {
            studentNames.forEach(System.out::println);
        }
        System.out.println();
    }
}