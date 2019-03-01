/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Command;

/**
 *
 * @author Gerwin Jo
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;
    
    public void buy() {
        System.out.println("Stock name : "+name+
                "Quantity" + quantity + "buy");
    }
    
    public void sell() {
         System.out.println("Stock name : "+name+
                "Quantity" + quantity + "sell");
    }
    
}
