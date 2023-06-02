package fr.eni.yamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partie {
	Scanner scan = new Scanner(System.in);

	private int numeroPartie;
	private int nbJoueur;
	private FicheScore ficheScore;
	protected List<Joueur> joueurs;
	private Tour tour;
	
	public Partie() {

	}

	public Partie(int numeroPartie) {
		this.numeroPartie = numeroPartie;
		this.joueurs = new ArrayList<>();
		this.tour = new Tour(joueurs);
		
		

	}
	
	public void startApp() {
		// Choix du nombre de joueur
		setNbJoueur();
		
		// Instanciation des joueurs 
		setJoueurs();
		
		// Lancement des tours de jeu(1 tour peu contenir un maximum de 3 lancer par joueur)
		tour.newTour();
		
	}

	public Tour getTour() {
		return tour;
	}

	

	public void setTour() {

	}

	public int getNumeroPartie() {
		return numeroPartie;
	}

	public int setNbJoueur() {
		while (nbJoueur < 1 || nbJoueur > 4) {
			System.out.print("Veuillez choisir un nombre de joueurs entre 1 et 4 : ");
			try {
				nbJoueur = Integer.parseInt(scan.nextLine());
				if (nbJoueur < 1 || nbJoueur > 4) {
					System.out.println("Nombre de joueurs invalide. Veuillez réessayer.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Saisie invalide. Veuillez entrer un nombre valide.");
			}
		}
		System.out.println("Nombre de joueurs choisi : " + nbJoueur);
		return nbJoueur;
	}

	public List<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs() {
		for (int indexNbJoueur = 1; indexNbJoueur <= getNbJoueur(); indexNbJoueur++) {
			System.out.print("Entrer nom du joueur " + (indexNbJoueur) + " : ");
			String nom = scan.nextLine();
			Joueur joueur = new Joueur(indexNbJoueur,
					nom.substring(0, 1).toUpperCase() + nom.substring(1).toLowerCase());
			joueurs.add(joueur);
		}
	}

	public int getNbJoueur() {
		return nbJoueur;
	}

}
