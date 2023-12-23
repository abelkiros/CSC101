/* 
   Class Title: My Java Coffee Outlet with Discount
   Program Description: This program allows the user to see how much 
   user must pay per box of coffee the price varies depending on the value the user inputs but this time a discount is used.
   
   Author: Abel M Kiros
   Date:   10/30/2015
   Filename: Discount.java
*/

//import statements
import java.util.*;// Allows us to use the scanner class
import java.text.DecimalFormat;//Allows us to use the Decimal Format class.

class Discount {//Start of Class
   
   public static void main(String args[]) {//Start of Main Method
      
      Scanner coffee= new Scanner(System.in);//object for reading from keyboard
      
      //Allows decimal values to go up to certain digits
      DecimalFormat coffeeP = new DecimalFormat ("0.00");//Reads the input from the keyboard
      
      // price of the bag 2 lbs
      final double COFFEEPRICE = 5.50;
      
      // variables of size
      final int LARGESIZECOFFEEBOX =20;
   
      final int MEDIUMSIZECOFFEEBOX = 10; 
    
      final int SMALLSIZECOFFEEBOX = 5;
      
      //variables of price by the box
      final double LARGESIZECOFFEEPRICE = 1.80;
      
      final double MEDIUMSIZECOFFEEPRICE = 1.00;
      
      final double SMALLSIZECOFFEEPRICE = 0.60;
  
      
      
      int bagsLeft=0;
      
      //variables for bag orders
      int bagorder = 0;
      
      //variable for how many boxes needed
      int numberLargeBoxNeeded =0;
      int numberMediumBoxNeeded =0;
      int numberSmallBoxNeeded=0;
      
      //variable for costs
      int largeBoxCosts;
      int mediumBoxCosts= 0;
      int smallBoxCosts=0;
      double totalBagCost;
      double totalCost;
      double newCost = 0;
      double discount;
      double fivePercent=0.95;
      double tenPercent=0.90;
      double fifteenPercent = 0.85;
      double twentyPercent = 0.80;
      double twentyFivePercent = 0.75;
      double thirtyPercent = 0.70;
      
      
      
      //Variable math
      System.out.println(" Enter the amount of to order:");
      System.out.println();
      
      //Friendly Greeting
      System.out.println(" Hello, welcome to MyJava Coffee Outlet! Our beans are fresh roasted straight out of Irian Jaya.");
      System.out.println(" We sell coffee by 2 pound bags only, and the price of a single bag is $5.50");
      System.out.println(" Our bags are shipped in either large, medium, or small boxes, depending on how many bags you order.");
      System.out.println(" Large boxes hold 20 bags, medium boxes hold 10 bags, and small boxes hold 5 bags.");
      System.out.println(" However depending on how many bags you purchase you can recieve up to a 30 percent discount on your order purchase!");
      System.out.println();
      System.out.println(" To place an order, please enter how many bags you would like to purchase: ");

      
      //user inputs
      bagorder = coffee.nextInt();
      totalBagCost = bagorder * COFFEEPRICE;
      
      //The percent mod was used to indicate the reminder values from the calucation 
      numberLargeBoxNeeded = bagorder / LARGESIZECOFFEEBOX; 
      bagsLeft = bagorder % LARGESIZECOFFEEBOX;
      
      
      numberMediumBoxNeeded = bagsLeft / MEDIUMSIZECOFFEEBOX;
      bagsLeft = bagsLeft % MEDIUMSIZECOFFEEBOX;
      
     
      numberSmallBoxNeeded = bagsLeft / SMALLSIZECOFFEEBOX;
      
      bagsLeft = bagsLeft % SMALLSIZECOFFEEBOX;

      if(bagsLeft > 0){
         numberSmallBoxNeeded+=1;
         }  
        
      
      
         // This statmenrt print outs the directions to the user
         System.out.println("\nNumber of Bags Ordered: " + bagorder);
         System.out.println();

         System.out.println("Boxes used:\n\t"+numberLargeBoxNeeded+" Large  - "+coffeeP.format(LARGESIZECOFFEEPRICE * numberLargeBoxNeeded));
         System.out.println("\n\t"+numberMediumBoxNeeded+" Medium - "+coffeeP.format(MEDIUMSIZECOFFEEPRICE*numberMediumBoxNeeded));
         System.out.println("\n\t"+numberSmallBoxNeeded+" Small  - "+coffeeP.format(SMALLSIZECOFFEEPRICE*numberSmallBoxNeeded));

         totalCost = (LARGESIZECOFFEEPRICE * numberLargeBoxNeeded) + (MEDIUMSIZECOFFEEPRICE*numberMediumBoxNeeded) + (SMALLSIZECOFFEEPRICE*numberSmallBoxNeeded) + totalBagCost;
         
         //If statements are used to allow percent of discounts for purchase orders     
         newCost = totalCost;
         if((bagorder >= 25) && (bagorder < 50)) {
            newCost= totalCost*fivePercent;
         }else if(bagorder >= 50 && bagorder < 100){
            newCost = totalCost*tenPercent;
         }else if(bagorder >= 100 && bagorder < 150){
            newCost = totalCost*fifteenPercent;
         }else if(bagorder >= 150 && bagorder < 200){
            newCost = totalCost*twentyPercent;
         }else if(bagorder >= 200 && bagorder < 300){
            newCost = totalCost*twentyFivePercent;
         }else if(bagorder >= 300){
            newCost = totalCost*thirtyPercent;
         }
         //Discount variable 
         discount = totalCost - newCost;
         System.out.println("\nYour discount is: " + coffeeP.format(discount));
         System.out.println("\nYour total cost is: "+coffeeP.format(newCost));
         System.out.println("\nThank you for using MyJava Coffee Outlet and thank you for your business! Have a wonderful day come back soon we hope to see you again.");     
     
    }// End of main method

}// End of Class

      
  
   