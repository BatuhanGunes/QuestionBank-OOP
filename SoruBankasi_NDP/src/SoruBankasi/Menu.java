package SoruBankasi;

import java.util.Scanner;

public class Menu {

	private int menuNumarasi = 0;
    private final int ANAMENU = 0, SORU_GORUNTULE = 1, BiLGi_AL = 2, SORU_COZ = 3, SORU_DUZENLE = 4, CIKIS = 5;

    Scanner input = new Scanner(System.in);
    
    SoruSil Sil = new SoruSil();
    SorulariGoruntule Goruntule = new SorulariGoruntule();
    SoruEkle Ekle = new SoruEkle();
    SoruDegistir Degis = new SoruDegistir();
    
    public Menu(){
        System.out.println("-------------SORU BANKASI-------------\n" +
                "Islem yapmak istediginiz numarayi seciniz:\n");
    }

    public void menuYazdir() {

        System.out.println(
        		"---------Ana Menu----------\n"+
                "0) Menu Yazdir\n" +
                "1) Sorulari Goruntule\n" +
                "2) Sinav Hakkinda Bilgi Al\n"+
                "3) Sinava Basla\n" +
                "4) Sorularda Degisiklik Yap\n" +
                "5) Cikis"
        );
                programiBaslat();
    }

    private void programiBaslat(){

        for (; ; ) {
            menuNumarasi = input.nextInt();
            switch (menuNumarasi) {
                case ANAMENU:         	menuYazdir();                           		break;
                case SORU_GORUNTULE:  	GoruntuMenusuYazdir();   	menuYazdir();      	break;
                case BiLGi_AL:			BilgiAl();					menuYazdir();		break;
                case SORU_COZ:      	soruYazdir();        		menuYazdir();     	break;
                case SORU_DUZENLE:  	DuzenleMenusuYazdir();      menuYazdir();     	break;
                case CIKIS:         	SorulariKontrolEt.KontrolEt();   				break;
            }
            if (menuNumarasi == 5)
                break;
            else if (menuNumarasi > 5 || menuNumarasi < 0) {
                System.out.print("Gecersiz Bir Sayi Girdiniz! Lutfen Tekrar Giriniz : ");
            }
        }
    }
      
	public void GoruntuMenusuYazdir(){
    	
    	System.out.println(
    			"---------Sorulari Goruntule----------\n"+
                "0) Menuye Geri Don\n" +
                "1) Katagorisine Gore Sirala\n" +
                "2) Zorluk Derecesine Göre Sirala\n" +
                "3) Sorularin cinsine Göre Sirala\n" +
                "4) Cikis"
        );
    	sorulariGoruntule();
    }
    
    //  Goruntu Menusu degiskenleri
    private final int KatagoriyeGore = 1, ZorlugaGore = 2, CinseGore = 3;
     	    
    private void sorulariGoruntule(){
  
    	for (; ; ) {
            menuNumarasi = input.nextInt();
            switch (menuNumarasi) {
                case ANAMENU:         	menuYazdir();               	             					  break;
                case KatagoriyeGore:  	KatagoriyeGore();							menuYazdir();    	  break;
                case ZorlugaGore:  	   	ZorlugaGore();								menuYazdir();      	  break;
                case CinseGore:      	Goruntule.CinsineGoreGoruntule();        	menuYazdir();      	  break;
                case CIKIS:         	System.out.println("Cikis Yapildi!");         					  break;
            }
            if (menuNumarasi == 4)
                break;
            else if (menuNumarasi > 4 || menuNumarasi < 0) {
                System.out.print("Gecersiz Bir Sayi Girdiniz! Lutfen Tekrar Giriniz : ");
            }
        }	
    }

    	public void DuzenleMenusuYazdir(){
    	
    	System.out.println(
    			"---------Duzenleme Menusu----------\n"+
                "0) Menuye Geri Don\n" +
                "1) Soruyu Tekrardan duzenle\n" +
                "2) Soru Ekle\n" +
                "3) Soru Sil\n" +
                "4) Cikis"
        );
    	DuzenlemeMenusu();
    }
    
