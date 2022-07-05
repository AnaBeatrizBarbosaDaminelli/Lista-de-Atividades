package Atv_5;

import java.util.Scanner;

public class atv_5 {

    public static void main(String[] args) {
        Scanner pagamento = new Scanner(System.in);
        double valor, salario;

        System.out.println("Digite a quantidade de horas que você trabalhou: ");
        valor = pagamento.nextDouble();

        salario = (valor * 10.25);

        System.out.println("O seu salário será de: " + salario + " reais");

        if (salario < 50.00)
            System.out.println("Atenção, dirija-se à direção do Hotel!");

    }
}
