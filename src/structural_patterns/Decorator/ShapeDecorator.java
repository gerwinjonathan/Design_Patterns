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
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
