package ODEV2;

public class DortIslem {

    public DortIslem(){

    }

    public DortIslem(int sayi1, int sayi2){
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    private int sayi1;
    private int sayi2;

    public int topla(int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar){
            toplam += sayi;
        }
        return toplam;
    }

    public int cikar(){

        return sayi1-sayi2;
    }

    public int carp(){

        return sayi1*sayi2;
    }

    public int bolme(){
        return sayi1/sayi2;
    }
}
