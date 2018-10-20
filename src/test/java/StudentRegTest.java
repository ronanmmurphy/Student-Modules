/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
