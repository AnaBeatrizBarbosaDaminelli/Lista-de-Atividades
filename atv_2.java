import java.util.Scanner;
public class atv_2 {
    public static void main(String[] args) {
       Scanner trapezio = new Scanner(System.in);
        float h, bmenor, bmaior, area;

        System.out.println("Digite a altura do trapézio: ");
        h = trapezio.nextInt();
        System.out.println("Digite a base menor do trapézio: ");
        bmenor = trapezio.nextInt();
        System.out.println("Digite a base maior do trapézio: ");
        bmaior = trapezio.nextInt();

        area = (h * (bmenor + bmaior)) / 2;
            
        System.out.println("A área exata é: " + area + " metros quadrados");
        System.out.println("A área do trapézio arredondada é de: " + Math.round(a) + " metros quadrados");
   
    }
    
}
