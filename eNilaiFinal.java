package module4;

import java.util.Scanner;

public class eNilaiFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai UTS 1 : ");
        double uts1 = input.nextDouble();

        System.out.print("Masukkan Nilai UTS 2 : ");
        double uts2 = input.nextDouble();

        System.out.print("Masukkan Nilai UAS : ");
        double uas = input.nextDouble();
        
        double nilaiFinal;
        nilaiFinal = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);
        
        System.out.println("NIlai Final Anda adalah "+nilaiFinal);
        
        if (nilaiFinal >= 80) {
            System.out.println("Kriteria NIlai Anda 'A'");
        }
        else if (60 <= nilaiFinal && nilaiFinal < 80) {
            System.out.println("Kriteria NIlai Anda 'B'");
        }
        else if (55 <= nilaiFinal && nilaiFinal < 65) {
            System.out.println("Kriteria NIlai Anda 'C'");
        }
        else {
            System.out.println("Kriteria NIlai Anda 'E'");
        }
        input.close();
    }
}