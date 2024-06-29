import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2,soma;
        System.out.println("Entre um número:");
        num1 = teclado.nextInt();
        System.out.println("Entre outro número:");
        num2 = teclado.nextInt();
        soma = num1+num2;
        System.out.println(num1+" + "+num2+" = "+soma);
        teclado.close();
    }
}
