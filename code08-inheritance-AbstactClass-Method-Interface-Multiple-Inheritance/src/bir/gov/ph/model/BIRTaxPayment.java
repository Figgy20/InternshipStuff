/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bir.gov.ph.model;

/**
 *
 * @author m303user
 */
public interface BIRTaxPayment {
    double VAT_AMOUNT = .12;
    
    double computeVat(double amountPurchased);
        
}
