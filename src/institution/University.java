package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private Student student;
    private List<Student> students = students = new ArrayList<>();
    private double averageKnowledgeAtTheUniversity;

    public University(String name) {
        this.name = name;
    }

    public University(){
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(List students) {
        this.students = students;
    }

    private double sumOfKnowledgeLevel(){
        int sum = 0;
        for (Student student : students) {
            sum += student.getKnowledge().getLevel();
        }
        return sum;
    }

    private double calculationAverageKnowledgeAtTheUniversity(){
        try {
            averageKnowledgeAtTheUniversity = sumOfKnowledgeLevel()/students.size();
        } catch (ArithmeticException e) {
            System.out.println("Список студентів пустий");
        }
        averageKnowledgeAtTheUniversity = sumOfKnowledgeLevel()/students.size();
        return averageKnowledgeAtTheUniversity;
    }

    public double getAverageKnowledgeAtTheUniversity(){
        return calculationAverageKnowledgeAtTheUniversity();
    }
}
