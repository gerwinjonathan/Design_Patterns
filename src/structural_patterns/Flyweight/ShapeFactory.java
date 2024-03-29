/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural_patterns.Flyweight;

import java.util.HashMap;

/**
 *
 * @author Gerwin Jo
 */
public class ShapeFactory {
    
    private static final HashMap circleMap = new HashMap();
    
    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating : "+color);
        }
        return circle;
    }
    
}
