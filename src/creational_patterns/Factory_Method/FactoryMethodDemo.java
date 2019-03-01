/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational_patterns.Factory_Method;

/**
 *
 * @author Gerwin Jo
 */

public class FactoryMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();
        
        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();
        
        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        shapeSquare.draw();
    }
    
}
