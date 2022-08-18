import java.util.Scanner;

public class Recursao {

    public static int number=0;
     public static int numerof = 0 ;
    public static int i = 0;

    public static double  Fatorial(double x) {
        if (x != 0) {
            return x * Fatorial( x - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    System.out.printf("Entre com número fatorial:");
    double A = ler.nextDouble();
        double B = Fatorial(A);
        System.out.print("O valor fatorial de " + A + " e " + B);
    }
}