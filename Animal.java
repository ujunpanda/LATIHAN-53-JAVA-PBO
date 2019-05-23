/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan53;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class Animal {
    protected boolean vegetarian; 
    protected String eats; 
    protected int no0fLegs;
    
    
    public Animal(boolean vegetarian, String food, int legs){ 
            this.vegetarian = vegetarian; 
            this.eats = food; 
            this.no0fLegs = legs;
} 
    public boolean isVegetarian() {
            return vegetarian; 
    } 
    public String getEats() {
            return eats; 
    }
    
    public int getNoOfLegs(){
        int noOfLegs = 4;
        return noOfLegs;
    }
        
}