/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational_patterns.Singleton;

/**
 *
 * @author Gerwin Jo
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject obj = SingleObject.getInstance();
        obj.showMessage();
    }
}
