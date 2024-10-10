package module4;

import java.util.Scanner;

public class bPerbandinganBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama : ");
        int bilangan1 = input.nextInt();
        
        System.out.print("Masukkan Bilangan Kedua : ");
        int bilangan2 = input.nextInt();
        
        if (bilangan1 >= bilangan2) {
            System.out.println("Bilangan "+bilangan1+" lebih besar dari bilangan "+bilangan2);
        }
        else {
            System.out.println("Bilangan "+bilangan1+" tidak lebih besar dari bilangan "+bilangan2);
        }
        input.close();
    }
}
