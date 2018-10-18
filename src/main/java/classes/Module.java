/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.ArrayList;
/**
 *
 * @author Ronan
 */
public class Module {
    private String moduleName;
    private String modulecode;
    private ArrayList<Student> students;
    public Module(String moduleName, String modulecode){
        this.moduleName=moduleName;
        this.modulecode=modulecode;
    }
    public String getmoduleName() {
		return moduleName;
	}
    
    public String getmodulecode() {
		return modulecode;
	}

    public ArrayList<Student> getStudents() {
		return students;
	}
	
    public void addStudents(ArrayList<Student> students) {
		this.students.addAll(students);
}
    
}
