/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural_patterns.Decorator;

/**
 *
 * @author Gerwin Jo
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        
        Shape redCircle = new RedShapeDecorator(new Circle());
        
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle dengan normal");
        circle.draw();
        
        redCircle.draw();
        
        redRectangle.draw();
    }
}
