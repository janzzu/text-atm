import java.util.Scanner;
public class PankkitiliMain extends Pankkitili {
	
	private static String kayttaja = "aaaa";
	private static String tiliNumero = "bbbb";
	private static double saldo = 0.0;
	private static double otto = 0.0;
	private static double pano = 0.0;
	private static int valinta = 0;
	
	private static final Scanner lukija = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Sy�t� k�ytt�j�nimi, tilinumero ja saldo painaen enter v�liss�: "); 
	    kayttaja = lukija.nextLine();						//K�ytt�j�nimen sy�tt�
	    tiliNumero = lukija.nextLine();						//Tilinumeron sy�tt�
	    saldo = lukija.nextDouble();						//Saldon sy�tt�
	    tiliTiedot(kayttaja, tiliNumero, saldo);			//Tulostetaan tilin tiedot
	    
	    System.out.println("Valitse 1: Tilitiedot, 2: Otto, 3: Talletus.");
	    valinta = lukija.nextInt();
	    if(valinta == 2){
	    	System.out.println("Sy�t� nostettava m��r�: ");		//Nostotapahtuma
	    	otto = lukija.nextDouble();							
	    	nosto(otto, saldo);
	    	tiliTiedot(kayttaja, tiliNumero, saldo);
	    }
	    
	    if(valinta == 1){
	    	tiliTiedot(kayttaja, tiliNumero, saldo);
	    }
	    
	    if(valinta == 3){
	    	System.out.println("Sy�t� talletettava m��r�: ");
	    	pano = lukija.nextDouble();
	    	talletus(pano, saldo);
	    	tiliTiedot(kayttaja, tiliNumero, saldo);
	    }
	    
	}
	}


