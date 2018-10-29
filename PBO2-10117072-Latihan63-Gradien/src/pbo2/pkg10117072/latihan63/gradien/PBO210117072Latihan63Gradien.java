/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan63.gradien;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menghitung koordinat
 *                        Garis lurus
 *                          
 */
public class PBO210117072Latihan63Gradien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Koordinat kd = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+kd.getX1()+","+kd.getY1()+") dan ("+kd.getX2()+","+kd.getY2()+") memiliki gradien sebesar "+kd.hitungGrandien() );
    
        Koordinat kd2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+kd2.getX1()+","+kd2.getY1()+") dan ("+kd2.getX2()+","+kd2.getY2()+") memiliki gradien sebesar "+kd2.hitungGrandien() );
    
    
        
    }
    
}
