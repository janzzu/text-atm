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
		System.out.println("Syötä käyttäjänimi, tilinumero ja saldo painaen enter välissä: "); 
	    kayttaja = lukija.nextLine();						//Käyttäjänimen syöttö
	    tiliNumero = lukija.nextLine();						//Tilinumeron syöttö
	    saldo = lukija.nextDouble();						//Saldon syöttö
	    tiliTiedot(kayttaja, tiliNumero, saldo);			//Tulostetaan tilin tiedot
	    
	    System.out.println("Valitse 1: Tilitiedot, 2: Otto, 3: Talletus.");
	    valinta = lukija.nextInt();
	    if(valinta == 2){
	    	System.out.println("Syötä nostettava määrä: ");		//Nostotapahtuma
	    	otto = lukija.nextDouble();							
	    	nosto(otto, saldo);
	    	tiliTiedot(kayttaja, tiliNumero, saldo);
	    }
	    
	    if(valinta == 1){
	    	tiliTiedot(kayttaja, tiliNumero, saldo);
	    }
	    
	    if(valinta == 3){
	    	System.out.println("Syötä talletettava määrä: ");
	    	pano = lukija.nextDouble();
	    	talletus(pano, saldo);
	    	tiliTiedot(kayttaja, tiliNumero, saldo);
	    }
	    
	}
	}


