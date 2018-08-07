package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import provider.HardcodedStudentsProvider;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new HardcodedStudentsProvider().getStudents());
        Internship internship = new Internship("Interlink", university);
        System.out.println("List of internship's students:");
        System.out.println(internship.getInterns());
    }
}
