/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.State;

/**
 *
 * @author Gerwin Jo
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player stop state");
        context.setState(this);
    }
    
    public String toString() {
        return "Stop state";
    }
    
}
