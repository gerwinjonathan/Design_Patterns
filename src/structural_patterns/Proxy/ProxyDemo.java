/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural_patterns.Proxy;

/**
 *
 * @author Gerwin Jo
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("tes.jpg");
        
        image.display();
        System.out.println("");
        
        image.display();
    }
}
