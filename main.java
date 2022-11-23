/**
 *
 * @author Amdzak
 */

package com.main.kasuskelulusan;

import java.util.Scanner;

public class KasusKelulusan {
    public static void main(String[] args) {
        //CREATE SCANNER OBJEK
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        int nilai;
        String hasil;
        
        //INPUT USER
        System.out.println("=== Program Kelulusan Sederhana ===");
        System.out.print("Masukan Nilai anda : ");
        nilai = input.nextInt();
        
        //TERNARY OPERATOR IF ELSE 
        hasil = (nilai >= 70) ? " Selamat anda dinyatakan lulus " : " Maaf anda Dinyatakan Gagal ";
        System.out.println("\nNilai anda " + nilai + hasil);
    }
}
