package ODEV1;

public class Egitimler {

    public Egitimler(int id, String name, Kategori kategori, Egitmen egitmen) {
        this.id = id;
        this.name = name;
        this.kategori = kategori;
        this.egitmen = egitmen;
    }

    public Egitimler() {
    }


    private int id;
    private String name;
    private Kategori kategori;
    private Egitmen egitmen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Egitmen getEgitmen() {
        return egitmen;
    }

    public void setEgitmen(Egitmen egitmen) {
        this.egitmen = egitmen;
    }
}
