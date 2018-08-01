package person;

import person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;

    public Student(String name, int studentLevel) {
        this.name = name;
        this.knowledge = new Knowledge(studentLevel);
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    @Override
    public String toString() {
        return name + " " + knowledge.getLevel();
    }
}
