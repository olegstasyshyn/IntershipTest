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

    public void setStudent(Student student) {
        this.student = student;
    }


    public void addIntern(){
        for (Student student: university.getStudents()) {
            if(student.getKnowledge().getLevel() > university.getAverageKnowledgeAtTheUniversity()) {
                interns.add(student);
            }

        }
    }

    public String getInterns() {
        addIntern();
        String allInterns = "";
        for(Student intern : interns){
            allInterns += intern.toString() + "\n";
        }
        return allInterns;
    }
}