package atv_4;
 
public class atv_4 {

    public static void main(String[] args) {
        Integer i;
        Integer soma = 0;
        long par = 1;
            for(i = 0; i <= 30; i++){
                if (i % 2 == 1){
                soma += i;
                }else{
                     if (i > 0)
                     par *= i;
            }
        }

            System.out.println("A soma dos números ímpares é: " + soma);
            System.out.println("A multiplicação dos números pares é: " + par);
    }
}