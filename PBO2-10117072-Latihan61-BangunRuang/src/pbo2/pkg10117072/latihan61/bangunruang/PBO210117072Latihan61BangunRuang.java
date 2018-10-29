/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan61.bangunruang;

/**
 *
 * @author X441UV
 */
public class PBO210117072Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bl = new Bola();
        bl.setJariJari(7);
        System.out.println("Volume Bola");
        System.out.println("V = " +bl.hitungVolume()+"\n");
        
        Tabung tb = new Tabung();
        tb.setJariJari(10);
        tb.setTinggi(21);
        System.out.println("Volume Tabung");
        System.out.println("V = " +tb.hitungVolume()+"\n");
        
        Kerucut krc = new Kerucut();
        krc.setJarijari(9);
        krc.setTinggi(14);
        System.out.println("Volume Kerucut");
        System.out.println("V = " +krc.hitungVolume());
    
    }
    
}
