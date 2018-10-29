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
public class Bola extends BangunRuang{
    private double jariJari;
    private double V;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    

    @Override
    public double hitungVolume() {
        return  (jariJari * jariJari * jariJari * 4 * 22) / 3 / 7 ;
      
    }
    
}
