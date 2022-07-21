package Workshop1;

public class Main {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci();
		Egitimler egitim1 = new Egitimler();
		Egitmen egitmen1 = new Egitmen();
		Kategori kategori1 = new Kategori();
		
		egitmen1.setId(1);
		egitmen1.setName("Engin Demirog");
		
		kategori1.setId(1);
		kategori1.setName("Programlama");
		
		egitim1.setId(1);
		egitim1.setEgitmen(egitmen1);
		egitim1.setKategori(kategori1);
		egitim1.setYuzde(50);
		egitim1.setName("Java");
		
		ogrenci1.setId(1);
		ogrenci1.setName("Berkay Haberal");
		ogrenci1.setEgitimler(egitim1);
		
		System.out.println(ogrenci1.getName());
		System.out.println(ogrenci1.getId());
		System.out.println(ogrenci1.getEgitimler().getEgitmen().getName());
		System.out.println(egitim1.getEgitmen().getName());
		
	}

}
