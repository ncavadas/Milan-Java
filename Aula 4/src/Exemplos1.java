public class Exemplos1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Números pares máximos e mínimos do array");
        int[] numeros = {2, -24, 37, -45, 52};
        int max= Integer.MIN_VALUE;
        for(int i=0;i<numeros.length;i++){
            if (numeros[i]%2==0){
                if(max<numeros[i]){
                    max=numeros[i];
                }
            }
        }
        System.out.println("Valor máximo par: "+max);

        int min= Integer.MAX_VALUE;
        for(int i=0;i<numeros.length;i++){
            if (numeros[i]%2==0){
                if(min>numeros[i]){
                    min=numeros[i];
                }
            }
        }
        System.out.println("Valor mínimo par: "+min);
        System.out.println();


        System.out.println("Números ímpares máximos e mínimos do array");
        int[] numeros2 = {2, -24, 37, -45, 52};
        int maxim= Integer.MIN_VALUE;
        for(int i=0;i<numeros2.length;i++){
            if (numeros2[i]%2!=0){
                if(maxim<numeros2[i]){
                    maxim=numeros2[i];
                }
            }
        }
        System.out.println("Valor máximo ímpar: "+maxim);

        int minpar= Integer.MAX_VALUE;
        for(int i=0;i<numeros2.length;i++){
            if (numeros[i]%2!=0){
                if(minpar>numeros2[i]){
                    minpar=numeros2[i];
                }
            }
        }
        System.out.println("Valor mínimo ímpar: "+minpar);
    }
}
