package SoruBankasi;


public class SorulariGoruntule extends Sorular{

	public void SoruGetir() {
		CoktanSecmeliSorular();
		dogruYanlisSorular();
		BoslukDoldurmaSorular();
	}
	
 
	   public void KatagoriyeGoreGoruntule(String Katagori){
		   
		   System.out.println(Katagori + " Sorulari : \n"
				   + "--------------------------------"
				   + Katagori + " Katagorisinin Coktan Secmeli Sorulari-----------------\n\n");
		   for(int i=0;i<CoktanSecmeliSorular().length;i++){
			   if(CoktanSecmeliSorular()[i][0] == Katagori ){
				   SoruYazdir.CoktanSecSoruYazdir(CoktanSecmeliSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + CoktanSecmeliSorular()[i][7] +"\n\n");
			   }
		   }
		   
		   System.out.println("\n------------------------"
				   + Katagori + " Katagorisinin Dogru-Yanlis Sorulari-----------------\n");
		   for(int i=0;i<dogruYanlisSorular().length;i++){
			   if(dogruYanlisSorular()[i][0] == Katagori ){
				   SoruYazdir.DogruYanlisSoruYazdir (dogruYanlisSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + dogruYanlisSorular()[i][5] +"\n\n"); 
			   }
		   }
		   
		   System.out.println("\n--------------------------"
				   + Katagori + " Katagorisinin Bosluk Doldurma Sorulari---------------\n");
		   for(int i=0;i<BoslukDoldurmaSorular().length;i++){
			   if(BoslukDoldurmaSorular()[i][0] == Katagori ){
				   SoruYazdir.BoslukSoruYazdir (BoslukDoldurmaSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + BoslukDoldurmaSorular()[i][4] +"\n\n");
			   }
		   }
	   }
	   
	   
	   public void ZorlugaGoreGoruntule(String Zorluk){
		   
		   System.out.println(Zorluk + " Zorluktaki Sorular : \n"
				   + "----------------------------------"
				   + Zorluk + " Zorluktaki Coktan Secmeli Sorular--------------------/n\n");
		   System.out.println(Zorluk + " Sorulari : ");
		   for(int i=0;i<CoktanSecmeliSorular().length;i++){
			   if(dogruYanlisSorular()[i][1] == Zorluk ){
				   SoruYazdir.CoktanSecSoruYazdir(CoktanSecmeliSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + CoktanSecmeliSorular()[i][7] +"\n\n");
			   }
		   }
		   
		   System.out.println("\n------------------------------"
				   + Zorluk + " Zorluktaki Dogru-Yanlis Sorulari---------------------\n");
		   for(int i=0;i<dogruYanlisSorular().length;i++){
			   if(dogruYanlisSorular()[i][1] == Zorluk ){
				   SoruYazdir.DogruYanlisSoruYazdir (dogruYanlisSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + dogruYanlisSorular()[i][5] +"\n\n");
			   }
		   }
		   
		   System.out.println("\n-------------------------"
				   + Zorluk + " Zorluktaki Bosluk Doldurma Sorulari-------------------\n");
		   for(int i=0;i<BoslukDoldurmaSorular().length;i++){
			   if(BoslukDoldurmaSorular()[i][1] == Zorluk ){
				   SoruYazdir.BoslukSoruYazdir (BoslukDoldurmaSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + BoslukDoldurmaSorular()[i][4] +"\n\n");
			   }
		   }  
	   }
	   
	   public void CinsineGoreGoruntule(){
		   
		   System.out.println("\n-----------------------Coktan Secmeli Sorular------------------------------------\n");
				 
				  
		   for(int i=0;i<CoktanSecmeliSorular().length;i++){
				   SoruYazdir.CoktanSecSoruYazdir(CoktanSecmeliSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + CoktanSecmeliSorular()[i][7] +"\n\n");
			   }
		   
		   System.out.println("\n------------------------Dogru - Yanlis Sorulari-----------------------------------\n");

		   for(int i=0;i<dogruYanlisSorular().length;i++){
				   SoruYazdir.DogruYanlisSoruYazdir (dogruYanlisSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + dogruYanlisSorular()[i][5] +"\n\n");
			   }
		   
		   System.out.println("\n-----------------------Bosluk Doldurma Sorulari------------------------------------\n");
				  
		   for(int i=0;i<BoslukDoldurmaSorular().length;i++){
				   SoruYazdir.BoslukSoruYazdir (BoslukDoldurmaSorular(), i);
				   System.out.print("Sorunun Dogru Cevabi : " + BoslukDoldurmaSorular()[i][4] +"\n\n");
			   }	   
		   }
}
