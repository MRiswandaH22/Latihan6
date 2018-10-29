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
public class Tabung extends BangunRuang{
    
    private double jariJari; 
    private double tinggi; 

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return 3.14*jariJari*jariJari*tinggi;
    
    }
    
    
}
