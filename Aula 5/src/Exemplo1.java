import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exemplo1 {
    public static void main(String[] args) {
        String[] frutasArray={"Maçã","Pêra","Manga","uva"};
        List<String> frutasList=new ArrayList<String>();
        frutasList.add("Maracuja");
        frutasList.add("Romã");
        frutasList.add("Morango");
        frutasList.add("Abacaxi");
        frutasList.add("Goiaba");
        frutasList.add("Pequi");
        frutasList.add("Jaca");
        //System.out.println(frutasList.get(1));
        System.out.println("---");

        System.out.println("---");
        for(int i=0;i< frutasList.size();i++){
            System.out.println(frutasList.get(i));
        }
        System.out.println("---");
        for(String fruta:frutasArray){
            System.out.println(fruta);
        }
        System.out.println("---");
        frutasList.forEach((fruta) -> {
            System.out.println(fruta);
        });
        System.out.println("---");
        int max= Integer.MIN_VALUE;
        String maiorNome ="";
        for(int i=0;i<frutasList.size();i++){
            if(frutasList.get(i).length() > max){
                max=frutasList.get(i).length();
                maiorNome=frutasList.get(i);
            }
        }
        System.out.println(maiorNome);
        System.out.println("----");
        int min= Integer.MAX_VALUE;
        String menorNome ="";
        for(int i=0;i<frutasList.size();i++){
            if(frutasList.get(i).length() < min){
                min=frutasList.get(i).length();
                menorNome=frutasList.get(i);
            }
        }
        System.out.println(menorNome);
        System.out.println("---");
        Collections.sort(frutasList);
        for(int i=0;i< frutasList.size();i++){
            System.out.println(frutasList.get(i));
        }
        System.out.println("---");
        Collections.sort(frutasList, Comparator.reverseOrder());
        for(int i=0;i< frutasList.size();i++){
            System.out.println(frutasList.get(i));
        }
    }
}
