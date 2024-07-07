public class Exemplo1 {
    public static void main(String[] args) {
        String a = "3";
        String b = "5";
        String c = "9";
        System.out.println("Valor de a "+a+"Valor de b "+b+"Valor de c "+c);

        int anum = Integer.valueOf(a).intValue();
        int bnum = Integer.valueOf(b).intValue();
        int cnum = Integer.valueOf(c).intValue();
        System.out.println("Valor de a "+anum+" Valor de b "+bnum+" Valor de c "+cnum);
        int somanum = anum+bnum+cnum;
        System.out.println("Soma dos números  "+somanum);

    }
}
