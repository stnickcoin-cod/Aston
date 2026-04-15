import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    /**
     * Удаляет студентов со средним баллом < 3 из коллекции
     * @param students коллекция студентов
     */
    public static void removeStudentsWithLowAverage(Set<Student> students) {
        students.removeIf(student -> student.calculateAverageGrade() < 3.0);
    }

    /**
     * Переводит студентов на следующий курс, если средний балл >= 3
     * @param students коллекция студентов
     */
    public static void promoteStudentsToNextCourse(Set<Student> students) {
        for (Student student : students) {
            if (student.calculateAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    /**
     * Печатает имена студентов заданного курса
     * @param students коллекция студентов
     * @param course номер курса для фильтрации
     */
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
        System.out.println(); // Пустая строка для разделения вывода
    }
}