/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral_patterns.Iterator;

/**
 *
 * @author Gerwin Jo
 */
public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository names = new NameRepository();
        
        for (Iterator iter = names.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : "+name);
        }
    }
}
