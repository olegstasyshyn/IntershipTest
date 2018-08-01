package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private Student student;
    private List<Student> students = students = new ArrayList<>();;

    public University(String name) {
        this.name = name;
    }

    public University(){
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double sumOfKnowledgeLevel(){
        int sum = 0;
        for (Student student : students) {
            sum += student.getKnowledge().getLevel();
        }
        return sum;
    }

    public double getAverageKnowledgeAtTheUniversity(){
        return sumOfKnowledgeLevel()/students.size();
    }
}
