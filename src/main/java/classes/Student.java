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
public class Student {
    private String name;
    private int age;
    private String dob;
    private String username;
    private String courseCode;
    private CourseProgramme courseName;
    
    
    public Student(String name, int age, String dob, String courseCode){
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.courseCode=courseCode;
        
    }
    public String getusername(){
   
        username = getname()+getAge();
        return username;
    }
    public String getname(){
        return name;
        
    }
    public void setname(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getDOB(){
        return dob;
    }
    public void setDOB(String dob){
        this.dob=dob;
    }
    public String getcourseCode(){
        return courseCode;
    }
    public void setcourseCode(String courseCode){
        this.courseCode=courseCode;
        
    }
    public CourseProgramme getcourse(){
        return this.courseName;
    }
    public void setCourse(CourseProgramme courseName){
        this.courseName=courseName;
        
    }
}
