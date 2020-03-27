package SoruBankasi;

public abstract class Sorular {
	
	
	

	//------------------------  CoktanSecmeliSorular   --------------------------------------
	
	

	public static String[][] CoktanSecmeliSorular(){
		String CoktanSecmeliSorular[][] = new String[][]{
			
			// {"katagori","Zorluk","Soru","a","b","c","d","dogrucevap","puan"}; --------> 8
			
			{"matematik","kolay","(7,4,9,5,0,3,6,2)rakamlarla yazilabilecek en küçük sayi kaçtir?","20.345679","97643520","30245679","29345670","a","2"},
			{"matematik","kolay","(98,96,94,92,90)sayi örtüsünde 90'dan sonra hangi sayi gelmelidir?","84","88","89","86","b","2"},
			{"matematik","kolay","21.560+31.597 iþlemin sonucu kaçtir?","64.287","53.267","54.167","53.157","d","2"},
			{"matematik","kolay","143.769-79.642 iþleminin sonucu kaçtir?","57.677","64.127","54.567","48.787","b","2"},
			
			{"matematik","orta","0+(-1)+4+(-5)=?","1","-1","-2","2","c","5"},
			{"matematik","orta","|A+4|=8 ise A=?","4 , -12","-4 , 12","-4 , -12","4 , 12","a","5"},
			{"matematik","orta","sayilardan hangisi en büyüktür?","-4","-6","-|-5|","|-1|","d","5"},
			
			{"matematik","zor","200'un %125'si = ?","300","200","350","400","b","10"},
			{"matematik","zor","x sayisi y sayisinin %20'sidir.Buna göre y sayisi x sayisinin % kaçidir ?","500","400","300","200","a","10"},
			{"matematik","zor","Bir karenin alaninin %19 azaltilabilmesi için bir kenarinin yüzde kaç azaltilmasi gerekir?","9","10","11","12","b","10"},
			
			
			{"fenbilgisi","kolay","iskelet ve kas saðliðimiz için, aþaðidakilerden hangisini yapmamaliyiz?","duzenli beslenme","spor","duzenli uyku","agir yük kaldirmaliyiz","d","2"},
			{"fenbilgisi","kolay","Vücudumuzdaki kemiklerin birbirine baðlandiði yere ne ad verilir?","iskelet","eklem","damar","diyafram","b","2"},
			{"fenbilgisi","kolay","Aþaðidakilerden hangisi isi yayan iþik kaynaði deðildir?","ampul","mum","ates bocegi","gunes","c","2"},
			{"fenbilgisi","kolay","Aþaðidakilerden hangisi doðal iþik kaynaðidir?","lamba","mesale","simsek","Trafik lambasi","c","2"},
			
			{"fenbilgisi","orta","90 km/h hizla yol alan bir araç yarim saate kaç km yol alir?","30","45","60","75","b","5"},
			{"fenbilgisi","orta","Ayni cins atomlardan oluþan saf maddelere ne ad verilir?","karisim","bilesik","element","molekul","c","5"},
			{"fenbilgisi","orta","Fotosentez olayi bitkinin hangi kisminda gerçekleþir?","kök","cicek","govde","yaprak","d","5"},
			
			{"fenbilgisi","zor","Aþaðidakilerden hangisi kimyasal deðiþmeye neden olmaz?","küflenme","Donma","Cürüme","yanma","b","10"},
			{"fenbilgisi","zor","Mayoz bölünme sirasinda DNA kendini kaç kez eþler ?","1","2","3","4","a","10"},
			{"fenbilgisi","zor","Döllenme olayi aþaðidakilerden hangi yapida gerçekleþir?","mayoz","mitoz","Yumurta Kanali","kromozom","c","10"},
		};
		
		return CoktanSecmeliSorular;
	}
	
	
	
	
	
	
	//------------------------  dogruYanlisSorular    --------------------------------------
	
