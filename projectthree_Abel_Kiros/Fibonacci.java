/* 
   Class Title: Fibonacci Project
   Program Description: This program depending on which integer is inputted will output a list of Fibonacci numbers using Fibonacci's rule

   Author: Abel Kiros
   Date:   11/20/2015
   Filename: Fibonacci.java
*/

//import statements
import java.util.*;//import statement allows us to use the scanner class 


public class Fibonacci{//Start of class
    
    public static void main(String[] args){//Start of main method
        //Variables for main method 
        int num;
        int fibonacciNum;
        
        Scanner scanner = new Scanner(System.in);
        // Display Intro
        System.out.println(" Hello Welcome my Fibonacci Program!");
        System.out.println(" The Fibonacci sequence is a set of numbers that starts with a one or a zero, followed by a one, and proceeds based on the rule that each number (called a Fibonacci number) is equal to the sum of the preceding two numbers.");
        System.out.println(" We will begin by entering an integer lets get to work!");
        System.out.println();

        try{//start of try 
        
           System.out.println("Type in an integer: ");
           num = scanner.nextInt();//reads the input from the keyboard
           System.out.println("You have entered: " +num);//Echo input values back to user here
        
           for(int counteri = 1; counteri<= num; counteri++){//start of loop
              fibonacciNum = computeFibonacci(counteri);//Sends data to other method
              System.out.println("Month: " + counteri + "\t\t" + "number of pairs: " + fibonacciNum);
           }//End of for loop
           
         
         }//end of try
         catch(InputMismatchException e){
               System.out.println("Error only enter integers");
         }
        
    }//End of main method 
    
    public static int computeFibonacci(int number){//Start of compute method
        
        //variable for compute method
        final double SQRT_5 = Math.sqrt(5);
        int fibonacciNum;
        //calculation for Fibonacci
        fibonacciNum = (int)((1/SQRT_5)*((Math.pow(((1+SQRT_5)/2), number)) -
        (Math.pow(((1-SQRT_5)/2), number))));
        
        
        return fibonacciNum;//returns data to method
    }//End of computeFibonacci
}//End of class