/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihian62.livingthing;

/**
 *
 * @author X441UV
 */
public class PBO210117072Latihian62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human hm = new Human();
        
        hm.setNama("Muhammad Riswanda Hasan");
        hm.walk(hm.getNama());
        hm.breath(hm.getNama());
        hm.eat(hm.getNama());
    }
    
}
