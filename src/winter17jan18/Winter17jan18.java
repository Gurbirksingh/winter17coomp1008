/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winter17jan18;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Winter17jan18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //enter first fav app
        System.out.printf("What is ur  1 favourite app?");
        Scanner keyboard = new Scanner(System.in);
        String firstapp = keyboard.nextLine();
         
        //enter 2 fav app
        System.out.printf("What is ur 2 favourite app?");
        String secondapp = keyboard.nextLine();
        
        //enter 3 fav app
         System.out.printf("What is ur  3 favourite app?");
        String thirdapp = keyboard.nextLine();
        
        //enter 4 fav app
         System.out.printf("What is ur 4 favourite app?");
        String fourthapp = keyboard.nextLine();
        
        //enter 5 fav app
         System.out.printf("What is ur 5 favourite app?");
        String fifthapp = keyboard.nextLine();
        
        //print all app names
        System.out.printf("Your favourite apps are:"
                              + firstapp + " ," + secondapp + " ," + thirdapp + 
                                 " ,"+ fourthapp + " ," + fifthapp);
        
        
    }
    
}
