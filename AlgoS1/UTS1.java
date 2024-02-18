/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoS1;

/**
 *
 * @author queen
 */


public class UTS1 {
    public static void main(String args []) {
        int baris =3;

        int i,k;
        for(i = 1; i <= baris; ++i) {
            for(k = 1; k <= baris - i; ++k) {
                System.out.print(" ");
            }

            for(k = 1; k <= 2 * i - 1; ++k) {
                System.out.print("X");
            }

            System.out.println();
        }

        for(i = baris - 1; i >= 1; --i) {
            for(k = 1; k <= baris - i; ++k) {
                System.out.print(" ");
            }

            for(k = 1; k <= 2 * i - 1; ++k) {
                System.out.print("X");
            }

            System.out.println();
        }

    }
}

/*
Output :
  X
 XXX
XXXXX
 XXX
  X
*/
