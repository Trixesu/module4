package module4;

import java.util.Scanner;

public class fUrutanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan Pertama : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan Bilangan Kedua : ");
        int bil2 = input.nextInt();
        
        System.out.print("Masukkan Bilangan Ketiga : ");
        int bil3 = input.nextInt();
        
        input.close();
    }
}
