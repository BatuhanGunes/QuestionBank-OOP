package SoruBankasi;

public abstract class Sorular {
	
	
	

	//------------------------  CoktanSecmeliSorular   --------------------------------------
	
	

	public static String[][] CoktanSecmeliSorular(){
		String CoktanSecmeliSorular[][] = new String[][]{
			
			// {"katagori","Zorluk","Soru","a","b","c","d","dogrucevap","puan"}; --------> 8
			
			{"matematik","kolay","(7,4,9,5,0,3,6,2)rakamlarla yazilabilecek en k���k sayi ka�tir?","20.345679","97643520","30245679","29345670","a","2"},
			{"matematik","kolay","(98,96,94,92,90)sayi �rt�s�nde 90'dan sonra hangi sayi gelmelidir?","84","88","89","86","b","2"},
			{"matematik","kolay","21.560+31.597 i�lemin sonucu ka�tir?","64.287","53.267","54.167","53.157","d","2"},
			{"matematik","kolay","143.769-79.642 i�leminin sonucu ka�tir?","57.677","64.127","54.567","48.787","b","2"},
			
			{"matematik","orta","0+(-1)+4+(-5)=?","1","-1","-2","2","c","5"},
			{"matematik","orta","|A+4|=8 ise A=?","4 , -12","-4 , 12","-4 , -12","4 , 12","a","5"},
			{"matematik","orta","sayilardan hangisi en b�y�kt�r?","-4","-6","-|-5|","|-1|","d","5"},
			
			{"matematik","zor","200'un %125'si = ?","300","200","350","400","b","10"},
			{"matematik","zor","x sayisi y sayisinin %20'sidir.Buna g�re y sayisi x sayisinin % ka�idir ?","500","400","300","200","a","10"},
			{"matematik","zor","Bir karenin alaninin %19 azaltilabilmesi i�in bir kenarinin y�zde ka� azaltilmasi gerekir?","9","10","11","12","b","10"},
			
			
			{"fenbilgisi","kolay","iskelet ve kas sa�li�imiz i�in, a�a�idakilerden hangisini yapmamaliyiz?","duzenli beslenme","spor","duzenli uyku","agir y�k kaldirmaliyiz","d","2"},
			{"fenbilgisi","kolay","V�cudumuzdaki kemiklerin birbirine ba�landi�i yere ne ad verilir?","iskelet","eklem","damar","diyafram","b","2"},
			{"fenbilgisi","kolay","A�a�idakilerden hangisi isi yayan i�ik kayna�i de�ildir?","ampul","mum","ates bocegi","gunes","c","2"},
			{"fenbilgisi","kolay","A�a�idakilerden hangisi do�al i�ik kayna�idir?","lamba","mesale","simsek","Trafik lambasi","c","2"},
			
			{"fenbilgisi","orta","90 km/h hizla yol alan bir ara� yarim saate ka� km yol alir?","30","45","60","75","b","5"},
			{"fenbilgisi","orta","Ayni cins atomlardan olu�an saf maddelere ne ad verilir?","karisim","bilesik","element","molekul","c","5"},
			{"fenbilgisi","orta","Fotosentez olayi bitkinin hangi kisminda ger�ekle�ir?","k�k","cicek","govde","yaprak","d","5"},
			
			{"fenbilgisi","zor","A�a�idakilerden hangisi kimyasal de�i�meye neden olmaz?","k�flenme","Donma","C�r�me","yanma","b","10"},
			{"fenbilgisi","zor","Mayoz b�l�nme sirasinda DNA kendini ka� kez e�ler ?","1","2","3","4","a","10"},
			{"fenbilgisi","zor","D�llenme olayi a�a�idakilerden hangi yapida ger�ekle�ir?","mayoz","mitoz","Yumurta Kanali","kromozom","c","10"},
		};
		
		return CoktanSecmeliSorular;
	}
	
	
	
	
	
	
	//------------------------  dogruYanlisSorular    --------------------------------------
	
