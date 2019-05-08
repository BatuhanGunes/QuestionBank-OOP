package SoruBankasi;

public abstract class Sorular {
	
	
	

	//------------------------  CoktanSecmeliSorular   --------------------------------------
	
	

	public static String[][] CoktanSecmeliSorular(){
		String CoktanSecmeliSorular[][] = new String[][]{
			
			// {"katagori","Zorluk","Soru","a","b","c","d","dogrucevap","puan"}; --------> 8
			
			{"matematik","kolay","(7,4,9,5,0,3,6,2)rakamlarla yazýlabilecek en küçük sayý kaçtýr?","20.345679","97643520","30245679","29345670","a","2"},
			{"matematik","kolay","(98,96,94,92,90)sayý örtüsünde 90'dan sonra hangi sayý gelmelidir?","84","88","89","86","b","2"},
			{"matematik","kolay","21.560+31.597 iþlemin sonucu kaçtýr?","64.287","53.267","54.167","53.157","d","2"},
			{"matematik","kolay","143.769-79.642 iþleminin sonucu kaçtýr?","57.677","64.127","54.567","48.787","b","2"},
			
			{"matematik","orta","0+(-1)+4+(-5)=?","1","-1","-2","2","c","5"},
			{"matematik","orta","|A+4|=8 ise A=?","4 , -12","-4 , 12","-4 , -12","4 , 12","a","5"},
			{"matematik","orta","sayýlardan hangisi en büyüktür?","-4","-6","-|-5|","|-1|","d","5"},
			
			{"matematik","zor","200'un %125'si = ?","300","200","350","400","b","10"},
			{"matematik","zor","x sayýsý y sayýsýnýn %20'sidir.Buna göre y sayýsý x sayýsýnýn % kaçýdýr ?","500","400","300","200","a","10"},
			{"matematik","zor","Bir karenin alanýnýn %19 azaltýlabilmesi için bir kenarýnýn yüzde kaç azaltýlmasý gerekir?","9","10","11","12","b","10"},
			
			
			{"fenbilgisi","kolay","iskelet ve kas saðlýðýmýz için, aþaðýdakilerden hangisini yapmamalýyýz?","duzenli beslenme","spor","duzenli uyku","agýr yük kaldýrmalýyýz","d","2"},
			{"fenbilgisi","kolay","Vücudumuzdaki kemiklerin birbirine baðlandýðý yere ne ad verilir?","iskelet","eklem","damar","diyafram","b","2"},
			{"fenbilgisi","kolay","Aþaðýdakilerden hangisi ýsý yayan ýþýk kaynaðý deðildir?","ampul","mum","ates bocegi","gunes","c","2"},
			{"fenbilgisi","kolay","Aþaðýdakilerden hangisi doðal ýþýk kaynaðýdýr?","lamba","mesale","simsek","Trafik lambasi","c","2"},
			
			{"fenbilgisi","orta","90 km/h hýzla yol alan bir araç yarým saate kaç km yol alýr?","30","45","60","75","b","5"},
			{"fenbilgisi","orta","Ayný cins atomlardan oluþan saf maddelere ne ad verilir?","karisim","bilesik","element","molekul","c","5"},
			{"fenbilgisi","orta","Fotosentez olayý bitkinin hangi kýsmýnda gerçekleþir?","kök","cicek","govde","yaprak","d","5"},
			
			{"fenbilgisi","zor","Aþaðýdakilerden hangisi kimyasal deðiþmeye neden olmaz?","küflenme","Donma","Cürüme","yanma","b","10"},
			{"fenbilgisi","zor","Mayoz bölünme sýrasýnda DNA kendini kaç kez eþler ?","1","2","3","4","a","10"},
			{"fenbilgisi","zor","Döllenme olayý aþaðýdakilerden hangi yapýda gerçekleþir?","mayoz","mitoz","Yumurta Kanali","kromozom","c","10"},
		};
		
		return CoktanSecmeliSorular;
	}
	
	
	
	
	
	
	//------------------------  dogruYanlisSorular    --------------------------------------
	
