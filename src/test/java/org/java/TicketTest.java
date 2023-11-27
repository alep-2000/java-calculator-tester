package org.java;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.java.train.Ticket;
import org.junit.jupiter.api.Test;

public class TicketTest {
	private static Ticket t;
	
	@Test
	public void KmNegativi(){
		
		assertThrows(Exception.class, 
				()-> t.CalcolaPrezzo(-10, 20),
				"Eccezione attesa con Km negativi");
	}
	
	@Test
	public void EtaNegativa(){
		
		assertThrows(Exception.class, 
				()-> t.CalcolaPrezzo(10, -20),
				"Eccezione attesa con Eta negativa");
	}
	
	@Test
    public void testScontoUnder18() throws Exception {
        Ticket ticket = new Ticket(30, 15);
        double prezzo = ticket.CalcolaPrezzo(30, 15);
        assertEquals(30 * 0.21 - 0.2, prezzo, 0.001, "Lo sconto per età sotto i 18 non è corretto.");
    }

    @Test
    public void testScontoOver65() throws Exception {
        Ticket ticket = new Ticket(40, 70);
        double prezzo = ticket.CalcolaPrezzo(40, 70);
        assertEquals(40 * 0.21 - 0.4, prezzo, 0.001, "Lo sconto per età sopra i 65 non è corretto.");
    }

    @Test
    public void testSenzaSconto() throws Exception {
        Ticket ticket = new Ticket(25, 30);
        double prezzo = ticket.CalcolaPrezzo(25, 30);
        assertEquals(25 * 0.21, prezzo, 0.001, "Il prezzo senza sconto non è corretto.");
    }
}
