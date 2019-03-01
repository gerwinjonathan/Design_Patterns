/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Null_Object;

/**
 *
 * @author Gerwin Jo
 */
public class NullCustomer extends AbstractCustomer {
    
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available.";
    }
    
}
