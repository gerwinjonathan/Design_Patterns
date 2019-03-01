/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Template;

/**
 *
 * @author Gerwin Jo
 */
public abstract class Game {
    abstract void init();
    abstract void start();
    abstract void end();
    
    public final void play() {
        init();
        start();
        end();
    }
}
