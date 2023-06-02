package fr.eni.yamApp;

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
			}
			d++;
		}
	}
}
