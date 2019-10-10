/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan21;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Program Rata-Rata Nilai
 */

public class Latihan21 {

    public static void main(String[] args) {
        //kamus lokal
        int i, mahasiswa;
        double rata_rata;
        double totalnilai = 0;
        double [] nilai = new double [10];
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa = input.nextInt();
        
        for (i = 1; i <= mahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = input.nextDouble();
            totalnilai = totalnilai + nilai[i];
        }   
        
        rata_rata = totalnilai / mahasiswa;
        
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata_rata);
        System.out.println("");
        System.out.println("Developed by : Zaenal Anzarry");
        
    }
    
}
