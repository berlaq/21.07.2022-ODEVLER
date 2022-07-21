package ODEV1;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main (String[] args){

        //System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8));


        Kategori kategori1 = new Kategori(1,"Programlama");
        Egitmen egitmen1 = new Egitmen(1,"veritabanı");
        Egitimler egitim1 = new Egitimler(1,"Java",kategori1,egitmen1);
        Egitimler egitim2 = new Egitimler(2,"Angular",kategori1,egitmen1);

        //foknsiyon ile egitim örneği oluşturma
        EgitimManager egitimManager = new EgitimManager();
        Egitimler egitim3 = egitimManager.egitimEkle(3,"c++",kategori1,egitmen1);

        Egitimler[] egitimler = new Egitimler[]{egitim1,egitim2, egitim3};

        //varolan bir egitimin ismini değiştirme
        egitimManager.adDegistir(egitim3,"C#");


        for (Egitimler egitim:
             egitimler) {
            System.out.println(egitim.getName());
            System.out.println(egitim.getEgitmen().getName());
            System.out.println(egitim.getKategori().getName());
        }

    }

}
