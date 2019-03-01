/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Strategy;

/**
 *
 * @author Gerwin Jo
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.exeStrategy(10, 5));
        
        
    }
}