	public static String[][] dogruYanlisSorular(){
		String dogruYanlisSorular[][] = new String[][]{
			
			// {"katagori","Zorluk","Soru","Dogru","Yanlis","Cevap","Puan"}, -----> 6
			
			{"matematik","kolay","D�rt basamakli en k���k tek sayi 1000 'dir.","Dogru","Yanlis","y","2"},
			{"matematik","kolay","65930 sayisinin y�zler basama�indaki rakamin basamak de�eri 9' dur.","Dogru","Yanlis","d","2"},
			{"matematik","kolay","Be� basamakli en b�y�k �ift sayi 99998' dir.","Dogru","Yanlis","d","2"},
			{"matematik","kolay","Do�al sayilari yazmak i�in 9 rakam kullaniriz.","Dogru","Yanlis","d","2"},
			
			{"matematik","orta","En k���k do�al sayi 0'dir.","Dogru","Yanlis","d","5"},
			{"matematik","orta","En k���k pozitif tam sayi 1'dir.","Dogru","Yanlis","d","5"},
			{"matematik","orta","En k���k negatif tam sayi -1'dir.","Dogru","Yanlis","y","5"},
			
			{"matematik","zor","��genin alani taban ile y�ksekli�in �arpimina e�ittir.","Dogru","Yanlis","d","10"},
			{"matematik","zor","Alan �l��s� temel birimi metre karedir.","Dogru","Yanlis","d","10"},
			{"matematik","zor","Bir sayinin kendisiyle �arpimi demek o sayinin k�p�n� almak demektir.","Dogru","Yanlis","y","10"},
			
			
			{"fenbilgisi","kolay","Kati:Maddenin en duzensiz halidir.","Dogru","Yanlis","y","2"},
			{"fenbilgisi","kolay","Gaz:Molekuller arasinda bosluk en fazladir","Dogru","Yanlis","d","2"},
			{"fenbilgisi","kolay","Kati:Molekuller arasi bosluk en azdir.","Dogru","Yanlis","d","2"},
			{"fenbilgisi","kolay","Sivi bulundugu kabin seklini almaz","Dogru","Yanlis","y","2"},
			
			{"fenbilgisi","orta","Asitlerin tatlari eksidir.","Dogru","Yanlis","d","5"},
			{"fenbilgisi","orta","Asitlerin oh degeri 0-7 arasindadir.","Dogru","Yanlis","y","5"},
			{"fenbilgisi","orta","Bir DNA molek�l�nde toplam fosfat ve �eker sayisi birbirine e�ittir.","Dogru","Yanlis","d","5"},
			
			{"fenbilgisi","zor","Mayoz b�l�nme �reme h�crelerinde ger�ekle�ir.","Dogru","Yanlis","y","10"},
			{"fenbilgisi","zor","Sperm h�creleri testis adli yapida �retilir.","Dogru","Yanlis","d","10"},
			{"fenbilgisi","zor","DNA'da riboz sekeri bulunur","Dogru","Yanlis","y","10"},
		};
		
		return dogruYanlisSorular;
	}
	
	
	
	
	//------------------------  BoslukDoldurmaSorular  --------------------------------------
	
	public static String[][] BoslukDoldurmaSorular(){
		String BoslukDoldurmaSorular[][] = new String[][]{
			
			// {"Katagori","Zorluk","Soru","Cevap","DogruCevap","Puan"}, -------> 5
			
			{"matematik","kolay","Ay�en�in 24 bilyesi vardir.Engin�in bilyeleri ,Ay�en�in bilyelerinden 17 fazladir.ikisinin bilyeleri toplami ____ eder?","Cevap","65","2"},
			{"matematik","kolay","K�meste 26 tav�an , 15 hindi , hindilerden 9 fazla da tavuk var.K�meste toplam ____ hayvan vardir","Cevap","65","2"},
			{"matematik","kolay","Erdem, 6 yil sonra 25 ya�inda olacak ise 9 yil �nce _____ ya�indaydi","Cevap","10","2"},
			{"matematik","kolay","�� sayinin toplami 96�dir.Sayilardan biri 29, di�eri 33 ise ���nc� sayi _____'dir. ","Cevap","34","2"},
			
			{"matematik","orta","[(-1)-(-2)-(0)] - [(+1)-(-1)-(0)] i�leminin sonucu ____'dir.","Cevap","-1","5"},
			{"matematik","orta","(-4)-(-4)-(-4)-(-4) isleminin sonucu ____'dur.","Cevap","0","5"},
			{"matematik","orta","(-7)+(+9)+(-8)+(1) isleminin sonucu ____'dur","Cevap","-5","5"},
			
			{"matematik","zor","Kibrit kutusu ____ boyutlu bir cisimdir.","Cevap","3","10"},
			{"matematik","zor","Canli ve cansiz t�m varliklarin i�inde bulundu�u sonsuz bo�lu�a ____ denir.","Cevap","evren","10"},
			{"matematik","zor","Karenin �evresi hesaplanirken bir kenar uzunlu�u _____ ile �arpilir.","Cevap","4","10"},
			
			
			{"fenbilgisi","kolay","�evremizdeki varliklari _______ sayesinde g�r�r�z.","Cevap","Isik","2"},
			{"fenbilgisi","kolay","Ses kayna�indan uzakla�tik�a sesin �iddeti_____","Cevap","azalir","2"},
			{"fenbilgisi","kolay","_____ en b�y�k isi ve i�ik kayna�idir.","Cevap","g�ne�","2"},
			{"fenbilgisi","kolay","Mum, gaz lambasi, el feneri _____ i�ik kayna�ina �rnektir.","Cevap","yapay","2"},
			
			{"fenbilgisi","orta","ses ____ yayilmaz","Cevap","bo�lukta","5"},
			{"fenbilgisi","orta","V�cuda diklik veren yapi _____'dir","Cevap","iskelet","5"},
			{"fenbilgisi","orta","Kuvvet birim _____'dur","Cevap","Newton","5"},
			
			{"fenbilgisi","zor","Birim zamanda alinan yola ______ denir.","Cevap","s�rat","10"},
			{"fenbilgisi","zor","K�tleye etki eden yer�ekimi kuvvetine ______ denir.","Cevap","a�irlik","10"},
			{"fenbilgisi","zor"," Duran cisimleri harekete ge�iren, hareket halindeki cisimleri durdurabilen, �eklini ve y�n�n� de�i�tirebilen etkiye____denir","Cevap","kuvvet","10"},
		};
		
		return BoslukDoldurmaSorular;
	}	
	
	public abstract void SoruGetir();		// abstract method
	
	
}
