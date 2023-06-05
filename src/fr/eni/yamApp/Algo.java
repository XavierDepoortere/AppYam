package fr.eni.yamApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public interface Algo {

	public default void calculPossibilite(Lancer lancer) {
		int[] compteDe = new int[6];

		for (De de : lancer.getDes()) {
			int face = de.getFaceTiree();
			compteDe[face - 1]++;

		}
		int d = 1;
		int brelan = 0;
		int paire = 0;

		for (int element : compteDe) {
			
			if (element != 0) {
		
				System.out.println("Le nombre de dé " + d + " est : " + element);
				System.out.println("Total au " + d + " : " + d * element);
				   if (element == 5) {
			            System.out.println("Vous avez fait un yam de " + d);
			            System.out.println("Vous avez fait un carré de " + d);
			            System.out.println("Vous avez fait un brelan de " + d);
			        } else if (element == 4) {
			            System.out.println("Vous avez fait un carré de " + d);
			            System.out.println("Vous avez fait un brelan de " + d);
			        } else if (element == 3) {
			            System.out.println("Vous avez fait un brelan de " + d);
			            brelan = d;
			        } else if (element == 2) {
			            paire = d;
			           
			        }
			}
			d++;
		}
		if (brelan != 0 && paire != 0) {
		    System.out.println("Vous avez fait un full avec un brelan de " + brelan + " et une paire de " + paire);
		}
		lancer.getDes().sort(Comparator.comparingInt(De::getFaceTiree));
		List<De> uniqueDes = new ArrayList<>();
		De previousDe = null;

		for (De de : lancer.getDes()) {
		    if (previousDe == null || de.getFaceTiree() != previousDe.getFaceTiree()) {
		        uniqueDes.add(de);
		    }
		    previousDe = de;
		}
		boolean petiteSuite = false;
		boolean grandSuite = false;
		int count = 0;
		for (int i1 = 0; i1 < lancer.getDes().size() - 1; i1++) {
		    if (lancer.getDes().get(i1 + 1).getFaceTiree() - lancer.getDes().get(i1).getFaceTiree() == 1) {
		        count++;
		    }
		}

		if (count == 3) {
		    petiteSuite = true;
		    System.out.println("Vous avez une petite suite");
		}else if(count == 4) {
		    petiteSuite = true;
		    System.out.println("Vous avez une petite suite");
		    grandSuite = true;
		    System.out.println("Vous avez une grande suite");				    
		}
		
	}
}
