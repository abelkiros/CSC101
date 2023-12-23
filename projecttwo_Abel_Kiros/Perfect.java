/* 
   Class Title: Perfect
   Program Description: This program will allow us to enter values and see if the numbers that are inputted are either perfect or not perfect numbers.  
   
   Author: Abel Kiros
   Date:   10/30/2015
   Filename: Perfect.java
*/

//import statements
import java.util.*;// Allows us to use the scanner class
import java.text.*;

class Perfect {//Begining of Class
      
   public static void main(String[]args){//Start of Main Method
      
      //Variables for the integers
      int input;
      int input2;
      int sum = 0;

      Scanner scanner = new Scanner(System.in);
      
      //Display Intro
      System.out.println("Hello Welcome to my Perfect number Program!");
      System.out.println("This Program finds helps determine the value the user inputs will out whether it is perfect or not.");
      System.out.println("A perfect number is a postive integer that is equal to the sum of its proper divisors.");
      System.out.println("A proper divisor is a positive integer other than the number itself that divides the number evenly.");
      
      //get inputs from the user
      System.out.println("Enter a first value: ");
      input = scanner.nextInt();//reads the input of the first number from the keyboard
      System.out.println("Excellent you have entered:"+input);//Echo input values back to user here
      
      System.out.println("Enter a second value:");
      input2 = scanner.nextInt();//reads the input of the second number from the keyboard
      System.out.println("Excellent you have entered:"+input2);//Echo input values back to user here
      
      //Loops for the program
      for(int Coefficentj = input; Coefficentj <= input2; Coefficentj++){
         sum = 0;
         for(int Coefficenti = 1; Coefficenti<= Coefficentj/2; Coefficenti++){

            if((Coefficentj % Coefficenti) == 0){
               System.out.println(Coefficenti + " is a divisor of " + Coefficentj);
               sum = sum + Coefficenti;
               System.out.println("The current sum of the divisors of " + Coefficentj + " is " + sum);
            } 

         }// End of for loop
         if(sum == Coefficentj){
            System.out.println(Coefficentj + " is a perfect number\n");
         }//End of if
         else{
            System.out.println(Coefficentj + " is not a perfect number\n");
         }//End of else

      }//End of for loop
      System.out.println("Thank for using my Perfect number program have nice a day."); 
   }// End of main method
   
}// End of Class


      

   