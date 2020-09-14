 import java.util.Scanner;

/**
 *this program will calculate how much it would cost to purchase different quantities of pc parts
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the scanner for user input 
    Scanner input = new Scanner(System.in); 

    // ask user how many parts they're buying 
   System.out.println("how many chromebook chargers are you buying?");  
   // intialize each part they are buying
   int chromebookCharger = input.nextInt(); 

   System.out.println("how many motherboards are you buying?");   

   int motherboard = input.nextInt(); 

    System.out.println("how many mice are you buying?"); 

   int mice = input.nextInt(); 
   // the prices of each part  
   final double  chromebookChargerPrice =  34.99;
   final double  motherboardPrice =  127.50;
   final double  micePrice = 18.00;
   // calculate the subtotal by multiplying the amount of products by their price
   final double subtotalChromebookCharger = chromebookCharger * chromebookChargerPrice;  
   final double subtotalMotherboard = motherboard * motherboardPrice;  
   final double subtotalMice = mice * micePrice; 
   // the formula for the subtotal 
   final double subtotal = subtotalChromebookCharger + subtotalMotherboard + subtotalMice;
   // print out the subtotal for user
   System.out.println("subtotal $" + subtotal); 
   // calculation for taxes 
   final double tax = subtotal * 0.13; 
   //print out taxes for user
   System.out.println("taxes $" + tax); 
   
   // calculates the total amount
   final double total = subtotalChromebookCharger + subtotalMotherboard + subtotalChromebookCharger + tax; 
   // prints out the total with taxes for user
   System.out.println("total $" + total);

  }
}
