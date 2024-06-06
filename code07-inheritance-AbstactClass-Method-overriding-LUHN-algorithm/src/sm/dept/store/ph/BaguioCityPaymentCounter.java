/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.dept.store.ph;

/**
 *
 * @author m303user
 */
import uc.edu.ph.utility.Reader;
import bpi.com.ph.BPICreditCardServicesDivision;
import java.io.IOException;

public class BaguioCityPaymentCounter {
    public static void main(String[]args) throws IOException, InterruptedException{
        String customerName = Reader.readString("Customer name");
        double amountPurchased = Reader.readDouble("Amount Purchased");
        
        String creditCardNumber = Reader.readString("Credit Card Number");
                
        BPICreditCardServicesDivision bpiCC = new BPICreditCardServicesDivision();
        bpiCC.creditCardPayment(creditCardNumber);
        
        if (bpiCC.isNumberEqualTo16(creditCardNumber)) {
            if (bpiCC.isCreditCardNumberValid(creditCardNumber)) {
                System.out.println("Credit card number: " +creditCardNumber+ " is valid\n"
                        + "Thank you for paying " +amountPurchased+ ", " +customerName +"!");
            }else{
                System.err.println("Invalid Credit Card number, Transaction aborted");
            }
        }else{
            System.err.println("Credit card number must equal to 16, Transaction aborted");
        }
        System.out.println("\nThank you for shopping at SM");
        System.out.println("We got it all for you!");
    }
}
