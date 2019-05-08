package SoruBankasi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SorulariKontrolEt extends Sorular{
	
	

	@Override
	public void SoruGetir() {
		CoktanSecmeliSorular();
		dogruYanlisSorular();
		BoslukDoldurmaSorular();
	}
	
	
	public static void KontrolEt(){
		
		
		try{
		
			File file = new File("sorubankasi.dat");
			
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream das = new DataOutputStream(bos);	
			
			if(!file.exists()){
				file.createNewFile();
			
			for(int j=0; j<CoktanSecmeliSorular().length; j++){
				for(int i=0; i<8; i++){
					das.writeUTF(CoktanSecmeliSorular()[j][i] + "##");
					}
				das.writeUTF("###");
				}
			das.writeUTF("####");
			
			for(int j=0; j<dogruYanlisSorular().length; j++){
				for(int i=0; i<6; i++){
					das.writeUTF(dogruYanlisSorular()[j][i]);
					}
				das.writeUTF("###");
				}
			das.writeUTF("####");
			
			for(int j=0; j<BoslukDoldurmaSorular().length; j++){
				for(int i=0; i<5; i++){
					das.writeUTF(BoslukDoldurmaSorular()[j][i]);
					}
				das.writeUTF("###");
				}
			das.writeUTF("####");
			bos.close();
			
			}
			
			
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			

				for(int i=0; i<CoktanSecmeliSorular().length; i++){
					for(int j=0; j<8; j++){
					if(CoktanSecmeliSorular()[i][j] == dis.readUTF()){
						break;
					}else{
						CoktanSecmeliSorular()[i][j] = null;
						das.writeUTF(CoktanSecmeliSorular()[i][j] + "##");
					}
				}
			}
					
					for(int i=0; i<dogruYanlisSorular().length; i++){
						for(int j=0; j<8; j++){
						if(dogruYanlisSorular()[i][j] == dis.readUTF()){
							break;
						}else{
							dogruYanlisSorular()[i][j] = null;
							das.writeUTF(dogruYanlisSorular()[i][j] + "##");
						}
					}
				}
					
					for(int i=0; i<BoslukDoldurmaSorular().length; i++){
						for(int j=0; j<8; j++){
						if(BoslukDoldurmaSorular()[i][j] == dis.readUTF()){
							break;
						}else{
							BoslukDoldurmaSorular()[i][j] = null;
							das.writeUTF(BoslukDoldurmaSorular()[i][j] + "##");
						}
					}
				}
					das.close();
					dis.close();
					System.out.println("Cýkýs yapýldi.");
					
		}catch(Exception e){
			System.out.println("Hata : " + e.getMessage());
		}				
	}
}