package provider;

import person.Student;
import java.util.List;

public interface StudentsProvider {
    List<Student> getStudents();
}