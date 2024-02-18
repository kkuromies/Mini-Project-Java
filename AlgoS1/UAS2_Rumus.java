/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoS1;

/**
 *
 * @author divisipromosi
 */

public class UAS2_Rumus {
    
    // Luas jajar genjang (a*t)
    public double Luas_Jajar_Genjang(double alas, double tinggi){
        double luas = alas * tinggi;
        return luas;
    }
    
    // Volume Tabung (2πr²t)
    public double Volume_Tabung(double R, double tinggi){
        double pi = Math.PI;
        double volume = 2* pi * Math.pow(R, 2) * tinggi;
        return volume;
    }
    
    // Volume Bola ((4/3) πr³)
    public double Volume_Bola(double R){
        double pi = Math.PI;
        double volume = (4.0 / 3.0) * pi * Math.pow(R, 3);
        return volume;
    }  
}
