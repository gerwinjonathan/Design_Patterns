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
public interface AdvancedMediaPlayer {
    public void playVlc(String filename);
    public void playMp4(String filename);
}
