/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

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
         System.out.print("Username: "+student.getusername());
    }
    
}
