/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Memento;

/**
 *
 * @author Gerwin Jo
 */
public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker caretaker = new CareTaker();
        
        originator.setState("State 1");
        originator.setState("State 2");
        caretaker.add(originator.saveStateToMemento());
        
        originator.setState("State 3");
        caretaker.add(originator.saveStateToMemento());
        
        originator.setState("State 4");
        System.out.println("Current : "+originator.getState());
        
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First save state : "+originator.getState());
    }
}
