package SoruBankasi;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;


public class SinavBasla extends Sorular{
	
	private static String SinavAdi, GozetmenAdi, SinavYeri, Katagori;
	private static String Kolay = "kolay", Orta = "orta", Zor = "zor";
	private static int CoktanSec_SoruSayisi, DogruYanlis_SoruSayisi, BoslukDol_SoruSayisi;
	private static int toplamPuan, dogruCevapSayisi, toplamSoruSayisi, SoruSayisi=1;
	private static int CoktanSec_Kolay, CoktanSec_Orta, CoktanSec_Zor;
	private static int DogruYanlis_Kolay, DogruYanlis_Orta, DogruYanlis_Zor;
	private static int Bosluk_Kolay, Bosluk_Orta, Bosluk_Zor;

	static Scanner input = new Scanner(System.in);
	static Random rnd = new Random();
	
	
	@Override
	public void SoruGetir() {
		CoktanSecmeliSorular();
		dogruYanlisSorular();
		BoslukDoldurmaSorular();
		
	}
	
	public static void SinavGonder(){
		BaslamadanOnce();
    	CoktanKatagoriAlgilama();
    	DogruYanlisKatagoriAlgilama();
    	BoslukKatagoriAlgilama();  
    	SinavBitti();
	}
	
	
	
	public static void BaslamadanOnce(){
		System.out.println("Sýnav Adini Giriniz : ");
		SinavAdi = input.nextLine();
		System.out.println("Gözetmen Adýný Giriniz : ");
		GozetmenAdi = input.nextLine();
		System.out.println("Sýnav Yerini Giriniz : ");
		SinavYeri = input.nextLine();
		System.out.println("Sýnavýn Katagorisini Giriniz . ");
		Katagori = input.nextLine();
		
		System.out.println("Coktan secmeli soru sayisini giriniz : ");
		CoktanSec_SoruSayisi = input.nextInt();
		System.out.println("kolay - orta - zor sýralamasýyla kac adet olacagýný yazýnýz.");
		CoktanSec_Kolay = input.nextInt();
		CoktanSec_Orta = input.nextInt();
		CoktanSec_Zor = input.nextInt();
		
		System.out.println("Dogru - Yanlis Soru sayisini giriniz : ");
		DogruYanlis_SoruSayisi = input.nextInt();
		System.out.println("kolay - orta - zor sýralamasýyla kac adet olacagýný yazýnýz.");
		DogruYanlis_Kolay = input.nextInt();
		DogruYanlis_Orta = input.nextInt();
		DogruYanlis_Zor = input.nextInt();
		
		System.out.println("Bosluk doldurma soru sayisini giriniz : ");
		BoslukDol_SoruSayisi = input.nextInt();
		System.out.println("kolay - orta - zor sýralamasýyla kac adet olacagýný yazýnýz.");
		Bosluk_Kolay = input.nextInt();
		Bosluk_Orta = input.nextInt();
		Bosluk_Zor = input.nextInt();
		
		System.out.println("----------Sýnava Baslamaya Hazýrsýnýz.------------");
		toplamSoruSayisi = CoktanSec_SoruSayisi + DogruYanlis_SoruSayisi + BoslukDol_SoruSayisi;
		
	}

