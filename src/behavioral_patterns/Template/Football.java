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
public class Football extends Game {

    @Override
    void init() {
        System.out.println("Football init!");
    }

    @Override
    void start() {
        System.out.println("Football game start");
    }

    @Override
    void end() {
        System.out.println("Football finished!");
    }
    
}
