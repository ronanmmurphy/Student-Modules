//student class for student attributes
package classes;

import java.util.ArrayList;

/**
 *
 * @author Ronan 15397831
 */
public class Student {
    //student name, age, date of birth, username, course code and modules initialised
    private String name;
    private int age;
    private String dob;
    private String username;
    private String courseCode;
    private CourseProgramme courseName;
    private ArrayList<Module> modules = new ArrayList<Module>();
    
    //student constructor 4 attributes for each student
    public Student(String name, int age, String dob, String courseCode) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.courseCode = courseCode;

    }
    //setters and getters for attributes
    public String getusername() {

        username = getname() + getAge();
        return username;
    }

    public String getname() {
        return name;

    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return dob;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public String getcourseCode() {
        return courseCode;
    }

    public void setcourseCode(String courseCode) {
        this.courseCode = courseCode;

    }

    public CourseProgramme getcourse() {
        return this.courseName;
    }

    public void setCourse(CourseProgramme courseName) {
        this.courseName = courseName;

    }
    //arraylist for students modules
    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }
    //get modules for student 
    public String getStudentModules() {

        // for loop through over students modules and makes a string for them
        StringBuilder modulesString = new StringBuilder();
        for (int i = 0; i < this.getModules().size(); i++) {
            modulesString.append("\t" + this.getModules().get(i).getmoduleName());
        }
        //returns string with the modules for student
        return ("; Modules: " + modulesString);
    }
}
