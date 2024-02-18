/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoS1;

import java.util.Scanner;

/**
 *
 * @author queen
 */

public class UTS2 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String data [][] = new String[4][3]; // deklarasi arrau

//input data
for(int k=0;k<4;k++){
    System.out.print("data ke-"+k+" Nama : ");
    data[k][0] = in.next();
    System.out.print("data ke-"+k+" Gaji : ");
    data[k][1] = in.next();
    System.out.println();
        }

for(int m=0;m<4;m++){
    int rey = Integer.parseInt(data[m][1]); //konversi String ke Int
    
    if(rey>=3_500_000){
        data[m][2]= "Tinggi";
    }else if (rey >=2_000_000 && rey <= 3_500_000) {
        data[m][2]= "Sedang";
    }else{
       data[m][2]= "Kecil"; 
    }
}
   // tampil data
   System.out.println();
   System.out.println("NO NAMA GAJI JENIS GAJI");
   for(int roy=0;roy<4;roy++){
       System.out.print(roy+1+" ");
       System.out.print(data[roy][0]+ " ");
       System.out.print(data[roy][1]+ " ");
       System.out.print(data[roy][2]+ " ");
       System.out.println();
   }
    }
}

/*
run:
data ke-0 Nama : Rahma_M
data ke-0 Gaji : 3000000

data ke-1 Nama : Dinar
data ke-1 Gaji : 4500000

data ke-2 Nama : Taufan_Y
data ke-2 Gaji : 1800000

data ke-3 Nama : Michael_R
data ke-3 Gaji : 2500000


NO NAMA GAJI JENIS GAJI
1 Rahma_M 3000000 Sedang 
2 Dinar 4500000 Tinggi 
3 Taufan_Y 1800000 Kecil 
4 Michael_R 2500000 Sedang 
*/