    	 //  Duzenleme Menusu degiskenleri
	    private final int Soru_duzenle = 1, Soru_ekle = 2, Soru_sil = 3;
	   	    
	    private void DuzenlemeMenusu(){
	    	
	    	for (; ; ) {
	            menuNumarasi = input.nextInt();
	            switch (menuNumarasi) {
	                case ANAMENU:         	menuYazdir();               	             		  break;
	                case Soru_duzenle:  	SoruDegisMenusuYazdir();		menuYazdir();    	  break;
	                case Soru_ekle:  	   	SoruEkleMenuYazdir();			menuYazdir();      	  break;
	                case Soru_sil:      	SoruSilMenuYazdir(); 			menuYazdir();      	  break;
	                case CIKIS:         	System.out.println("Cikis Yapildi!");         		  break;
	            }
	            if (menuNumarasi == 4)
	                break;
	            else if (menuNumarasi > 4 || menuNumarasi < 0) {
	                System.out.print("Gecersiz Bir Sayi Girdiniz! Lutfen Tekrar Giriniz : ");
	            }
	        }	
	    }
	    
	    public void SoruDegisMenusuYazdir(){
	    	
	    	System.out.println(
	    			"---------Soru Cinsini Seciniz----------\n"+
	                "0) Menuye Geri Don\n" +
	                "1) Coktan Secmeli Sorular\n" +
	                "2) Dogru Yanlis Sorular\n" +
	                "3) Bosluk Doldurma Sorular\n" +
	                "4) Cikis"
	        );
	    	SoruDegisMenu();
	    }
	    
	    private final int CoktanSec = 1, DogruYanlis = 2, Bosluk = 3;
	    
	    private void SoruDegisMenu(){
	    	
	    	for (; ; ) {
	            menuNumarasi = input.nextInt();
	            switch (menuNumarasi) {
	                case ANAMENU:         	menuYazdir();               	             				break;
	                case CoktanSec:  		CoktansecsoruDegistir();		menuYazdir();    	  		break;
	                case DogruYanlis:  	   	DYsoruDegistir();				menuYazdir();      	  		break;
	                case Bosluk:      	    BosluksoruDegistir();			menuYazdir();      	  		break;
	                case CIKIS:         	System.out.println("Cikis Yapildi!");         				break;
	            }
	            if (menuNumarasi == 4)
	                break;
	            else if (menuNumarasi > 4 || menuNumarasi < 0) {
	                System.out.print("Gecersiz Bir Sayi Girdiniz! Lutfen Tekrar Giriniz : ");
	            }
	        }	
	    }
	        
	    public void SoruEkleMenuYazdir(){
	    	
	    	System.out.println(
	    			"---------Soru Cinsini Seciniz----------\n"+
	                "0) Menuye Geri Don\n" +
	                "1) Coktan Secmeli Sorular\n" +
	                "2) Dogru Yanlis Sorular\n" +
	                "3) Bosluk Doldurma Sorular\n" +
	                "4) Cikis"
	        );
	    	SoruEkleMenu();
	    }
	    
	    	private void SoruEkleMenu(){
	    	
	    	for (; ; ) {
	            menuNumarasi = input.nextInt();
	            switch (menuNumarasi) {
	                case ANAMENU:         	menuYazdir();               	             						break;
	                case CoktanSec:  		Ekle.CoktanSec_soruEkle();		menuYazdir();    	  		break;
	                case DogruYanlis:  	   	Ekle.DogruYanlis_soruEkle();		menuYazdir();      	  		break;
	                case Bosluk:      	    Ekle.Bosluk_soruEkle();     		menuYazdir();      	  		break;
	                case CIKIS:         	System.out.println("Cikis Yapildi!");         						break;
	            }
	            if (menuNumarasi == 4)
	                break;
	            else if (menuNumarasi > 4 || menuNumarasi < 0) {
	                System.out.print("Gecersiz Bir Sayi Girdiniz! Lutfen Tekrar Giriniz : ");
	            }
	        }	
	    }
	    	
