/* 
   Class Title: Quadratic Formula Project
   Program Description: This program will allow us to enter values for a b and c to solve for two roots using the quadratic equation. 

   Author: Abel Kiros
   Date:   10/9/2015
   Filename: Quadratic.java
*/

//import statements
import java.util.Scanner;// Allows us to use the scanner class
import java.text.DecimalFormat;//Quadratic using the Math Class
   
   class Quadratic {// Begining Class 

      public static void main(String[] args) {//Begining main method
      
      Scanner User = new Scanner(System.in); //
         
         // Variables for the coefficients
         double CoefficientA=0.00;
         double CoefficientB=0.00;
         double CoefficientC=0.00;
         double root1=0.00;
         double root2=0.00;
         
         DecimalFormat NumberswithDecimals = new DecimalFormat("0.00");
         
         // Display Intro
         System.out.println(" Hello Welcome to the Quadtratic formula Program!");
         System.out.println(" The Quadratic Formula is F(x)=-(b)+-sqrt(b^2+4ac/(2a))");
         System.out.println(" For this program A does not eqaul zero and the relationship B^2 >= 4AC ");
         System.out.println();
         
         //get Coefficients from the user
         System.out.println(" Now please type in a number for the Coefficient of a: ");
         CoefficientA = User.nextDouble();//reads the input of A from the keyboard
         System.out.println(" Good job you have entered: " +CoefficientA);//Echo input values back to user here
         
         System.out.println(" Please type in a number for tthe Coefficient of b: ");
         CoefficientB= User.nextDouble();//reads the input of B from the keyboard
         System.out.println(" Excellent you have entered: " +CoefficientB);//Echo input values back to user here
        
         System.out.println(" Please type in a number for the Coefficient of c: ");
         CoefficientC= User.nextDouble();//reads the input of C from the keyboard
         System.out.println(" Thank you have entered: " +CoefficientC);//Echo input values back to user here
         
         // calculate the dicriminant (b^2- 4ac) 
         double dblDiscriminant;
         dblDiscriminant= CoefficientB*CoefficientB-4*CoefficientA*CoefficientC;
         
         
         //boolean statements depending on what the user types
         if ((CoefficientA !=0) && (CoefficientB*CoefficientB >= 4*CoefficientA*CoefficientC))   { // Two real roots thus having a solution
           
            //Calculates the roots of the equation
            root1 = (-CoefficientB + Math.sqrt(dblDiscriminant))/(2*CoefficientA);
            root2 = (-CoefficientB - Math.sqrt(dblDiscriminant))/(2*CoefficientA);
            
            //Outputs of the two roots 
            System.out.println(" Two real roots: " + NumberswithDecimals.format(root1) + " and " + NumberswithDecimals.format(root2));
            System.out.println("Thank for using my Quadratic program I hope you had fun solving the equations! Math is fun when it works.");
            
         }         
         else {
            System.out.println(" The coefficent of A should not be equal to zero and the coefficent of B^2 should be greater than or equal 4ac:");
            
        }
        System.out.println("Thank for using my Quadratic program have nice a day."); 
        }// End Method
    
   }//End Class
      
           
      
      
