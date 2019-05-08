package SoruBankasi;

public abstract class Sorular {
	
	
	

	//------------------------  CoktanSecmeliSorular   --------------------------------------
	
	

	public static String[][] CoktanSecmeliSorular(){
		String CoktanSecmeliSorular[][] = new String[][]{
			
			// {"katagori","Zorluk","Soru","a","b","c","d","dogrucevap","puan"}; --------> 8
			
			{"matematik","kolay","(7,4,9,5,0,3,6,2)rakamlarla yaz�labilecek en k���k say� ka�t�r?","20.345679","97643520","30245679","29345670","a","2"},
			{"matematik","kolay","(98,96,94,92,90)say� �rt�s�nde 90'dan sonra hangi say� gelmelidir?","84","88","89","86","b","2"},
			{"matematik","kolay","21.560+31.597 i�lemin sonucu ka�t�r?","64.287","53.267","54.167","53.157","d","2"},
			{"matematik","kolay","143.769-79.642 i�leminin sonucu ka�t�r?","57.677","64.127","54.567","48.787","b","2"},
			
			{"matematik","orta","0+(-1)+4+(-5)=?","1","-1","-2","2","c","5"},
			{"matematik","orta","|A+4|=8 ise A=?","4 , -12","-4 , 12","-4 , -12","4 , 12","a","5"},
			{"matematik","orta","say�lardan hangisi en b�y�kt�r?","-4","-6","-|-5|","|-1|","d","5"},
			
			{"matematik","zor","200'un %125'si = ?","300","200","350","400","b","10"},
			{"matematik","zor","x say�s� y say�s�n�n %20'sidir.Buna g�re y say�s� x say�s�n�n % ka��d�r ?","500","400","300","200","a","10"},
			{"matematik","zor","Bir karenin alan�n�n %19 azalt�labilmesi i�in bir kenar�n�n y�zde ka� azalt�lmas� gerekir?","9","10","11","12","b","10"},
			
			
			{"fenbilgisi","kolay","iskelet ve kas sa�l���m�z i�in, a�a��dakilerden hangisini yapmamal�y�z?","duzenli beslenme","spor","duzenli uyku","ag�r y�k kald�rmal�y�z","d","2"},
			{"fenbilgisi","kolay","V�cudumuzdaki kemiklerin birbirine ba�land��� yere ne ad verilir?","iskelet","eklem","damar","diyafram","b","2"},
			{"fenbilgisi","kolay","A�a��dakilerden hangisi �s� yayan ���k kayna�� de�ildir?","ampul","mum","ates bocegi","gunes","c","2"},
			{"fenbilgisi","kolay","A�a��dakilerden hangisi do�al ���k kayna��d�r?","lamba","mesale","simsek","Trafik lambasi","c","2"},
			
			{"fenbilgisi","orta","90 km/h h�zla yol alan bir ara� yar�m saate ka� km yol al�r?","30","45","60","75","b","5"},
			{"fenbilgisi","orta","Ayn� cins atomlardan olu�an saf maddelere ne ad verilir?","karisim","bilesik","element","molekul","c","5"},
			{"fenbilgisi","orta","Fotosentez olay� bitkinin hangi k�sm�nda ger�ekle�ir?","k�k","cicek","govde","yaprak","d","5"},
			
			{"fenbilgisi","zor","A�a��dakilerden hangisi kimyasal de�i�meye neden olmaz?","k�flenme","Donma","C�r�me","yanma","b","10"},
			{"fenbilgisi","zor","Mayoz b�l�nme s�ras�nda DNA kendini ka� kez e�ler ?","1","2","3","4","a","10"},
			{"fenbilgisi","zor","D�llenme olay� a�a��dakilerden hangi yap�da ger�ekle�ir?","mayoz","mitoz","Yumurta Kanali","kromozom","c","10"},
		};
		
		return CoktanSecmeliSorular;
	}
	
	
	
	
	
	
	//------------------------  dogruYanlisSorular    --------------------------------------
	
