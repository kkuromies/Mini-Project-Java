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


public class UAS3 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

        String data[][] = new String[5][3];

        // input data
        for (int nomor = 1; nomor < 5 ; nomor++) {
            System.out.print("data ke-" + nomor + " Nama : ");
            data[nomor][0] = in.next();
            System.out.print("data ke-" + nomor + " Gaji : Rp.");
            data[nomor][1] = in.next();
            System.out.print("data ke-" + nomor + " Jam Lembur : ");
            data[nomor][2] = in.next();
            System.out.println();
        }
        
        System.out.println("==========================================");
        System.out.println("NO NAMA      GAJI_POKOK        JAM_LEMBUR     TOTAL_GAJI");
        for (int x = 1; x < 5 ; x++) {
            double GajiPokok = Double.parseDouble(data[x][1]);
            double JamLembur = Double.parseDouble(data[x][2]);

            double Tunjangan = GajiPokok * 0.15;
            double UpahLembur = 0.01 * JamLembur * GajiPokok;
            double TotalGaji = GajiPokok + Tunjangan + UpahLembur;

            System.out.print(x + ". ");
            System.out.print(data[x][1]+ " ");
            System.out.print("  Rp."+GajiPokok + " ");
            System.out.print("       "+JamLembur + " ");
            System.out.print("          Rp."+TotalGaji + " ");
            System.out.println();
        }
    }
}


/*
data ke-1 Nama : Rahma_M
data ke-1 Gaji : Rp.3000000
data ke-1 Jam Lembur : 3

data ke-2 Nama : Dinar
data ke-2 Gaji : Rp.4500000
data ke-2 Jam Lembur : 1

data ke-3 Nama : Taufan_Y
data ke-3 Gaji : Rp.1800000
data ke-3 Jam Lembur : 5

data ke-4 Nama : Michael_R
data ke-4 Gaji : Rp.2500000
data ke-4 Jam Lembur : 0

==========================================
NO NAMA      GAJI_POKOK        JAM_LEMBUR     TOTAL_GAJI
1. 3000000   Rp.3000000.0        3.0           Rp.3540000.0 
2. 4500000   Rp.4500000.0        1.0           Rp.5220000.0 
3. 1800000   Rp.1800000.0        5.0           Rp.2160000.0 
4. 2500000   Rp.2500000.0        0.0           Rp.2875000.0 
*/