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
public class Kerucut extends BangunRuang{

    private double Jarijari;
    private double Tinggi;

    public double getJarijari() {
        return Jarijari;
    }

    public void setJarijari(double Jarijari) {
        this.Jarijari = Jarijari;
    }

    public double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }
    
    @Override 
    public double hitungVolume() {
        return (22 * Jarijari * Jarijari * Tinggi) / 7 / 3;
    
    }
 

}
