package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m303user
 */
public class Child extends src.Parent{
    public Child(){
        this.gasolineClazz = "This is the child class";
    }
    
    @Override
    public void typeOfPayment(){
        System.out.println("We only accept cash payments");
        debitCardPayment();
        creditCardPayment();
        gCashPayment();
        payMayaPayment();
        payPalPayment();
    }
    
    public void typeOfPayment(String methodPaymentCheque){
        System.out.println(methodPaymentCheque + " is also available");
    }
    
    public void debitCardPayment(){
        System.out.println("We accept all debit cards");
    }
    
    public void creditCardPayment(){
        System.out.println("We accept all credit cards");
    }
    
    public void gCashPayment(){
        System.out.println("We accept gcash");
    }
    
    public void payMayaPayment(){
        System.out.println("We accept paymaya");
    }
    
    public void payPalPayment(){
        System.out.println("We accept paypal");
    }
}
