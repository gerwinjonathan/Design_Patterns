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
public class BuilderDemo {
    
    public static void main(String[] args) {
        
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareVegMeal();
        
        vegMeal.showItems();
        
        System.out.println("Total : " + vegMeal.getCost());
    }
    
}
