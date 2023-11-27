package org.java.train;

public class Ticket {
	private int Km;
	private int eta;
	private static final float PREZZO_INIZIALE = 0.21F;
	
	public Ticket(int Km, int eta) throws Exception {
		if (Km <= 0 || eta <= 0) {
            throw new Exception("Il numero di km e l'età devono essere positivi.");
        }

		
		setKm(Km);
		setEta(eta);
	}
	
	public int getKm() {
		return Km;
	}
	public void setKm(int km) {
		Km = km;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public double CalcolaPrezzo(int km2, int eta2) {
		
		double prezzoFinale;
		
		if(getEta() < 18) {
			prezzoFinale = PREZZO_INIZIALE * getKm() - 0.2;
		}else if(getEta() > 65){
			prezzoFinale = PREZZO_INIZIALE * getKm() - 0.4;
		}else{
		    prezzoFinale = PREZZO_INIZIALE * getKm() ;
		}
		
		return prezzoFinale;
	}
}
