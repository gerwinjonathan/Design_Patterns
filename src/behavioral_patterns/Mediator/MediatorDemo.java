/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Mediator;

/**
 *
 * @author Gerwin Jo
 */
public class MediatorDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
