package fr.eni.yamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Joueur {
	
	String saisie;
	private int numeroJoueur;
    private String nom;
    List<De> desSauvegarde = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    public Joueur() {
    }
    
    public Joueur(int numeroJoueur, String nom) {
    	
        this.numeroJoueur = numeroJoueur;
        this.nom = nom;
    }

	public int getNumeroJoueur() {
		return numeroJoueur;
	}

	public void setNumeroJoueur(int numeroJoueur) {
		this.numeroJoueur = numeroJoueur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<De> sauvegarde(List<De> des) {
	    List<De> sauvegarde = new ArrayList<>();

	    for (De de : des) {
	        if (de.getFaceTiree() != 0) {
	        	sauvegarde.add(de);
	        }
	    }	 
	    return sauvegarde;
	}
    
	public void choixLancer(List<De> des) {
		System.out.println("Choix joueur :");
		System.out.println("1 - Choix dé(s) à relancer");
		System.out.println("2 - Continuer à lancer");
		System.out.println("3 - Mettre au score");
		System.out.println("4 - Tout relancer");
		saisie = scan.nextLine();
		if (saisie.equals("1")) {
			
			do {
				System.out.println("Numéro du dé à rejouer ?");
				int saisieInt = scan.nextInt();
				scan.nextLine();
				saisieInt = saisieInt - 1;
				des.get(saisieInt).setFaceTiree(0);
				System.out.println("Souhaitez-vous en rejouer un autre ? (o/n)");
				saisie = scan.nextLine();
			} while (saisie.equals("o"));
			desSauvegarde = sauvegarde(des);
			des.clear();
			}
		if (saisie.equals("2")) {
			
			des.clear();
		
		}
		if (saisie.equals("3")) {
			System.out.println("Mettre au score");
		}
		if (saisie.equals("4")) {
			des.clear();
			desSauvegarde.clear();
			
			
		}
		
	}

	
    

}