	public static String[][] dogruYanlisSorular(){
		String dogruYanlisSorular[][] = new String[][]{
			
			// {"katagori","Zorluk","Soru","Dogru","Yanlis","Cevap","Puan"}, -----> 6
			
			{"matematik","kolay","Dört basamakli en küçük tek sayi 1000 'dir.","Dogru","Yanlis","y","2"},
			{"matematik","kolay","65930 sayisinin yüzler basamaðindaki rakamin basamak deðeri 9' dur.","Dogru","Yanlis","d","2"},
			{"matematik","kolay","Beþ basamakli en büyük çift sayi 99998' dir.","Dogru","Yanlis","d","2"},
			{"matematik","kolay","Doðal sayilari yazmak için 9 rakam kullaniriz.","Dogru","Yanlis","d","2"},
			
			{"matematik","orta","En küçük doðal sayi 0'dir.","Dogru","Yanlis","d","5"},
			{"matematik","orta","En küçük pozitif tam sayi 1'dir.","Dogru","Yanlis","d","5"},
			{"matematik","orta","En küçük negatif tam sayi -1'dir.","Dogru","Yanlis","y","5"},
			
			{"matematik","zor","Üçgenin alani taban ile yüksekliðin çarpimina eþittir.","Dogru","Yanlis","d","10"},
			{"matematik","zor","Alan ölçüsü temel birimi metre karedir.","Dogru","Yanlis","d","10"},
			{"matematik","zor","Bir sayinin kendisiyle çarpimi demek o sayinin küpünü almak demektir.","Dogru","Yanlis","y","10"},
			
			
			{"fenbilgisi","kolay","Kati:Maddenin en duzensiz halidir.","Dogru","Yanlis","y","2"},
			{"fenbilgisi","kolay","Gaz:Molekuller arasinda bosluk en fazladir","Dogru","Yanlis","d","2"},
			{"fenbilgisi","kolay","Kati:Molekuller arasi bosluk en azdir.","Dogru","Yanlis","d","2"},
			{"fenbilgisi","kolay","Sivi bulundugu kabin seklini almaz","Dogru","Yanlis","y","2"},
			
			{"fenbilgisi","orta","Asitlerin tatlari eksidir.","Dogru","Yanlis","d","5"},
			{"fenbilgisi","orta","Asitlerin oh degeri 0-7 arasindadir.","Dogru","Yanlis","y","5"},
			{"fenbilgisi","orta","Bir DNA molekülünde toplam fosfat ve þeker sayisi birbirine eþittir.","Dogru","Yanlis","d","5"},
			
			{"fenbilgisi","zor","Mayoz bölünme üreme hücrelerinde gerçekleþir.","Dogru","Yanlis","y","10"},
			{"fenbilgisi","zor","Sperm hücreleri testis adli yapida üretilir.","Dogru","Yanlis","d","10"},
			{"fenbilgisi","zor","DNA'da riboz sekeri bulunur","Dogru","Yanlis","y","10"},
		};
		
		return dogruYanlisSorular;
	}
	
	
	
	
	//------------------------  BoslukDoldurmaSorular  --------------------------------------
	
	public static String[][] BoslukDoldurmaSorular(){
		String BoslukDoldurmaSorular[][] = new String[][]{
			
			// {"Katagori","Zorluk","Soru","Cevap","DogruCevap","Puan"}, -------> 5
			
			{"matematik","kolay","Ayþen’in 24 bilyesi vardir.Engin’in bilyeleri ,Ayþen’in bilyelerinden 17 fazladir.ikisinin bilyeleri toplami ____ eder?","Cevap","65","2"},
			{"matematik","kolay","Kümeste 26 tavþan , 15 hindi , hindilerden 9 fazla da tavuk var.Kümeste toplam ____ hayvan vardir","Cevap","65","2"},
			{"matematik","kolay","Erdem, 6 yil sonra 25 yaþinda olacak ise 9 yil önce _____ yaþindaydi","Cevap","10","2"},
			{"matematik","kolay","Üç sayinin toplami 96’dir.Sayilardan biri 29, diðeri 33 ise Üçüncü sayi _____'dir. ","Cevap","34","2"},
			
			{"matematik","orta","[(-1)-(-2)-(0)] - [(+1)-(-1)-(0)] iþleminin sonucu ____'dir.","Cevap","-1","5"},
			{"matematik","orta","(-4)-(-4)-(-4)-(-4) isleminin sonucu ____'dur.","Cevap","0","5"},
			{"matematik","orta","(-7)+(+9)+(-8)+(1) isleminin sonucu ____'dur","Cevap","-5","5"},
			
			{"matematik","zor","Kibrit kutusu ____ boyutlu bir cisimdir.","Cevap","3","10"},
			{"matematik","zor","Canli ve cansiz tüm varliklarin içinde bulunduðu sonsuz boþluða ____ denir.","Cevap","evren","10"},
			{"matematik","zor","Karenin çevresi hesaplanirken bir kenar uzunluðu _____ ile çarpilir.","Cevap","4","10"},
			
			
			{"fenbilgisi","kolay","Çevremizdeki varliklari _______ sayesinde görürüz.","Cevap","Isik","2"},
			{"fenbilgisi","kolay","Ses kaynaðindan uzaklaþtikça sesin þiddeti_____","Cevap","azalir","2"},
			{"fenbilgisi","kolay","_____ en büyük isi ve iþik kaynaðidir.","Cevap","güneþ","2"},
			{"fenbilgisi","kolay","Mum, gaz lambasi, el feneri _____ iþik kaynaðina örnektir.","Cevap","yapay","2"},
			
			{"fenbilgisi","orta","ses ____ yayilmaz","Cevap","boþlukta","5"},
			{"fenbilgisi","orta","Vücuda diklik veren yapi _____'dir","Cevap","iskelet","5"},
			{"fenbilgisi","orta","Kuvvet birim _____'dur","Cevap","Newton","5"},
			
			{"fenbilgisi","zor","Birim zamanda alinan yola ______ denir.","Cevap","sürat","10"},
			{"fenbilgisi","zor","Kütleye etki eden yerçekimi kuvvetine ______ denir.","Cevap","aðirlik","10"},
			{"fenbilgisi","zor"," Duran cisimleri harekete geçiren, hareket halindeki cisimleri durdurabilen, þeklini ve yönünü deðiþtirebilen etkiye____denir","Cevap","kuvvet","10"},
		};
		
		return BoslukDoldurmaSorular;
	}	
	
	public abstract void SoruGetir();		// abstract method
	
	
}
