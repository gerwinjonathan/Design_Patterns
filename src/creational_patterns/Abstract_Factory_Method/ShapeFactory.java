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
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
    
}
