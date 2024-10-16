package module4;

public class jEksekusi {
    public static void main(String[] args) {
        boolean a, b, c;
        a = b = c = true;
        
        if( !a || ( b && c ) ) {
            System.out.println("If executed");
        }
        else {
            System.out.println("else execute");
        }
    }   
}