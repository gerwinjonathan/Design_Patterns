/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational_patterns.Prototype;

/**
 *
 * @author Gerwin Jo
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());
        
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println(clonedShape2.getType());
    }
}
