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
public class Rabbit extends Animal {
     private String color; 
     private String name; 
     public Rabbit (String name, boolean veg, String food, int legs, String color ){
         super (veg, food, legs);
         this.name = name;
         this.color = color;
     
     }
     
     public String getColor(){
         return color;
     }
     
     public String getName(){
         return name;
     }

}
