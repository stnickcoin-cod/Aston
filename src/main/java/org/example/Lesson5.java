import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Lesson5 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иван Иванов", "И101", 1,
                Arrays.asList(4, 5, 3, 4, 5)));
        students.add(new Student("Пётр Петров", "И101", 1,
                Arrays.asList(2, 3, 2, 2, 3)));
        students.add(new Student("Сидор Сидоров", "И201", 2,
                Arrays.asList(5, 4, 5, 4, 5)));
        students.add(new Student("Анна Ивнова", "И301", 3,
                Arrays.asList(3, 3, 4, 3, 3)));
        students.add(new Student("Сергей Рогов", "И201", 2,
                Arrays.asList(2, 2, 1, 2, 2)));

        System.out.println("=== ИСХОДНЫЕ ДАННЫЕ ===");
        students.forEach(System.out::println);

        System.out.println("\n=== УДАЛЕНИЕ СТУДЕНТОВ СО СРЕДНИМ БАЛЛОМ < 3 ===");
        StudentManager.removeStudentsWithLowAverage(students);
        students.forEach(System.out::println);

        System.out.println("\n=== ПЕРЕВОД СТУДЕНТОВ НА СЛЕДУЮЩИЙ КУРС ===");
        StudentManager.promoteStudentsToNextCourse(students);
        students.forEach(System.out::println);

        System.out.println("\n=== ВЫВОД СТУДЕНТОВ ПО КУРСАМ ===");
        StudentManager.printStudents(students, 1);
        StudentManager.printStudents(students, 2);
        StudentManager.printStudents(students, 3);
        StudentManager.printStudents(students, 4);
    }
}