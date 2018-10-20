//module class for modules and their attributes
package classes;

import java.util.ArrayList;

/**
 *
 * @author Ronan 15397831
 */
public class Module {
    //modules name and course code and arraylist of students in modules
    private String moduleName;
    private String modulecode;
    private ArrayList<Student> students;

    //module constuctor for everymoduel name, code and list of students
    public Module(String moduleName, String modulecode, ArrayList<Student> students) {
        this.moduleName = moduleName;
        this.modulecode = modulecode;
        this.students = students;
        //loop through students list and add modules
        for (int i = 0; i < students.size(); i++) {
            students.get(i).addModule(this);
        }
    }
    //setters and getters for attributes
    public String getmoduleName() {
        return moduleName;
    }

    public String getmodulecode() {
        return modulecode;
    }
    //arraylist for students and add studnets to it methods
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudents(ArrayList<Student> students) {
        this.students.addAll(students);
    }

}
