package SoruBankasi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class SinaviKaydet extends Sorular{

	@Override
	public void SoruGetir() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void Kaydet(String DosyaAdi){
		
		try{
			
			
	File file = new File(DosyaAdi);
	
	FileOutputStream fos = new FileOutputStream(file);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	DataOutputStream das = new DataOutputStream(bos);	
    
		file.createNewFile();
		
		das.writeUTF("Sinav Adi : " + SinavBasla.getSinavAdi());
		das.writeUTF("Gozetmen Adi : " + SinavBasla.getGozetmenAdi());
		das.writeUTF("Sinav Yeri : " + SinavBasla.getSinavYeri());
		das.writeUTF("Sýnavýn Katagorisi : " + SinavBasla.getKatagori());
		das.writeUTF("Sýrasýyla ToplamPuan - Coktan,DY,Bosluk soruSayilari - DogruCevapSayisi - Puan");
		das.writeInt(SinavBasla.getToplamSoruSayisi());
		das.writeInt(SinavBasla.getCoktanSec_SoruSayisi());
		das.writeInt(SinavBasla.getDogruYanlis_SoruSayisi());
		das.writeInt(SinavBasla.getBoslukDol_SoruSayisi());
		das.writeInt(SinavBasla.getDogruCevapSayisi());
		das.writeInt(SinavBasla.getToplamPuan());
		

		}catch(Exception e){
			System.out.println("Hata : " + e.getMessage());
		}				
	}
	
}
