package SoruBankasi;

import java.util.Scanner;

public class SoruEkle extends Sorular{
	
	public void SoruGetir() {
		CoktanSecmeliSorular();
		dogruYanlisSorular();
		BoslukDoldurmaSorular();
	}
	    
		Scanner input = new Scanner(System.in);

		
		public void CoktanSec_soruEkle(){
			
			System.out.println("Sorunun Katagorisini Giriniz : ");
	    	String yeniKatagori = input.nextLine();
	    	 CoktanSecmeliSorular()[CoktanSecmeliSorular().length + 1][0] = yeniKatagori;
	    	 
	        System.out.println("Yeni soruyu giriniz : ");
	        String yeniSoru = input.nextLine();
	        String [] secenekler = {"a", "b", "c", "d"};
	        for (int i = 0; i < 4; i++) {
	            System.out.print("\n"+secenekler[i]+" secenegini giriniz : ");
	            secenekler[i] = input.nextLine();
	        }
	        
	        CoktanSecmeliSorular() [CoktanSecmeliSorular().length + 1][2] = yeniSoru;
	        CoktanSecmeliSorular() [CoktanSecmeliSorular().length + 1][3] = secenekler[0];
	        CoktanSecmeliSorular() [CoktanSecmeliSorular().length + 1][4] = secenekler[1];
	        CoktanSecmeliSorular() [CoktanSecmeliSorular().length + 1][5] = secenekler[2];
	        CoktanSecmeliSorular() [CoktanSecmeliSorular().length + 1][6] = secenekler[3];

	        System.out.println("Dogru Cevabi giriniz : ");
	        String dogruCevap = input.nextLine();
	        CoktanSecmeliSorular()[CoktanSecmeliSorular().length + 1][7] = dogruCevap;
	        
	        System.out.println("Sorunun Zorlugunu Giriniz : ");
            String Zorluk = input.nextLine();
            CoktanSecmeliSorular()[CoktanSecmeliSorular().length + 1][1] = Zorluk;
	        
	        System.out.println("Sorunun Puanini giriniz : ");
	        String Puan = input.nextLine();
	        CoktanSecmeliSorular()[CoktanSecmeliSorular().length + 1][8] = Puan;

	    }
		
		 public void DogruYanlis_soruEkle(){
			 
		    	System.out.println("Sorunun Katagorisini Giriniz : ");
		    	String yeniKatagori = input.nextLine();
		    	dogruYanlisSorular() [dogruYanlisSorular().length + 1][0] = yeniKatagori;
		    	
		    	System.out.println("Yeni soruyu giriniz : ");
		        String yeniSoru = input.nextLine();  
		        dogruYanlisSorular() [dogruYanlisSorular().length + 1][2] = yeniSoru;
		        
		        System.out.print("Sorunun Cevabini Giriniz : ");
	            String dogruCevap = input.nextLine();
	            dogruYanlisSorular()[dogruYanlisSorular().length + 1][5] = dogruCevap;
		               
		        System.out.println("Sorunun Zorlugunu Giriniz : ");
	            String Zorluk = input.nextLine();
	            dogruYanlisSorular()[dogruYanlisSorular().length + 1][1] = Zorluk;
		        
		        System.out.println("Sorunun Puanini giriniz : ");
		        String Puan = input.nextLine();
		        dogruYanlisSorular()[dogruYanlisSorular().length + 1][6] = Puan;

		    }
		 
		 public void Bosluk_soruEkle(){
			 
		    	System.out.println("Sorunun Katagorisini Giriniz : ");
		    	String yeniKatagori = input.nextLine();
		    	BoslukDoldurmaSorular() [BoslukDoldurmaSorular().length + 1][0] = yeniKatagori;
		    	
		    	
		    	System.out.println("Yeni soruyu giriniz : ");
		        String yeniSoru = input.nextLine();  
		        BoslukDoldurmaSorular() [BoslukDoldurmaSorular().length + 1][2] = yeniSoru;
		        
		        System.out.print("Sorunun Cevabini Giriniz : ");
	            String dogruCevap = input.nextLine();
	            BoslukDoldurmaSorular()[BoslukDoldurmaSorular().length + 1][4] = dogruCevap;
		               
		        System.out.println("Sorunun Zorlugunu Giriniz : ");
	            String Zorluk = input.nextLine();
	            BoslukDoldurmaSorular()[BoslukDoldurmaSorular().length + 1][1] = Zorluk;
		        
		        System.out.println("Sorunun Puanini giriniz : ");
		        String Puan = input.nextLine();
		        BoslukDoldurmaSorular()[BoslukDoldurmaSorular().length + 1][5] = Puan;

		    } 
}
