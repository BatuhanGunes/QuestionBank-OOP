package SoruBankasi;

public class SoruYazdir {
	
	public static void CoktanSecSoruYazdir(String CoktanSecmeliSorular[][],int deger){
		 	
			System.out.println(CoktanSecmeliSorular[deger][2]);					//Soru
			System.out.println("A)"+CoktanSecmeliSorular[deger][3]);			//A)
			System.out.println("B)"+CoktanSecmeliSorular[deger][4]);			//B)
			System.out.println("C)"+CoktanSecmeliSorular[deger][5]);			//C)
			System.out.println("D)"+CoktanSecmeliSorular[deger][6]);			//D)
			System.out.println("Zorluk : " +CoktanSecmeliSorular[deger][1]+"  Puan : "+CoktanSecmeliSorular[deger][8]);
			
	 }
	
	
	public static void DogruYanlisSoruYazdir(String dogruYanlisSorular[][],int deger){
		 
		System.out.println(dogruYanlisSorular[deger][2]);							//Soru
			System.out.println("a)" +dogruYanlisSorular[deger][3]);					//Dogru
			System.out.println("b)"+dogruYanlisSorular[deger][4]);					//Yanlis
			System.out.println("Zorluk : " +dogruYanlisSorular[deger][1]+"  Puan : "+dogruYanlisSorular[deger][6]);

	 }
	
	public static void BoslukSoruYazdir(String BoslukDoldurmaSorular[][],int deger){
		 
		System.out.println(BoslukDoldurmaSorular[deger][2]);						//Soru
		System.out.println("Zorluk : " +BoslukDoldurmaSorular[deger][1]+"  Puan : "+BoslukDoldurmaSorular[deger][5]);
			
	 }
}