	    	public void SoruSilMenuYazdir(){
		    	
		    	System.out.println(
		    			"---------Soru Cinsini Seciniz----------\n"+
		                "0) Menuye Geri Don\n" +
		                "1) Coktan Secmeli Sorular\n" +
		                "2) Dogru Yanlis Sorular\n" +
		                "3) Bosluk Doldurma Sorular\n" +
		                "4) Cikis"
		        );
		    	SoruSilMenu();
		    }
	    	
	    	private void SoruSilMenu(){
		    	
		    	for (; ; ) {
		            menuNumarasi = input.nextInt();
		            switch (menuNumarasi) {
		                case ANAMENU:         	menuYazdir();               	             		break;
		                case CoktanSec:  		CoktanSecsoruSil();		menuYazdir();    	  		break;
		                case DogruYanlis:  	   	DYSoruSil();			menuYazdir();      	  		break;
		                case Bosluk:      	    BosluksoruSil();    	menuYazdir();      	  		break;
		                case CIKIS:         	SorulariKontrolEt.KontrolEt();        				break;
		            }
		            if (menuNumarasi == 4)
		                break;
		            else if (menuNumarasi > 4 || menuNumarasi < 0) {
		                System.out.print("Gecersiz Bir Sayi Girdiniz! Lutfen Tekrar Giriniz : ");
		            }
		        }	
		    }
	     
	    private void BilgiAl() {
	    	SinavBilgi.bilgiDosyaOkuma();
		}
	  
	    
	    public void KatagoriyeGore(){
	    	Goruntule.KatagoriyeGoreGoruntule("matematik");
	    	Goruntule.KatagoriyeGoreGoruntule("fenbilgisi");
	    }
	    
	    public void ZorlugaGore(){
	    	Goruntule.ZorlugaGoreGoruntule("kolay");
	    	Goruntule.ZorlugaGoreGoruntule("orta");
	    	Goruntule.ZorlugaGoreGoruntule("zor");
	    }
	    
	    public void BosluksoruSil(){
	    	System.out.println("Silinecek sorunun numarasini giriniz : ");
	    	int soruNumarasi = input.nextInt();
	    	Sil.Bosluk_soruSil(soruNumarasi);
	    }
	    
	    public void BosluksoruDegistir(){
	    	System.out.println("Degistirilecek sorunun numarasini giriniz : ");
	    	int soruNumarasi = input.nextInt();
	    	Degis.Bosluk_soruDegistir(soruNumarasi);
	    }
	    
	    public void CoktanSecsoruSil(){
	    	System.out.println("Silinecek sorunun numarasini giriniz : ");
	    	int soruNumarasi = input.nextInt();
	    	Sil.CoktanSec_soruSil(soruNumarasi);
	    }
	    
	    public void CoktansecsoruDegistir(){
	    	System.out.println("Degistirilecek sorunun numarasini giriniz : ");
	    	int soruNumarasi = input.nextInt();
	    	Degis.CoktanSec_soruDegistir(soruNumarasi);
	    }
	    
	    public void DYSoruSil(){
	    	System.out.println("Silinecek sorunun numarasini giriniz : ");
	    	int soruNumarasi = input.nextInt();
	    	Sil.DogruYanlis_soruSil(soruNumarasi);
	    }
	    
	    public void DYsoruDegistir(){
	    	System.out.println("Degistirilecek sorunun numarasini giriniz : ");
	    	int soruNumarasi = input.nextInt();
	    	Degis.DogruYanlis_soruDegistir(soruNumarasi);
	    }
	    
	    public void soruYazdir(){
	    	SinavBasla.SinavGonder();
	    }
}
