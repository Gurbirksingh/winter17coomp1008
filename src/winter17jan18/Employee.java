/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winter17jan18;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author apple
 */
public class Employee {
      
   private String fname, lname;
   private int sinumber;
   private LocalDate dobirth;
   
   public Employee(String first,String last,int sin,LocalDate dob)
   {
       fname= first;
       lname= last;
       sinumber = sin;
       setBirthday(dob);
       
   }
           
   public String toString()
   {
       return fname + " "+ lname;
   }
//  this method will validate that the employee is 15 to 90 old and set
   public void setBirthday (LocalDate dob)
   {
   LocalDate today = LocalDate.now();
   
   int age = Period.between(dob, today).getYears();
   
   }
}
