package SoruBankasi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class DosyaYazma›slemi {
	
	

	public static void yazilacakDosya (String Dosya, String Sorular[][], int boyut){
		
		FileWriter fWriter = null;
		BufferedWriter Writer = null;
		
		try{
			fWriter = new FileWriter(Dosya);
			Writer = new BufferedWriter(fWriter);
			
			for(int j=0;j<Sorular.length;j++){
				for(int i=0; i<boyut; i++){
				Writer.write(Sorular[j][i]);
				Writer.newLine();
				
					}
				Writer.close();
				}
			}
		catch(Exception e){
			System.out.println("Dosya yazilamadi.");
		}
	}
	
}
