/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */

class Lingkaran{
    public double diameter, jari, luas, keliling;
    public final double phi = 3.14;
    public boolean check;
    
    public void hitungLingkaran(double d){
      
        jari = d / 2;
        luas = phi * jari * jari;
        keliling = phi * 2 * jari;
        System.out.println();
        System.out.println("=====Hasil Perhitungan Lingkaran====");
        System.out.printf("Jari-jari Lingkaran\t\t= " + jari + " cm \n");
        System.out.printf("Luas Lingkaran\t\t\t= " + luas + " cm \n");
        System.out.printf("Keliling lingkaran\t\t= " + keliling + " cm \n");
    }
}

public class IF10K10119912Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        Lingkaran lingkaran = new Lingkaran();
    
        System.out.println("======Perhitungan Lingkaran====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true) 
        {
            try {
                lingkaran.diameter = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }
        
        lingkaran.hitungLingkaran(lingkaran.diameter); 
       
    }
    
}
