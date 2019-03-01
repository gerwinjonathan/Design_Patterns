/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational_patterns.Builder;

/**
 *
 * @author Gerwin Jo
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}