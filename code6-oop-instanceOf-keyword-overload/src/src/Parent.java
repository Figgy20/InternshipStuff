/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m303user
 */
package src;

public class Parent {
    public String gasolineClazz;
    public Parent(){
        this.gasolineClazz = "This is the parent class";
    }
    
    public void typeOfPayment(){
        System.out.println("We only accept cash");
    }
}
