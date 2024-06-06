/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpi.com.ph;


import bsp.gov.ph.model.CreditCardRegulations;
/**
 *
 * @author m303user
 */
public class BPICreditCardServicesDivision extends CreditCardRegulations{

    @Override
    public void creditCardPayment(String creditCard) throws InterruptedException {
        System.out.println("Making payment with " +creditCard+ ", please wait as we will use your card.");
        
        for (int i = 0; i <= 10; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println("");
    }

    @Override
    public boolean isNumberEqualTo16(String creditCardNumber) {
        return (creditCardNumber.trim().length()==16)?true:false;
    }

    @Override
    public boolean isCreditCardNumberValid(String creditCardNumber) {
        int s1 = 0, s2 = 0;
        String reverse = new StringBuffer(creditCardNumber).reverse().toString();
        for(int i = 0 ;i < reverse.length();i++){
            int digit = Character.digit(reverse.charAt(i), 10);
            if(i % 2 == 0){ //this is for odd digits, they are 1-indexed in the algorithm
                s1 += digit;
            }else{ //add 2 * digit for 0-4, add 2 * digit - 9 for 5-9
                s2 += 2 * digit;
                if(digit >= 5){
                    s2 -= 9;
                }
            }
        }
        return (s1 + s2) % 10 == 0;
    }
    
}
