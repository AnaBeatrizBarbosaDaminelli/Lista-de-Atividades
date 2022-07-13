package Atv_4;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner pagamento = new Scanner(System.in);
        double valor, salario;10

        System.out.println("Digite a quantidade de horas que você trabalhou: ");
        valor = pagamento.nextDouble();

        salario = (valor * 10.25);

        System.out.println("O seu salário será de: " + salario + " reais");
    }
}
