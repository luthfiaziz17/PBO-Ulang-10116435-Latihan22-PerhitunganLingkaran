/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang10116435latihan22perhitunganlingkaran;
import java.util.Scanner;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */
public class PBOUlang10116435Latihan22PerhitunganLingkaran {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String d; // variabel validasi
        double diameter; //variabel untuk operand
        double r; //jari-jari
        double L; //luas
        double K; //keliling
        Scanner lkr = new Scanner(System.in);
        
        System.out.println("===Perhitungan Lingkaran===");
        
        //Menggunakan looping do while
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = lkr.nextLine();
            //validasi input yang masuk
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        
        System.out.println("===Hasil Perhitungan Lingkaran===");
        diameter = Double.parseDouble(d); 
        
       //Proses Hitung lingkaran
        r = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
        
    }
    
}
