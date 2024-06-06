package bsp.gov.ph.model;

public abstract class CreditCardRegulations {
    public abstract void creditCardPayment(String creditCard) throws InterruptedException;
    public abstract boolean isNumberEqualTo16(String creditCardNumber);
    public abstract boolean isCreditCardNumberValid(String creditCardNumber);
    
    public void sayThanks(){
        System.out.println("Thanks for using our credit card services");
    }
}
