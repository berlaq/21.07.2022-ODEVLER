package ODEV2;

public class Main {

    public static void main (String[] args){

        //System.out.println(topla(2,33,4,5));
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(4,5,6));
        DortIslem dortIslem2 = new DortIslem(8,4);
        System.out.println(dortIslem2.cikar());
        System.out.println(dortIslem2.carp());
        System.out.println(dortIslem2.bolme());
    }



    // Variable Arguments
    public static int topla(int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar){
            toplam += sayi;
        }
        return toplam;
    }

}
