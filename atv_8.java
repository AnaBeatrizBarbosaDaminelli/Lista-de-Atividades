package Atv_6;

import java.util.Scanner;

public class atv_6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double valor, quilo, libra;

        System.out.println("Digite um valor para ser convertido: ");
        valor = read.nextDouble();

        libra = (valor * 2.2046);
        quilo = (valor * 0.454);

        System.out.println("O valor escolhido convertido para libras é de: " + libra + " lb");
        System.out.println("O valor escolhido convertido para quilos é de: " + quilo + " kg");
        // quilo->libra = quilo * 2,2046 lb
        // libras->quilo = libras * 0,454 kg
    }
}
