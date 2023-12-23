/* 
   Class Title: PickWord Project
   Program Description: This program will ask the user to input a phrase (multiple word sentence), and an integer value. 
   The user will input a sentence then after a number that number will coresspond to the place of the word within the sentence.
   
   Author: Abel Kiros
   Date:   11/20/2015
   Filename: PickWord.java
*/

import java.util.*;//import statement allows us to use the scanner class 

public class PickWord{//Start of class  
    
    public static void main(String[] args)throws Exception{// Start of main Method
        
        //variables for main method 
        String sentence;
        String word;
        int whichWord=0;
        int decision = 0;
        
        while(decision == 0){//start of while loop
         
      
               Scanner scanner = new Scanner(System.in);
               
               // Display Intro
               System.out.println(" Hello Welcome to the PickWord Program!");
               System.out.println(" In this program you will write a sentence then you will type in an integer which will display order in which is word was placed.");
               System.out.println(" We will begin by entering a complete sentence lets get to work!");
               System.out.println();
        
               System.out.println("Type in a sentence: ");
               sentence = scanner.nextLine();//reads the input from the keyboard
               try {               
                  System.out.println("Type in a integer corresponding to the word you want: ");
                  whichWord = scanner.nextInt();//reads the input from the keyboard
               }
               catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("Error try again");
               }
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
               word = findWord(sentence, whichWord);
               System.out.println(word);
               
               System.out.println("Type in 0 if you want to continue, type in 1 to exit program");
               decision = scanner.nextInt();//reads the input from the keyboard
               System.out.println("Thank you for using my PickWord program I hope you had fun!");//Good bye sentence 
          
         }//end of while loop
         
    }//end of main method
        

   //Method for finding words 
   public static String findWord(String sentence, int wordNumber){
         
         String word = "";
         String[] array = sentence.split(" ");
         word = array[wordNumber - 1];
         return word;
   }// End of find word method

}// End Class

