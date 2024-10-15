package module4;

import java.util.Scanner;

public class dDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Diskon 10% Untuk Minimal Belanja Rp 1.000.000");
        System.out.println("Harga Perbarang Rp 100.000");      
        System.out.println("");
        System.out.print("Masukkan Jumlah Barang : ");
        int jumlahBarang = input.nextInt();
        
        double harga, diskon, hargaDiskon;
        
        harga = jumlahBarang * 100000;
        diskon = harga * 0.1;
        hargaDiskon = harga - diskon;       
        
        if (harga >= 1000000) {
            System.out.println("Total Harga         : "+harga+ " Rupiah");
            System.out.println("Potongan Harga      : "+diskon+ " Rupiah");
            System.out.println("Harga Yang Dibayar  : "+hargaDiskon+ " Rupiah");
        }
        else {
            System.out.println("Total Harga "+harga+ " Rupiah");
        }
        input.close();
    }
}
