/* 
   Class Title: Prime
   Program Description: This program allows the user to see if the integer they input is either a prime number or not.
   
   Author: Abel M Kiros
   Date:   10/30/2015
   Filename: Prime.java
*/

//import statements
import java.util.*;// Allows us to use the scanner class


class Prime {// Begining Class name 
      
   public static void main(String[]args){//Begining main method
      
      //Declare Variables for the integers
      int numOfPrimes = 0;
      int result;
      int lowNumber;
      int highNumber;
      boolean prime;

      Scanner scanner = new Scanner(System.in);
      
      // Display Intro
      System.out.println("Hello welcome to my prime number Program!");
      System.out.println("A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.");
   
      
      //Collect user inputs
      System.out.println("Type in a low number for an example 2: ");
      lowNumber = scanner.nextInt();//reads the input of low number from the keyboard
      System.out.println("Good job you have entered: " +lowNumber);//Echo input values back to user here

      
      System.out.println("Type in a high number for an example 100: ");
      highNumber = scanner.nextInt();//reads the input of high number from the keyboard
      System.out.println("Good job you have entered: " +highNumber);//Echo input values back to user here

      
      //Loops for the program
      for(int Coefficentj = lowNumber; Coefficentj <= highNumber; Coefficentj++){
         
         prime = true;
        
         for(int Coefficenti = Coefficentj - 1; Coefficenti> 1; Coefficenti--){
             result = Coefficentj % Coefficenti;
             if(result == 0){
               prime = false;
               break;
             }
      
            prime = true;

         }
         if(prime){
            numOfPrimes++;
         }
      }

     System.out.println("There are " + numOfPrimes + " prime numbers in between " + lowNumber + " and " + highNumber);
     System.out.println();
     System.out.println("Thank you for using my Prime number program!");
     
     

     }// End of main method

  }// End of Class


   
   
   
   

   