package module4;

import java.util.Scanner;

public class gSikuSiku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sisi A : ");
        double sisiA = input.nextDouble();
        
        System.out.print("Sisi B : ");
        double sisiB = input.nextDouble();
        
        System.out.print("Sisi C : ");
        double sisiC = input.nextDouble();

        if (Math.pow(sisiA, 2) == (Math.pow(sisiB, 2)) + (Math.pow(sisiC, 2))) {
            System.out.println("Segitiga tersebut berbentuk siku-siku");
        }
        else if (Math.pow(sisiB, 2) == (Math.pow(sisiA, 2)) + (Math.pow(sisiC, 2))) {
            System.out.println("Segitiga tersebut berbentuk siku-siku");
        }
        else if (Math.pow(sisiC, 2) == (Math.pow(sisiA, 2)) + (Math.pow(sisiB, 2))) {
            System.out.println("Segitiga tersebut berbentuk siku-siku");        
        }
        else {
            System.out.println("Segitiga tersebut tidak berbentuk siku-siku");
        }
        input.close();
    }
}
