package fr.eni.yamApp;

import java.util.Random;

public class YamApp {

	public static void main(String[] args) {
		Random rand = new Random();
		
				// Instanciation de la partie
				Partie partie = new Partie(rand.nextInt(1001));
				
				partie.startApp();
				
				
				
				

	}

}
