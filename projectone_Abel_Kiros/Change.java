/* 
   Class Title: Change Project
   Class Description:Change using DecimalFormat Class 
   Program Description: This program will allow user to enter values for amount purchase 
   price and amount tendered to see change giving in ethier dollars, quaters, nickles,dimes, and pennies.  
   
   Author: Abel Kiros
   Date Due: 10/9/2015
   Filename: Change.java
*/

//Import statements
import java.util.*;// Allows us to use the scanner class
import java.text.DecimalFormat;// This allows us to use decimal format class digits up to three places.

   class Change {//Start of class
      
      public static void main(String[] args) {//Start of the Main Method
      
      Scanner scanner= new Scanner(System.in);//Reads the input from the keyboard
      
      DecimalFormat format = new DecimalFormat("0.00");
      
      //Declare Variables for the types of money
      int penny = 1;//Integers gives us only whole number values   
      int nickel = 5;
      int dime = 10;
      int quarter = 25;
      int dollar = 100;
      
      //Display Intro
      System.out.println("Hello welcome to my change program!");
      System.out.println();
      
      //Get input from the user Money Calculations
      System.out.println("Input two values (both being in cents) for an example enter 3480 and 4000");
      System.out.println("Please enter the amount you have purchased:");
      int purchasePrice = scanner.nextInt();
      System.out.println("You have entered: "+purchasePrice);
      
      System.out.println("Please enter the amount Tendered: ");
      int amountTendered = scanner.nextInt();
      System.out.println("Thank you! You have entered the value:" +amountTendered);
     
      float purchasePricef = (float)purchasePrice/100;//Float works the same as double in theis caase I choose to work with the float 
      float amountTenderedf = (float)amountTendered/100;//Float was used to calculate decimal values
      
      int difference = amountTendered - purchasePrice;
      float differencef = amountTenderedf - purchasePricef;
      
      //The percent mod was used to indicate the reminder values from the calucation 
      int dollarsNeeded = difference / dollar;
      int moneyLeft = difference % dollar;

      int quartersNeeded = moneyLeft / quarter;
      moneyLeft = moneyLeft % quarter;

      int dimesNeeded = moneyLeft / dime;
      moneyLeft = moneyLeft % dime;

      int nickelsNeeded = moneyLeft / nickel;
      moneyLeft = moneyLeft % nickel;

      int penniesNeeded = moneyLeft / penny;
     
     
      //End program message
      System.out.println("Purchase Price:  $ " + format.format(purchasePricef));
      System.out.println("Amount Tendered: $ " + format.format(amountTenderedf));
      System.out.println("\nYour change is:  $ " + format.format(differencef));
      System.out.println("\n\n\t\t   " + dollarsNeeded + " one-dollar bill(s)");
      System.out.println("\t\t   " + quartersNeeded + " quarter(s)");
      System.out.println("\t\t   " + dimesNeeded + " dime(s)");
      System.out.println("\t\t   " + nickelsNeeded + " nickel(s)");
      System.out.println("\t\t   " + penniesNeeded + " penny(y/ies)");
      System.out.println("\nThank you for your business. I hope you enjoyed using this cashier! Come back soon.");

      
      
      }// End of Main Method
     }// End of Clas
      
      
      
      
      
     
      
      

    
      
      
       