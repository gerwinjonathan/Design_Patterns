/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Interpreter;

/**
 *
 * @author Gerwin Jo
 */
public class InterpreterDemo {
    public static Expression getMale() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }
    
    public static Expression getMarriedWoman() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
    
    public static void main(String[] args) {
        Expression isMale = getMale();
        Expression isMarried = getMarriedWoman();
        
        System.out.println("John is male?" +isMale.interpret("John"));
        System.out.println("Julie is a married women?"+isMarried.interpret("Married Julie"));
    }
}