		public static void CoktanKatagoriAlgilama(){
			CoktanSec_SoruSayisi +=1;
			for(CoktanSec_SoruSayisi--; CoktanSec_SoruSayisi>0;){
				int j = rnd.nextInt(CoktanSecmeliSorular().length);
				int KatagoriEsitMi = Katagori.compareTo(CoktanSecmeliSorular()[j][0]);
				
				int KolaySayi = Kolay.compareTo(CoktanSecmeliSorular()[j][1]);
				int OrtaSayi = Orta.compareTo(CoktanSecmeliSorular()[j][1]);
				int ZorSayi = Zor.compareTo(CoktanSecmeliSorular()[j][1]);
				if( KatagoriEsitMi == 0 && KolaySayi == 0){
					CoktanSinav(KatagoriEsitMi, j, CoktanSec_Kolay);
				}
				if(KatagoriEsitMi == 0 && OrtaSayi == 0){
					CoktanSinav(KatagoriEsitMi, j, CoktanSec_Orta);
				}
				if(KatagoriEsitMi == 0 && ZorSayi == 0){
					CoktanSinav(KatagoriEsitMi, j, CoktanSec_Zor);
				}
			}	
		}
		
		
		public static void DogruYanlisKatagoriAlgilama(){
			DogruYanlis_SoruSayisi += 1;
			for(DogruYanlis_SoruSayisi--; DogruYanlis_SoruSayisi>0;){
				int j = rnd.nextInt(dogruYanlisSorular().length);
				int KatagoriEsitMi = Katagori.compareTo(dogruYanlisSorular()[j][0]);
				
				int KolaySayi = Kolay.compareTo(dogruYanlisSorular()[j][1]);
				int OrtaSayi = Orta.compareTo(dogruYanlisSorular()[j][1]);
				int ZorSayi = Zor.compareTo(dogruYanlisSorular()[j][1]);
				if( KatagoriEsitMi == 0 && KolaySayi == 0){
					DogruYanlisSinav(KatagoriEsitMi, j, DogruYanlis_Kolay);
				}
				if(KatagoriEsitMi == 0 && OrtaSayi == 0){
					DogruYanlisSinav(KatagoriEsitMi, j, DogruYanlis_Orta);
				}
				if(KatagoriEsitMi == 0 && ZorSayi == 0){
					DogruYanlisSinav(KatagoriEsitMi, j, DogruYanlis_Zor);
				}
			}	
		}
		
		public static void BoslukKatagoriAlgilama(){
			BoslukDol_SoruSayisi += 1;
			for(BoslukDol_SoruSayisi--; BoslukDol_SoruSayisi>0;){
				int j = rnd.nextInt(dogruYanlisSorular().length);
				int KatagoriEsitMi = Katagori.compareTo(BoslukDoldurmaSorular()[j][0]);
				
				int KolaySayi = Kolay.compareTo(BoslukDoldurmaSorular()[j][1]);
				int OrtaSayi = Orta.compareTo(BoslukDoldurmaSorular()[j][1]);
				int ZorSayi = Zor.compareTo(BoslukDoldurmaSorular()[j][1]);
				if( KatagoriEsitMi == 0 && KolaySayi == 0){
					BoslukSinav(KatagoriEsitMi, j, Bosluk_Kolay);
				}
				if(KatagoriEsitMi == 0 && OrtaSayi == 0){
					BoslukSinav(KatagoriEsitMi, j, Bosluk_Orta);
				}
				if(KatagoriEsitMi == 0 && ZorSayi == 0){
					BoslukSinav(KatagoriEsitMi, j, Bosluk_Zor);
				}
			}	
		}
		
	

		public static void CoktanSinav(int KatagoriEsitMi, int deger, int ZorlukSayi){
		
					if(CoktanSec_SoruSayisi > 0 && ZorlukSayi >0 ){
						System.out.print("-------------------------------------\n");
						System.out.println(SoruSayisi+". Soru : ");
							SoruYazdir.CoktanSecSoruYazdir(CoktanSecmeliSorular(), deger);
							SoruSayisi = SoruSayisi + 1;
								CoktanSec_SoruSayisi = CoktanSec_SoruSayisi - 1;
								ZorlukSayi = ZorlukSayi - 1;
								System.out.print("Cevabýnýzý Giriniz : ");
								String verilenCevap = input.next();
								int verilenCevap_DogruMu = verilenCevap.compareTo(CoktanSecmeliSorular()[deger][7]);
					            if (verilenCevap_DogruMu == 0){
					            	
					            	int Puan = Integer.parseInt(CoktanSecmeliSorular()[deger][8]);
					            	toplamPuan = toplamPuan + Puan;
					                dogruCevapSayisi +=1;
					            		}else toplamPuan += 0;
						            }
								}
							
										

