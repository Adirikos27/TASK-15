import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Corrected file path
        List<Student> students = StudentFactory.createStudentsFromFile("C:\\Users\\Ади\\Desktop\\studentsEN.txt");

        // 1) Find students with a grade of 5 and print them
        students.stream()
                .filter(s -> s.getScore() == 5)
                .forEach(System.out::println);

        // 2) Calculate the average of all students' grades
        double average = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0);
        System.out.println("Average score: " + average);

        // 3) Calculate how many students have a grade of 5
        long count = students.stream()
                .filter(s -> s.getScore() == 5)
                .count();
        System.out.println("Number of students with score 5: " + count);
    }
}
