package atv_1;
import java.util.Scanner;

public class atv_1 {
    public static void main (String[]args) {
        Scanner trapezio = new Scanner(System.in);
        float h, bmenor, bmaior, area;

        System.out.println("Digite a altura do trapézio: ");
        h = trapezio.nextFloat();

        System.out.println("Digite a base menor do trapézio: ");
        bmenor = trapezio.nextFloat();

        System.out.println("Digite a base maior do trapézio: ");
        bmaior = trapezio.nextFloat();
        
        area = (h * (bmenor + bmaior)) / 2;

        System.out.println("A área é de: " + area);


    }

    



}
