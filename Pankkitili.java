public class Pankkitili {

	
	public static void main(String[] args) {
	
	    
	}
	
	
	static void tiliTiedot(String kayttaja, String tiliNumero, double saldo) {
		System.out.println("Käyttäjänimi: " + kayttaja + ", tilinumero " + tiliNumero + ", saldo " + saldo);
	}
	static void nosto(double nosto, double saldo){
	    if (nosto <= saldo){
	    	saldo = saldo - nosto;
	    	System.out.println("Nostit " + nosto + " euroa.");
	    }else
	    	System.out.println("Virheellinen summa.");
		
		
	}
	
	static void talletus(double talletus, double saldo){
		if(talletus > 0){
			saldo = saldo + talletus;
			System.out.println("Talletit " + talletus + " euroa.");
		}else
			System.out.println("Virheellinen summa.");
		
	}
}
