/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural_patterns.Bridge;

/**
 *
 * @author Gerwin Jo
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle : Color: red; radius:"+radius+ "x: "
        +x+" y: "+ y);
    }
    
}
