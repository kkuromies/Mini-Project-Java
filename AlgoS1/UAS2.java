/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoS1;

import java.util.Scanner;

/**
 *
 * @author divisipromosi
 */

public class UAS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        char Option; 
        double luas, volume;
        
        System.out.println("MENU : ");
        System.out.println("a. Luas Jajar Genjang ");
        System.out.println("b. Volume Tabung ");
        System.out.println("c. Volume Bola ");
        System.out.print("Masukkan Pilihan anda (a/b/c)? ");
        
        Option = in.next().charAt(0);
        System.out.println("=================================== ");
        
        System.out.println();
        
        switch (Option){
            case 'a' -> {
                System.out.println("Hitung Luas Jajar Genjang!!");
                // Menghitung Luas Jajar Genjang
                System.out.print("Masukkan alas: ");
                double alas = in.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = in.nextDouble();
                luas = new UAS2_Rumus().Luas_Jajar_Genjang(alas, tinggi);
                System.out.println("Luas Jajar Genjang: " + luas);
            }
                
            case 'b' -> {
                System.out.println("Hitung Volume Tabung!!");
                // Menghitung Volume Tabung
                System.out.print("Masukkan jari-jari tabung: ");
                double Rt = in.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiT = in.nextDouble();
                volume = new UAS2_Rumus().Volume_Tabung(Rt, tinggiT);
                System.out.println("Volume Tabung: " + volume);
            }
                
            case 'c' -> {
                System.out.println("Hitung Volume Bola!!");
                // Menghitung Volume Bola
                System.out.print("Masukkan jari-jari bola: ");
                double Rb = in.nextDouble();
                volume = new UAS2_Rumus().Volume_Bola(Rb);
                System.out.println("Volume Bola: " + volume);
            }
                
            default -> System.out.println("Option yang anda inputkan salah !!! ");
        }
    }
    
}

