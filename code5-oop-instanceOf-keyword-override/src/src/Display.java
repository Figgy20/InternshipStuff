/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author m303user
 */
import src.Parent;
import src.Child;
public class Display {
    public static void print(Parent obj){
        if (obj instanceof Child) {
            Child objChild = (Child) obj;
            System.out.println(objChild.gasolineClazz);
            objChild.typeOfPayment();
        }
        else if (obj instanceof Parent){
            System.out.println(obj.gasolineClazz);
            obj.typeOfPayment();
        }
    }
}
/*
glass = 500ml coke no ice
pitcher = 2L

glass > pitcher = no loss
pitcher > glass = 
*/