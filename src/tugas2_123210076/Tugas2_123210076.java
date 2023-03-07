
package tugas2_123210076;

import java.util.Scanner;
import tugas2_123210076.ruang.Balok;
import tugas2_123210076.ruang.Tabung;

public class Tugas2_123210076 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        char ulang;
        
        do {
            System.out.println("\n==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung volume dan luas permukaan Balok");
            System.out.println("2. Hitung volume dan luas permukaan Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang balok : ");
                    int panjang = input.nextInt();
                    System.out.print("Masukkan lebar balok : ");
                    int lebar = input.nextInt();
                    System.out.print("Masukkan tinggi balok : ");
                    int tinggi = input.nextInt();
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    
                    System.out.println("Luas Persegi Panjang = " + balok.hitungLuas());
                    System.out.println("Keliling Persegi Panjang = " + balok.hitungKeliling());
                    System.out.println("Volume Balok = " + balok.hitungVolume());
                    System.out.println("Luas Permukaan Balok = " + balok.hitungLuasPermukaan());
                    
                    break;
                    
                case 2:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jari = input.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    int Tinggi = input.nextInt();
                    
                    Tabung tabung = new Tabung(jari, Tinggi);
                    
                    System.out.println("Luas Lingkaran = " + tabung.hitungLuas());
                    System.out.println("Keliling Lingkaran = " + tabung.hitungKeliling());
                    System.out.println("Volume Tabung = " + tabung.hitungVolume());
                    System.out.println("Luas Permukaan Tabung = " + tabung.hitungLuasPermukaan());
                    
                    break;
                    
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                    
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
      
            System.out.println("\nKembali ke Menu (y/n) : ");
            ulang = input.next().charAt(0);
            
            System.out.println();
        
        } while (ulang != 'n');
        System.out.println("Terima kasih telah menggunakan program ini.");

    }
    
}
