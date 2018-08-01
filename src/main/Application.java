package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 14));
        university.addStudent(new Student("Julia Veselkina" , 16));
        university.addStudent(new Student("Maria Perechrest", 17));
        university.addStudent(new Student("Oleg Stasyshyn", 21));

        Internship internship = new Internship("Interlink", university);
        System.out.println("List of internship's students:");
        System.out.println(internship.getInterns());
    }
}
