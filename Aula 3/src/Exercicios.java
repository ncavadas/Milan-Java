public class Exercicios {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 100) {
            if (a % 3 == 0) {
                System.out.println("Números divisíveis por 3 "+a);
            }
            a++;
        }
        for (int b = 1; b <= 100; b++) {
            if (b % 4 == 0) {
                System.out.println("Números divisíveis por 4 "+b);
            }
        }
        int c = 1;
        do {
            if (c % 5 == 0) {
                System.out.println("Números divisíveis por 5 "+c);
            }
            c++;
        } while (c <= 100);
    }
}