		public static void DogruYanlisSinav(int KatagoriEsitMi, int deger, int ZorlukSayi){
		
					if(ZorlukSayi >0 && DogruYanlis_SoruSayisi > 0){
						System.out.print("-------------------------------------\n");
						System.out.println(SoruSayisi+". Soru : ");
						SoruYazdir.DogruYanlisSoruYazdir(dogruYanlisSorular(), deger);
						SoruSayisi = SoruSayisi + 1;
							DogruYanlis_SoruSayisi = DogruYanlis_SoruSayisi - 1;
							ZorlukSayi = ZorlukSayi - 1;
							System.out.print("Cevabýnýzý Giriniz : ");
							String verilenCevap = input.next();
							int verilenCevap_DogruMu = verilenCevap.compareTo(dogruYanlisSorular()[deger][5]);
				            if (verilenCevap_DogruMu == 0){

				            	int Puan = Integer.parseInt(dogruYanlisSorular()[deger][6]);
				            	toplamPuan = toplamPuan + Puan;
				                dogruCevapSayisi +=1;
				            }else toplamPuan += 0;
						}		
					}
		
		
		
		public static void BoslukSinav(int KatagoriEsitMi, int deger, int ZorlukSayi){
		 
					if(ZorlukSayi >0 && BoslukDol_SoruSayisi > 0){
						System.out.print("-------------------------------------\n");
						System.out.println(SoruSayisi+". Soru : ");
						SoruYazdir.BoslukSoruYazdir(BoslukDoldurmaSorular(), deger);
						SoruSayisi = SoruSayisi + 1;
							BoslukDol_SoruSayisi = BoslukDol_SoruSayisi - 1;
							ZorlukSayi = ZorlukSayi - 1;
							System.out.print("Cevabýnýzý Giriniz : ");
							String verilenCevap = input.next();
							int verilenCevap_DogruMu = verilenCevap.compareTo(BoslukDoldurmaSorular()[deger][4]);
				            if (verilenCevap_DogruMu == 0){
				            	
				            	int Puan = Integer.parseInt(BoslukDoldurmaSorular()[deger][5]);
				            	toplamPuan = toplamPuan + Puan;
				                dogruCevapSayisi +=1;
				            }else toplamPuan += 0;
						}		
					}
		
		static SimpleDateFormat bicim = new SimpleDateFormat("dd.M.yyyy");
		static Date tarih = new Date();
		
		
		public static void SinavBitti(){
			System.out.println("\n--------Tebrikler Sýnavý Bitirdiniz Sonuclarýnýz---------\n"
					+ "\nSinav Adi : " + SinavAdi
						+ "\nGözetmen Adi : " + GozetmenAdi 
							+ "\nSýnav Yeri : " + SinavYeri 
								+ "\nSýnavýn Katagorisi : " + Katagori
									+"\nToplam Soru Sayisi : " + toplamSoruSayisi
										+ "\nDogru Cevap Sayiniz : " + dogruCevapSayisi 
											+"\nYanlýs Cevap Sayiniz : " + (toplamSoruSayisi-dogruCevapSayisi)
												+"\nToplam Puanýnýz : " + toplamPuan +"\n"
													+"\nAna Menuye yönlendiriliyorsunuz.\n");
			
			SinaviKaydet.Kaydet(SinavAdi + "_" + bicim.format(tarih) + ".dat");
		}

		public static String getSinavAdi() {
			return SinavAdi;
		}

		public static String getGozetmenAdi() {
			return GozetmenAdi;
		}

		public static String getSinavYeri() {
			return SinavYeri;
		}

		public static int getCoktanSec_SoruSayisi() {
			return CoktanSec_SoruSayisi;
		}

		public static int getDogruYanlis_SoruSayisi() {
			return DogruYanlis_SoruSayisi;
		}

		public static int getBoslukDol_SoruSayisi() {
			return BoslukDol_SoruSayisi;
		}

		public static int getToplamPuan() {
			return toplamPuan;
		}

		public static int getDogruCevapSayisi() {
			return dogruCevapSayisi;
		}

		public static int getToplamSoruSayisi() {
			return toplamSoruSayisi;
		}

		public static String getKatagori() {
			return Katagori;
		}
	
}
