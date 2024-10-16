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
              
        if (bil1 <= bil2 && bil2 <= bil3) {
            System.out.println("Urutan Bilangan : "+bil1+", "+bil2+", "+bil3);
        }
        else if (bil1 <= bil3 && bil3 <= bil2) {
            System.out.println("Urutan Bilangan : "+bil1+", "+bil3+", "+bil2);
        }
        else if (bil2 <= bil1 && bil1 <= bil3) {
            System.out.println("Urutan Bilangan : "+bil2+", "+bil1+", "+bil3);
        }
        else if (bil2 <= bil3 && bil3 <= bil1) {
            System.out.println("Urutan Bilangan : "+bil2+", "+bil3+", "+bil1);
        }
        else if (bil3 <= bil1 && bil1 <= bil2) {
            System.out.println("Urutan Bilangan : "+bil3+", "+bil1+", "+bil2);
        }
        else {
            System.out.println("Urutan Bilangan : "+bil3+", "+bil2+", "+bil1);
        }
        input.close();
    }
}
