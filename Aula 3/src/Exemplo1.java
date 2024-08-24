public class Exemplo1 {
    public static void main(String[] args) {
        int [] numeros = {1,3,4,5};
        for(int i=0;i<numeros.length;i++){
            System.out.println("Números: "+numeros[i]);
        }
        String [] frutas = {"maçã","Pêra","Banana"};
        String valor ="0";
        int valorint = Integer.valueOf(valor);
        while (valorint<frutas.length){
            System.out.println("Fruta: "+frutas[valorint]);
            valorint++;
        }
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________");

        for(Integer a:numeros){
            System.out.println(a);
        }
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________");

        for (String b:frutas){
            System.out.println(b);
        }

        int [] numeros2 = new int[10];
        numeros2[4]= 6;
        System.out.println(numeros2[4]);

    }
}
