package org.bonn.se.uebung1.ws18.view;

import org.bonn.se.uebung1.ws18.control.Translator;
import org.bonn.se.uebung1.ws18.control.TranslatorFactory;
class Client {
	
	public Client() {	
		// Muss vorhanden sein, da Client von keiner Klasse abgeleitet ist
		// --> richtig!?
	}
	
	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber mit dem uebergebenen Wert der 
		// Variable aNumber aufgerufen werden.

		Translator translator = TranslatorFactory.createGermanTranslator();
		String result = translator.translateNumber(1);
				
		System.out.println("Das Ergebnis der Berechnung: "+result ); // [Ausgabe der Uebersetzung]	
		
		
	}
}
 