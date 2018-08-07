package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    private String name;
    private Student student;
    private University university;
    private List<Student> interns;

    public Internship(String name, University university) {
        this.name = name;
        this.university = university;
        interns = new ArrayList<>();
    }

    public void setStudent(List students) {
        this.interns = students;
    }

    public List<Student> addIntern(){
        for (Student student: university.getStudents()) {
            if(student.getKnowledge().getLevel() > university.getAverageKnowledgeAtTheUniversity()) {
                interns.add(student);
            }
        }
        return interns;
    }

    public String getInterns() {
        String allInterns = "";
        for(Student intern : addIntern()){
            allInterns += intern.toString() + "\n";
        }
        return allInterns;
    }
}