/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural_patterns.Proxy;

/**
 *
 * @author Gerwin Jo
 */
public class RealImage implements Image{
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying : "+filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading : "+filename);
    }
    
    
}
