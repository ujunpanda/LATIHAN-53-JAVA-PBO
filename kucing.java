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
public class kucing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Rabbit cat = new Rabbit ("Peter", false, "grass",0,"grey");
      System.out.println("hello, his name is "+cat.getName());
      System.out.println(cat.getName()+" is vegeterian?"+cat.isVegetarian());
      System.out.println(cat.getName()+" eats? "+cat.getEats());
      System.out.println(cat.getName()+" has "+cat.getNoOfLegs()+" legs");
      System.out.println(cat.getName()+" color is "+cat.getColor());
    }
    
}
