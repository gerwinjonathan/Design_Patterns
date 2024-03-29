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
public class HexaObserver extends Observer {
    
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Hexa String : "+Integer.toHexString(subject.getState()));
    }
    
    
}
