public class atv_5 {
public static void main(String[] args) {
    for (int i = 2; i <= 123; i++) {
    if(primo(i) )
    System.out.println(i + " é um número primo.");
        }     
    }
private static boolean primo(int num) {
    for (int j = 2; j < num; j++) {
    if (num % j == 0)
    return false;   
    }
   return true;
    }
}