	public static String[][] dogruYanlisSorular(){
		String dogruYanlisSorular[][] = new String[][]{
			
			// {"katagori","Zorluk","Soru","Dogru","Yanlis","Cevap","Puan"}, -----> 6
			
			{"matematik","kolay","Dört basamaklý en küçük tek sayý 1000 'dir.","Dogru","Yanlis","y","2"},
			{"matematik","kolay","65930 sayýsýnýn yüzler basamaðýndaki rakamýn basamak deðeri 9' dur.","Dogru","Yanlis","d","2"},
			{"matematik","kolay","Beþ basamaklý en büyük çift sayý 99998' dir.","Dogru","Yanlis","d","2"},
			{"matematik","kolay","Doðal sayýlarý yazmak için 9 rakam kullanýrýz.","Dogru","Yanlis","d","2"},
			
			{"matematik","orta","En küçük doðal sayý 0'dýr.","Dogru","Yanlis","d","5"},
			{"matematik","orta","En küçük pozitif tam sayý 1'dir.","Dogru","Yanlis","d","5"},
			{"matematik","orta","En küçük negatif tam sayý -1'dir.","Dogru","Yanlis","y","5"},
			
			{"matematik","zor","Üçgenin alaný taban ile yüksekliðin çarpýmýna eþittir.","Dogru","Yanlis","d","10"},
			{"matematik","zor","Alan ölçüsü temel birimi metre karedir.","Dogru","Yanlis","d","10"},
			{"matematik","zor","Bir sayýnýn kendisiyle çarpýmý demek o sayýnýn küpünü almak demektir.","Dogru","Yanlis","y","10"},
			
			
			{"fenbilgisi","kolay","Katý:Maddenin en duzensiz halidir.","Dogru","Yanlis","y","2"},
			{"fenbilgisi","kolay","Gaz:Molekuller arasinda bosluk en fazladir","Dogru","Yanlis","d","2"},
			{"fenbilgisi","kolay","Katý:Molekuller arasi bosluk en azdir.","Dogru","Yanlis","d","2"},
			{"fenbilgisi","kolay","Sývý bulundugu kabýn seklini almaz","Dogru","Yanlis","y","2"},
			
			{"fenbilgisi","orta","Asitlerin tatlarý eksidir.","Dogru","Yanlis","d","5"},
			{"fenbilgisi","orta","Asitlerin oh degeri 0-7 arasýndadir.","Dogru","Yanlis","y","5"},
			{"fenbilgisi","orta","Bir DNA molekülünde toplam fosfat ve þeker sayýsý birbirine eþittir.","Dogru","Yanlis","d","5"},
			
			{"fenbilgisi","zor","Mayoz bölünme üreme hücrelerinde gerçekleþir.","Dogru","Yanlis","y","10"},
			{"fenbilgisi","zor","Sperm hücreleri testis adlý yapýda üretilir.","Dogru","Yanlis","d","10"},
			{"fenbilgisi","zor","DNA'da riboz sekeri bulunur","Dogru","Yanlis","y","10"},
		};
		
		return dogruYanlisSorular;
	}
	
	
	
	
	//------------------------  BoslukDoldurmaSorular  --------------------------------------
	
	public static String[][] BoslukDoldurmaSorular(){
		String BoslukDoldurmaSorular[][] = new String[][]{
			
			// {"Katagori","Zorluk","Soru","Cevap","DogruCevap","Puan"}, -------> 5
			
			{"matematik","kolay","Ayþen’in 24 bilyesi vardýr.Engin’in bilyeleri ,Ayþen’in bilyelerinden 17 fazladýr.Ýkisinin bilyeleri toplamý ____ eder?","Cevap","65","2"},
			{"matematik","kolay","Kümeste 26 tavþan , 15 hindi , hindilerden 9 fazla da tavuk var.Kümeste toplam ____ hayvan vardýr","Cevap","65","2"},
			{"matematik","kolay","Erdem, 6 yýl sonra 25 yaþýnda olacak ise 9 yýl önce _____ yaþýndaydý","Cevap","10","2"},
			{"matematik","kolay","Üç sayýnýn toplamý 96’dýr.Sayýlardan biri 29, diðeri 33 ise Üçüncü sayý _____'dýr. ","Cevap","34","2"},
			
			{"matematik","orta","[(-1)-(-2)-(0)] - [(+1)-(-1)-(0)] iþleminin sonucu ____'dýr.","Cevap","-1","5"},
			{"matematik","orta","(-4)-(-4)-(-4)-(-4) isleminin sonucu ____'dur.","Cevap","0","5"},
			{"matematik","orta","(-7)+(+9)+(-8)+(1) isleminin sonucu ____'dur","Cevap","-5","5"},
			
			{"matematik","zor","Kibrit kutusu ____ boyutlu bir cisimdir.","Cevap","3","10"},
			{"matematik","zor","Canlý ve cansýz tüm varlýklarýn içinde bulunduðu sonsuz boþluða ____ denir.","Cevap","evren","10"},
			{"matematik","zor","Karenin çevresi hesaplanýrken bir kenar uzunluðu _____ ile çarpýlýr.","Cevap","4","10"},
			
			
			{"fenbilgisi","kolay","Çevremizdeki varlýklarý _______ sayesinde görürüz.","Cevap","Isýk","2"},
			{"fenbilgisi","kolay","Ses kaynaðýndan uzaklaþtýkça sesin þiddeti_____","Cevap","azalýr","2"},
			{"fenbilgisi","kolay","_____ en büyük ýsý ve ýþýk kaynaðýdýr.","Cevap","güneþ","2"},
			{"fenbilgisi","kolay","Mum, gaz lambasý, el feneri _____ ýþýk kaynaðýna örnektir.","Cevap","yapay","2"},
			
			{"fenbilgisi","orta","ses ____ yayýlmaz","Cevap","boþlukta","5"},
			{"fenbilgisi","orta","Vücuda diklik veren yapý _____'dýr","Cevap","iskelet","5"},
			{"fenbilgisi","orta","Kuvvet birim _____'dur","Cevap","Newton","5"},
			
			{"fenbilgisi","zor","Birim zamanda alýnan yola ______ denir.","Cevap","sürat","10"},
			{"fenbilgisi","zor","Kütleye etki eden yerçekimi kuvvetine ______ denir.","Cevap","aðýrlýk","10"},
			{"fenbilgisi","zor"," Duran cisimleri harekete geçiren, hareket halindeki cisimleri durdurabilen, þeklini ve yönünü deðiþtirebilen etkiye____denir","Cevap","kuvvet","10"},
		};
		
		return BoslukDoldurmaSorular;
	}	
	
	public abstract void SoruGetir();		// abstract method
	
	
}
