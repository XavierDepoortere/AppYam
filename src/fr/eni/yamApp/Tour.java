package fr.eni.yamApp;

import java.util.ArrayList;
import java.util.List;

public class Tour implements Algo {
	int numeroTour;
	private List<Joueur> joueurs;
	Lancer lancer;
	

	public Tour(List<Joueur> joueurs) {
		 this.joueurs = joueurs;
		 this.lancer = new Lancer(joueurs);
	}

	public int getNumeroTour() {
		return numeroTour;
	}

	public void setNumeroTour(int numeroTour) {
		this.numeroTour = numeroTour;
	}
	
public void newTour() {
		
		lancer.setNombreDes(5);
		do {
			setNumeroTour(getNumeroTour() + 1);
			System.out.println("Numero du tour " + getNumeroTour());
			for (Joueur joueur : joueurs) {
				lancer.newLancer(joueur);
				calculPossibilite(lancer);
				lancer.getDes().clear();
				joueur.desSauvegarde.clear();
				
			}

		} while (getNumeroTour() != 5);
	}


}
