public class Exemplos2 {
    public static void main(String[] args) {
        int[] numeros = {2,45,5,56,14,15,15,15};

        int soma = 0;
        for(int i=0;i< numeros.length;i++){
            soma +=numeros[i];
        }
        System.out.println("Valor da soma: "+soma);
        Double media= (double) soma/numeros.length;
        System.out.println("Valor da média: "+media);
        int max= Integer.MIN_VALUE;
        for(int i=0;i<numeros.length;i++){
            if(max<numeros[i] && media>numeros[i]){
                max=numeros[i];
            }
        }
        int min= Integer.MAX_VALUE;
        int n=0;
        while (n<numeros.length){
            if(min>numeros[n] && media<numeros[n]){
                min=numeros[n];
            }
            n++;
        }
        System.out.println("Valor máximo: "+max);
        System.out.println("Valor mínimo: "+min);
        int cont=0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==100){
                cont+=1;
            }
        }
        System.out.println("Existem "+cont+" números 15");
    }

}
