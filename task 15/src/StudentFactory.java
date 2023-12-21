import java.io.*;
import java.util.*;

public class StudentFactory {
    public static List<Student> createStudentsFromFile(String filename) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                boolean add = students.add(new Student(parts[0], parts[1], Integer.parseInt(parts[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
