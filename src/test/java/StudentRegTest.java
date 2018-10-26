//junit tesst class for student registration username

import classes.Student;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ronan
 */
public class StudentRegTest {

    @Test
    public void testusername() {

        Student student = new Student("RonanMurphy", 20, "04/02/1998", "ECE");
        assertEquals("RonanMurphy20", student.getusername());
        System.out.print("Username: " + student.getusername());
    }

}
