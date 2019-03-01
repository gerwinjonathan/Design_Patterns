/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational_patterns.Abstract_Factory_Method;

/**
 *
 * @author Gerwin Jo
 */
public class AbstractFactoryMethodDemo {
    public static void main(String[] args) {
        AbstractFactory shaperounded = FactoryProducer.getFactory(true);
        
        Shape shape1 = shaperounded.getShape("RECTANGLE");
        
        shape1.draw();
        
        Shape shape2 = shaperounded.getShape("SQUARE");
        
        shape2.draw();
        
        AbstractFactory shape = FactoryProducer.getFactory(false);
        
        Shape shape3 = shape.getShape("SQUARE");
        
        shape3.draw();
        
    }
}
