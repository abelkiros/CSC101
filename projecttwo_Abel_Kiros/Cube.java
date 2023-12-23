/* 
   Class Title: Cube
   Program Description: This program allows the user to input a range of values which finds all the integers between low and high that are the sum of the cube 
   of their digits.
   
   Author: Abel M Kiros
   Date:   10/30/2015
   Filename: Cube.java
*/

//import statements
import java.util.*;// Allows us to use the scanner class
import java.text.*;//Allows us to use the Math Class

class Cube {//Begining of Class
      
      public static void main(String[]args){//Begining of Main Method
         
         // Variables for the integers
         int lowNumber;
         int highNumber;
         int digit = 1;
         int newNumber = 1;
         int cubedDigit;
         int sum = 0;


         Scanner scanner = new Scanner(System.in);//Reads the input from the keyboard
         
         // Display Intro
         System.out.println("Hello Welcome to my sum of the Cubes Program!");
         System.out.println("This Program finds all numbers xyz such that xyz= x^3+y^3+z^3");
         
         //get inputs from the user
         System.out.println("Please first type in a low number for an example 100: ");
         lowNumber = scanner.nextInt();//reads the input of low number from the keyboard
         System.out.println("Good job you have entered: " +lowNumber);//Echo input values back to user here
         
         System.out.println("Now please type in a high number for an example 1000: ");
         highNumber = scanner.nextInt();//reads the input of high number from the keyboard
         System.out.println("Excellent job you have entered: " +highNumber);//Echo input values back to user here
         System.out.print("The integers in your range that equal the sum of the cube of their digits are: ");
 
         //Loop determines how many times cycle occurs
         for(int Coefficenti = lowNumber; Coefficenti<= highNumber; Coefficenti++){
         sum = 0;
         newNumber = Coefficenti;
         
         //Calculation for find the cube of the input values
         while(newNumber> 0){
            digit = newNumber % 10;
            cubedDigit = (int)Math.pow(digit,3);//
            newNumber = newNumber / 10;
            sum += cubedDigit;
         }//End of while
            //Boolean which helps display only the sum of the cubes 
            if(sum == Coefficenti){
                  System.out.print(sum + " ");
            }//End of if statement
         
         }//End of for statement

     }//End of Main Method
     
}// End of class

   