	public static String[][] dogruYanlisSorular(){
		String dogruYanlisSorular[][] = new String[][]{
			
			// {"katagori","Zorluk","Soru","Dogru","Yanlis","Cevap","Puan"}, -----> 6
			
			{"matematik","kolay","D�rt basamakl� en k���k tek say� 1000 'dir.","Dogru","Yanlis","y","2"},
			{"matematik","kolay","65930 say�s�n�n y�zler basama��ndaki rakam�n basamak de�eri 9' dur.","Dogru","Yanlis","d","2"},
			{"matematik","kolay","Be� basamakl� en b�y�k �ift say� 99998' dir.","Dogru","Yanlis","d","2"},
			{"matematik","kolay","Do�al say�lar� yazmak i�in 9 rakam kullan�r�z.","Dogru","Yanlis","d","2"},
			
			{"matematik","orta","En k���k do�al say� 0'd�r.","Dogru","Yanlis","d","5"},
			{"matematik","orta","En k���k pozitif tam say� 1'dir.","Dogru","Yanlis","d","5"},
			{"matematik","orta","En k���k negatif tam say� -1'dir.","Dogru","Yanlis","y","5"},
			
			{"matematik","zor","��genin alan� taban ile y�ksekli�in �arp�m�na e�ittir.","Dogru","Yanlis","d","10"},
			{"matematik","zor","Alan �l��s� temel birimi metre karedir.","Dogru","Yanlis","d","10"},
			{"matematik","zor","Bir say�n�n kendisiyle �arp�m� demek o say�n�n k�p�n� almak demektir.","Dogru","Yanlis","y","10"},
			
			
			{"fenbilgisi","kolay","Kat�:Maddenin en duzensiz halidir.","Dogru","Yanlis","y","2"},
			{"fenbilgisi","kolay","Gaz:Molekuller arasinda bosluk en fazladir","Dogru","Yanlis","d","2"},
			{"fenbilgisi","kolay","Kat�:Molekuller arasi bosluk en azdir.","Dogru","Yanlis","d","2"},
			{"fenbilgisi","kolay","S�v� bulundugu kab�n seklini almaz","Dogru","Yanlis","y","2"},
			
			{"fenbilgisi","orta","Asitlerin tatlar� eksidir.","Dogru","Yanlis","d","5"},
			{"fenbilgisi","orta","Asitlerin oh degeri 0-7 aras�ndadir.","Dogru","Yanlis","y","5"},
			{"fenbilgisi","orta","Bir DNA molek�l�nde toplam fosfat ve �eker say�s� birbirine e�ittir.","Dogru","Yanlis","d","5"},
			
			{"fenbilgisi","zor","Mayoz b�l�nme �reme h�crelerinde ger�ekle�ir.","Dogru","Yanlis","y","10"},
			{"fenbilgisi","zor","Sperm h�creleri testis adl� yap�da �retilir.","Dogru","Yanlis","d","10"},
			{"fenbilgisi","zor","DNA'da riboz sekeri bulunur","Dogru","Yanlis","y","10"},
		};
		
		return dogruYanlisSorular;
	}
	
	
	
	
	//------------------------  BoslukDoldurmaSorular  --------------------------------------
	
	public static String[][] BoslukDoldurmaSorular(){
		String BoslukDoldurmaSorular[][] = new String[][]{
			
			// {"Katagori","Zorluk","Soru","Cevap","DogruCevap","Puan"}, -------> 5
			
			{"matematik","kolay","Ay�en�in 24 bilyesi vard�r.Engin�in bilyeleri ,Ay�en�in bilyelerinden 17 fazlad�r.�kisinin bilyeleri toplam� ____ eder?","Cevap","65","2"},
			{"matematik","kolay","K�meste 26 tav�an , 15 hindi , hindilerden 9 fazla da tavuk var.K�meste toplam ____ hayvan vard�r","Cevap","65","2"},
			{"matematik","kolay","Erdem, 6 y�l sonra 25 ya��nda olacak ise 9 y�l �nce _____ ya��ndayd�","Cevap","10","2"},
			{"matematik","kolay","�� say�n�n toplam� 96�d�r.Say�lardan biri 29, di�eri 33 ise ���nc� say� _____'d�r. ","Cevap","34","2"},
			
			{"matematik","orta","[(-1)-(-2)-(0)] - [(+1)-(-1)-(0)] i�leminin sonucu ____'d�r.","Cevap","-1","5"},
			{"matematik","orta","(-4)-(-4)-(-4)-(-4) isleminin sonucu ____'dur.","Cevap","0","5"},
			{"matematik","orta","(-7)+(+9)+(-8)+(1) isleminin sonucu ____'dur","Cevap","-5","5"},
			
			{"matematik","zor","Kibrit kutusu ____ boyutlu bir cisimdir.","Cevap","3","10"},
			{"matematik","zor","Canl� ve cans�z t�m varl�klar�n i�inde bulundu�u sonsuz bo�lu�a ____ denir.","Cevap","evren","10"},
			{"matematik","zor","Karenin �evresi hesaplan�rken bir kenar uzunlu�u _____ ile �arp�l�r.","Cevap","4","10"},
			
			
			{"fenbilgisi","kolay","�evremizdeki varl�klar� _______ sayesinde g�r�r�z.","Cevap","Is�k","2"},
			{"fenbilgisi","kolay","Ses kayna��ndan uzakla�t�k�a sesin �iddeti_____","Cevap","azal�r","2"},
			{"fenbilgisi","kolay","_____ en b�y�k �s� ve ���k kayna��d�r.","Cevap","g�ne�","2"},
			{"fenbilgisi","kolay","Mum, gaz lambas�, el feneri _____ ���k kayna��na �rnektir.","Cevap","yapay","2"},
			
			{"fenbilgisi","orta","ses ____ yay�lmaz","Cevap","bo�lukta","5"},
			{"fenbilgisi","orta","V�cuda diklik veren yap� _____'d�r","Cevap","iskelet","5"},
			{"fenbilgisi","orta","Kuvvet birim _____'dur","Cevap","Newton","5"},
			
			{"fenbilgisi","zor","Birim zamanda al�nan yola ______ denir.","Cevap","s�rat","10"},
			{"fenbilgisi","zor","K�tleye etki eden yer�ekimi kuvvetine ______ denir.","Cevap","a��rl�k","10"},
			{"fenbilgisi","zor"," Duran cisimleri harekete ge�iren, hareket halindeki cisimleri durdurabilen, �eklini ve y�n�n� de�i�tirebilen etkiye____denir","Cevap","kuvvet","10"},
		};
		
		return BoslukDoldurmaSorular;
	}	
	
	public abstract void SoruGetir();		// abstract method
	
	
}
