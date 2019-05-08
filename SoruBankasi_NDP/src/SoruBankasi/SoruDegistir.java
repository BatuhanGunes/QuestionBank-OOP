package SoruBankasi;

import java.util.Scanner;

public class SoruDegistir extends Sorular{

	
	public void SoruGetir() {
		CoktanSecmeliSorular();
		dogruYanlisSorular();
		BoslukDoldurmaSorular();
	}
	    
	Scanner input = new Scanner(System.in);
	
	
	   
	   public void CoktanSec_soruDegistir(int soruNumarasi){
		   
		   
		   for(int j=1; j<9; j++){
		   CoktanSecmeliSorular()[soruNumarasi][j]=null;
		   }
		   
		    System.out.println("Yeni sorunun katagorisini giriniz : ");
	        String katagori = input.nextLine();
	        System.out.println("Yeni soruyu giriniz : ");
	        String yeniSoru = input.nextLine();
	        String [] secenekler = {"a", "b", "c", "d"};
	        for (int i = 0; i < 4; i++) {
	            System.out.print("\n"+secenekler[i]+" secenegini giriniz : ");
	            secenekler[i] = input.nextLine();
	        }
	        
	        CoktanSecmeliSorular() [soruNumarasi][0] = katagori;
	        CoktanSecmeliSorular() [soruNumarasi][2] = yeniSoru;
	        CoktanSecmeliSorular() [soruNumarasi][3] = secenekler[0];
	        CoktanSecmeliSorular() [soruNumarasi][4] = secenekler[1];
	        CoktanSecmeliSorular() [soruNumarasi][5] = secenekler[2];
	        CoktanSecmeliSorular() [soruNumarasi][6] = secenekler[3];
	        
	        System.out.println("Dogru Cevabi giriniz : ");
	        String dogruCevap = input.nextLine();
	        CoktanSecmeliSorular()[soruNumarasi][7] = dogruCevap;
	        
	        System.out.println("Sorunun Zorlugunu Giriniz : ");
	        String Zorluk = input.nextLine();
	        CoktanSecmeliSorular()[soruNumarasi][1] = Zorluk;
	        
	        System.out.println("Sorunun Puanini giriniz : ");
	        String Puan = input.nextLine();
	        CoktanSecmeliSorular()[soruNumarasi][8] = Puan;
	       
	    }
	   
	   

	    public void DogruYanlis_soruDegistir(int soruNumarasi){
	    	
	    	for(int j=1; j<7; j++){
	 		   CoktanSecmeliSorular()[soruNumarasi][j]=null;
	 		   }

	    	System.out.println("Yeni sorunun katagorisini giriniz : ");
	        String katagori = input.nextLine();
	        dogruYanlisSorular() [soruNumarasi][0] = katagori;
	        System.out.println("Yeni soruyu giriniz : ");
	        String yeniSoru = input.nextLine();  
	        dogruYanlisSorular() [soruNumarasi][2] = yeniSoru;
	        
	        System.out.print("Sorunun Cevabini Giriniz : ");
            String dogruCevap = input.nextLine();
            dogruYanlisSorular()[soruNumarasi][5] = dogruCevap;
           
            System.out.println("Sorunun Zorlugunu Giriniz : ");
            String Zorluk = input.nextLine();
            dogruYanlisSorular()[soruNumarasi][1] = Zorluk;
	        
	        System.out.println("Sorunun Puanini giriniz : ");
	        String Puan = input.nextLine();
	        dogruYanlisSorular()[soruNumarasi][6] = Puan;
	       
	    }
	    
	    public void Bosluk_soruDegistir(int soruNumarasi){
	    	
	    	for(int j=1; j<6; j++){
	 		   CoktanSecmeliSorular()[soruNumarasi][j]=null;
	 		   }

	    	System.out.println("Yeni sorunun katagorisini giriniz : ");
	        String katagori = input.nextLine();
	    	BoslukDoldurmaSorular()[soruNumarasi][0] = katagori;
	        System.out.println("Yeni soruyu giriniz : ");
	        String yeniSoru = input.nextLine();  
	        BoslukDoldurmaSorular() [soruNumarasi][2] = yeniSoru;
	        
	        System.out.print("Sorunun Cevabini Giriniz : ");
            String dogruCevap = input.nextLine();
            BoslukDoldurmaSorular()[soruNumarasi][4] = dogruCevap;
            
            System.out.println("Sorunun Zorlugunu Giriniz : ");
            String Zorluk = input.nextLine();
            BoslukDoldurmaSorular()[soruNumarasi][1] = Zorluk;
	        
	        System.out.println("Sorunun Puanini giriniz : ");
	        String Puan = input.nextLine();
	        BoslukDoldurmaSorular()[soruNumarasi][5] = Puan;
	       
	    }

}
