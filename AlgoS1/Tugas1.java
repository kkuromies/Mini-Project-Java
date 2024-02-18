/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoS1;

/**
 *
 * @author queen
 */

import java.util.Scanner; // library Scanner

public class Tugas1 {
    public static void main(String[] args){
        int M;
        Scanner in = new Scanner(System.in); //
     
        System.out.print("Masukan Umur : "); //output Masukan Umur:
        M = in.nextInt(); // input umur
        
        if(M < 18){ // jika M kurang dari 18 akan muncul output " Kamu Masuk Bocahh"
            System.out.println("Kamu Masuk Bocahh");
        }else if(M >=18 && M <= 35){ // jika M lebih dari sama dengan 18 dan M kurang dari sama dengan 35, output yang akan muncul "kamu udah lulus kuliah atau belum?");
            System.out.println("kamu udah lulus kuliah atau belum?");
        }else{ // jika selain kondisi diatas akan muncul output "udah nikah belum?"
            System.out.println("udah nikah belum?");
            
        }
    }
}
