/* 
   Class Title: Least Common Multiple Project
   Program Description: This program will allow us to enter values for two integers to determine the LCM between them the result will be outputted to the user.
   
   Author: Abel Kiros
   Date:   11/20/2015
   Filename: LCM.java
*/

//import statements
import java.util.*;// Allows us to use the scanner class
import java.lang.Math;//Allows us to use the math class

public class LCM{// Start of Class
   public static void main(String[]args){// Start of Main Method
   
      // Display Intro
      System.out.println(" Hello Welcome to the Least Common Multiple Program!");
      System.out.println(" A LCM is the smallest positive number that is a multiple of two or more numbers.");
      System.out.println(" We will begin by entering two integers to see the LCM they have lets get to work!");
      System.out.println();
      //variables for main method
      int firstInput;
      int secondInput=0;
      int answer;
      int decision = 0;

      Scanner scanner = new Scanner(System.in);//Reads the input from the keyboard
      
      while(decision == 0){//start of while loop
         try{//start of try
               
            //get inputs from the user
            System.out.println("Enter the first integer:");
            firstInput = scanner.nextInt();//reads the second input from the keyboard
            System.out.println("You have entered:" +firstInput);//Echo input values back to user here
               
            //get inputs from the user
            System.out.println("Enter the second integer:");
            secondInput = scanner.nextInt();//reads the second input from the keyboard
            System.out.println("You have entered:" +secondInput);//Echo input values back to user here
               
            answer = calculateLCM(firstInput, secondInput);
            System.out.println("The least common multiple of " + firstInput + " and " + secondInput + " is " + answer);
            System.out.println("Type in 0 if you want to continue, type in 1 to exit program");
            decision = scanner.nextInt();//reads the second input from the keyboard
            System.out.println("Thank you for using my LCM program I hope you had fun!");//Good bye sentence 
             
         }//end try
            
         //Exceptions for the program
         catch(ArithmeticException e){
            System.out.println("Error try again");
         }
         catch(InputMismatchException e){
         System.out.println("Error try again");
         scanner.next();
         System.out.println();
         System.out.println(e.getMessage());
         }
         catch(Exception e){
         System.out.println(e.getMessage());
         }
      }//End of while loop
  }//End of main method
  
   //Method that Calculates the LCM
   public static int calculateLCM(int a, int b){
      
      //variables for the LCM method 
      int lcm;
      int gcd;

      gcd = calculateGCD(a,b);//the GCD method is called
      lcm = (a*b)/gcd;
      return lcm;
      }

   // Method to calculate greatest common divisor
   public static int calculateGCD(int a, int b){
      //variable for GCD method
      int gcd = 0;
         while(a != 0 & b != 0){//start of while loop
             if(a <= b){//start of if statements
               b = b - a;
             }
             else{
               a = a - b;
             }
             if(a == 0){
               gcd = b;
             }
             else{
               gcd = a;
            }//end of if statements

         }//End of loop
             return gcd;
      }//End of calculate GCD method
}// End of Class