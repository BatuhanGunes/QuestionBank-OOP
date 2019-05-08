package SoruBankasi;

public class SoruSil extends Sorular{

		public void SoruGetir() {
			CoktanSecmeliSorular();
			dogruYanlisSorular();
			BoslukDoldurmaSorular();
		}
		    
		
	public void CoktanSec_soruSil(int soruNumarasi){

    	for(int i=0; i<9;i++){
        CoktanSecmeliSorular()[soruNumarasi][i] = null;
    		}
    }
	
	public void DogruYanlis_soruSil(int soruNumarasi){

    	for(int i=0; i<7;i++){
    		dogruYanlisSorular()[soruNumarasi][i] = null;
    		}
    }

	  public void Bosluk_soruSil(int soruNumarasi){

	    	for(int i=0; i<6;i++){
	    		BoslukDoldurmaSorular()[soruNumarasi][i] = null;
	    		}
	    }

}
