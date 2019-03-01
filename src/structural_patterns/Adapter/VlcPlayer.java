/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural_patterns.Adapter;

/**
 *
 * @author Gerwin Jo
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file : "+filename);
    }

    @Override
    public void playMp4(String filename) {    }
    
}
