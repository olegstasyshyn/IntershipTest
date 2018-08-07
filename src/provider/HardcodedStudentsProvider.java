package provider;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class HardcodedStudentsProvider implements StudentsProvider{

    @Override
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrew Kostenko", 14));
        students.add(new Student("Julia Veselkina" , 16));
        students.add(new Student("Maria Perechrest", 17));
        students.add(new Student("Oleg Stasyshyn", 21));
        return students;
    }
}
