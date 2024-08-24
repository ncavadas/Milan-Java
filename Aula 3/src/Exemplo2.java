import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        int [] Elementos = new int [8];
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        while (x<Elementos.length){
            System.out.println((x+1)+"/"+Elementos.length);
            System.out.println("Insira o valor: ");
            Elementos[x] = teclado.nextInt();
            x++;
        }
        System.out.println("Array completo");
        for(Integer a:Elementos){
            System.out.print(a+"/");
        }
        System.out.println("Números ímpares dentro do array:");
        for(Integer b:Elementos){
            if (b%2!=0){
                System.out.print(b+"/");
            }
        }


    }
}
