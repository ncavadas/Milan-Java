public class exemplo3 {
    public static void main(String[] args) {
        int [] numeros = {1,3,4,-5,-8,8,9,14,27,-25};
        System.out.println("Valores do array");
        for(int i = 0;i< numeros.length;i++){
            System.out.print(numeros[i]+" ,");
        }
        System.out.println();
        System.out.println("Valores do array com While");
        int n = 0;
        while (n< numeros.length){
            System.out.print(numeros[n]+" ,");
            n++;

        }
        System.out.println();
        System.out.println("Valores do array");
        for(int i:numeros){
            System.out.print(i+",");
        }
        System.out.println();
        int max= Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println();
        for (int i =0;i< numeros.length;i++){
            if (max<numeros[i]){
                max=numeros[i];
            }
        }
        System.out.println("Valor máximo: "+max);
        System.out.println();

        int min= Integer.MAX_VALUE;
        n = 0;
        System.out.println(min);
        while (n< numeros.length){
            if (min>numeros[n]){
                min=numeros[n];
            }
            n++;
        }
        System.out.println("Valor Minimo: "+min);
        System.out.println();
        //numero par maximo e  numero par minimo.
        //numeros impar maximo e numero impar minimo.

    }
}
