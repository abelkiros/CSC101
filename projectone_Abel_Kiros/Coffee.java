/* 
   Class Title: My Java Coffee Outlet
   Program Description: This program allows the user to see how much 
   user must pay per box of coffee the price varies depending on the value the user inputs.
   
   Author: Abel M Kiros
   Date:   10/9/2015
   Filename: Coffee.java
*/

//import statements
import java.util.*;// Allows us to use the scanner class
import java.text.DecimalFormat;//Allows us to use the Decimal Format class.

   class Coffee {//Start of Class
   
      public static void main(String args[]) {//Start of Main Method
      
      Scanner coffee= new Scanner(System.in);//object for reading from keyboard
      
      //Allows decimal values to go up to certain digits
      DecimalFormat coffeeP = new DecimalFormat ("0.00");
      
      //Price of the bag 2 lbs
      final double COFFEEPRICE = 5.50;
     
      //Variables of size
      final int LARGESIZECOFFEEBOX =20;
   
      final int MEDIUMSIZECOFFEEBOX = 10; 
    
      final int SMALLSIZECOFFEEBOX = 5;
      
      //Variables of price by the box
      final double LARGESIZECOFFEEPRICE = 1.80;
      
      final double MEDIUMSIZECOFFEEPRICE = 1.00;
      
      final double SMALLSIZECOFFEEPRICE = 0.60;
  
      
      //Variable for the amount left
      int bagsLeft=0;
      
      //Variables for bag orders
      int bagorder = 0;
      
      //Variable for how many boxes needed
      int numberLargeBoxNeeded =0;
      int numberMediumBoxNeeded =0;
      int numberSmallBoxNeeded=0;
      
      //Variable for costs
      int largeBoxCosts;
      int mediumBoxCosts= 0;
      int smallBoxCosts=0;
      double totalBagCost;
      double totalCost;
      
      
      
      //Friendly Greeting
      System.out.println(" Hello, welcome to MyJava Coffee Outlet! Our beans are fresh roasted straight out of Irian Jaya.");
      System.out.println(" We sell coffee by 2 pound bags only the price of a single bag is $5.50");
      System.out.println(" Our bags are shipped in either large, medium, or small boxes, depending on how many bags you order.");
      System.out.println(" Large boxes hold 20 bags, medium boxes hold 10 bags, and small boxes hold 5 bags.");
      System.out.println();
      System.out.println(" To place an order please enter how many bags you would like to purchase: ");

      //User input goes here
      System.out.println(" Enter the amount of to order:");
      System.out.println();
      
     
      //user inputs
      bagorder = coffee.nextInt();
      System.out.println(" You have entered:" +bagorder);//Echo input values back to user here

      totalBagCost = bagorder * COFFEEPRICE;
      
      //The percent mod was used to indicate the reminder values from the calucation 
      numberLargeBoxNeeded = bagorder / LARGESIZECOFFEEBOX; 
      bagsLeft = bagorder % LARGESIZECOFFEEBOX;
      
      
      numberMediumBoxNeeded = bagsLeft / MEDIUMSIZECOFFEEBOX;
      bagsLeft = bagsLeft % MEDIUMSIZECOFFEEBOX;
      
     
      numberSmallBoxNeeded = bagsLeft / SMALLSIZECOFFEEBOX;
      
      bagsLeft = bagsLeft % SMALLSIZECOFFEEBOX;

      //Booleen rules applied to spe
      if(bagsLeft > 0){
         numberSmallBoxNeeded+=1;
      }        
      
      
      // This statmenrt print outs the diresctions to the user
      System.out.println("\nNumber of Bags Ordered: "+bagsLeft+" - "+coffeeP.format(bagorder));
      System.out.println();

      System.out.println("Boxes used:\n\t"+numberLargeBoxNeeded+" Large  - "+coffeeP.format(LARGESIZECOFFEEPRICE * numberLargeBoxNeeded));
      System.out.println("\n\t"+numberMediumBoxNeeded+" Medium - "+coffeeP.format(MEDIUMSIZECOFFEEPRICE*numberMediumBoxNeeded));
      System.out.println("\n\t"+numberSmallBoxNeeded+" Small  - "+coffeeP.format(SMALLSIZECOFFEEPRICE*numberSmallBoxNeeded));

      totalCost = (LARGESIZECOFFEEPRICE * numberLargeBoxNeeded) + (MEDIUMSIZECOFFEEPRICE*numberMediumBoxNeeded) + (SMALLSIZECOFFEEPRICE*numberSmallBoxNeeded) + totalBagCost;
      System.out.println("\nYour total cost is: "+coffeeP.format(totalCost));
      
      //End program message
      System.out.println("\nThank you for using MyJava Coffee Outlet and thank you for your business! Have a wonderful day come backsoon we hope to see you again.");     
     
    }// End of main method

}// End of Class


      
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
         
      
      
   
    