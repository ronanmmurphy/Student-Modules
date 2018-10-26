//course Programme class for courses
package classes;

import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 *
 * @author Ronan
 */
public class CourseProgramme {
//course names arraylist of modules start and end date of year
    private String coursename;
    private ArrayList<Module> modules;
    private LocalDate startdate;
    private LocalDate enddate;
//course constructor
    public CourseProgramme(String coursename, ArrayList<Module> modules, LocalDate startdate, LocalDate enddate) {
        this.coursename = coursename;
        this.modules = modules;
        this.startdate = startdate;
        this.enddate = enddate;
    }
//course getters and setters
    public String getcoursename() {
        return coursename;
    }

    public LocalDate getStartDate() {
        return startdate;
    }

    public LocalDate getEndDate() {
        return enddate;
    }
//arraylist of modules method
    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

}
