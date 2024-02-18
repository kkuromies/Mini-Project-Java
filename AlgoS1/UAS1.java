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
public class UAS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner in = new Scanner(System.in);

        // Pendefinisian array yang menyimpan 5 data
        int [] data = new int[5];

        System.out.println("Masukkan 5 Angka:");

        // Memakai while untuk menerima input data sebanyak 5 kali
        int z = 0 ;
        while (z < 5){
            System.out.print("Angka ke-" + (z + 1) + ": ");
            data[z] = in.nextInt();
            z++;
        }
        
        System.out.println("====================");

        // Menampilkan kembali angka yang telah diinput
        System.out.println("Angka yang telah diinput:");
        
        int x = 0 ;
        while(x< 5){
            System.out.println((x+1) + "." + data[x]);
            x++;
        }
    }
}