package module4;

import java.util.Scanner;

public class cBeratIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Tinggi Badan : ");
        double tinggiBadan = input.nextDouble();
        
        System.out.print("Masukkan Berat Badan : ");
        double beratBadan = input.nextDouble();
        
        if (90 <= (tinggiBadan - beratBadan)&&(tinggiBadan - beratBadan) <= 110) {
            System.out.println("Berat badan anda ideal");
        }
        else if ((tinggiBadan - beratBadan) < 90){
            System.out.println("Berat badan anda terlalu gemuk");
        }
        else {
            System.out.println("Berat badan anda terlalu kurus");        
        }
        input.close();
    }
}

