/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 *
 * @author Ronan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student("RonanMurphy", 20, "04/02/1998", "ECE");
        System.out.print("Username: " + student.getusername());

        System.out.println("\n Student Registration Test\n");

        //create students
        Student Ronan = new Student("RonanMurphy", 20, "04/02/1998", "ECE");
        Student Denis = new Student("DenisHynes", 22, "14/08/1997", "CS");
        Student Tommy = new Student("TommyMcDonagh", 21, "11/05/1997", "ECE");
        Student Treasa = new Student("TreasaDay", 21, "21/11/1999", "CS");
        Student Ruth = new Student("RuthWhistler", 19, "17/01/1997", "ECE");
        Student Sarah = new Student("SarahGoffery", 20, "29/10/1997", "CS");

        ArrayList<Student> Telecomms = new ArrayList<Student>();
        Telecomms.add(Ronan);
        Telecomms.add(Tommy);
        Telecomms.add(Ruth);

        ArrayList<Student> Programming = new ArrayList<Student>();
        Programming.add(Denis);
        Programming.add(Treasa);
        Programming.add(Sarah);

        ArrayList<Student> Databases = new ArrayList<Student>();
        Databases.add(Sarah);
        Databases.add(Treasa);
        Databases.add(Denis);

        ArrayList<Student> Mathematics = new ArrayList<Student>();
        Mathematics.add(Ruth);
        Mathematics.add(Tommy);
        Mathematics.add(Ronan);

        Module Telecommunications = new Module("Telecommunications", "EE453", Telecomms);
        Module ProgrammingIII = new Module("Programming", "CT417", Programming);
        Module DatabasesI = new Module("Databases I", "CT301", Databases);
        Module MathematicsIII = new Module("Mathematics III", "MA320", Mathematics);

        ArrayList<Module> Computer_Science = new ArrayList<Module>();
        Computer_Science.add(DatabasesI);
        Computer_Science.add(ProgrammingIII);

        ArrayList<Module> Engineering_Modules = new ArrayList<Module>();
        Engineering_Modules.add(Telecommunications);
        Engineering_Modules.add(MathematicsIII);

        LocalDate start = new LocalDate(2018, 9, 9);
        LocalDate end = new LocalDate(2019, 5, 11);

        CourseProgramme ComputerScience = new CourseProgramme("Computer Science", Computer_Science, start, end);
        CourseProgramme Engineering = new CourseProgramme("Engineering", Engineering_Modules, start, end);

        ArrayList<CourseProgramme> courseList = new ArrayList<CourseProgramme>();
        courseList.add(ComputerScience);
        courseList.add(Engineering);

        for (int i = 0; i < courseList.size(); i++) {
            System.out.println("In " + courseList.get(i).getcoursename() + ":");
            ArrayList<Module> modules = courseList.get(i).getModules();
            for (int j = 0; j < modules.size(); j++) {
                System.out.println("Studying: " + modules.get(j).getmoduleName() + ":");
                ArrayList<Student> students = modules.get(j).getStudents();
                for (int k = 0; k < students.size(); k++) {
                    System.out.println("Student: " + students.get(k).getname() + "; Username:  " + students.get(k).getusername() + "; Course: " + students.get(k).getcourseCode() + students.get(k).getStudentModules());

                }

                System.out.println(" ");
            }
            System.out.println(" ");
        }

    }
}
