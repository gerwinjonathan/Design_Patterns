/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Observer;

/**
 *
 * @author Gerwin Jo
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        
        System.out.println("First : 15");
        subject.setState(15);
        
        System.out.println("Second : 10");
        subject.setState(10);
    }
    
}
