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
public class CourseProgramme {

    private String coursename;
    private ArrayList<Module> modules;
    private LocalDate startdate;
    private LocalDate enddate;

    public CourseProgramme(String coursename, ArrayList<Module> modules, LocalDate startdate, LocalDate enddate) {
        this.coursename = coursename;
        this.modules = modules;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public String getcoursename() {
        return coursename;
    }

    public LocalDate getStartDate() {
        return startdate;
    }

    public LocalDate getEndDate() {
        return enddate;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

}
