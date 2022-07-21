package ODEV1;

public class EgitimManager {

    private int id;
    private String name;
    private Kategori kategori;
    private Egitmen egitmen;

    public Egitimler egitimEkle(int id, String name, Kategori kategori, Egitmen egitmen ){
        return new Egitimler(id,name,kategori,egitmen);
    }

    public void adDegistir(Egitimler egitim, String name){
        egitim.setName(name);
    }

}
