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
public abstract class AbstractFactory {
    abstract Shape getShape(String type);
}
