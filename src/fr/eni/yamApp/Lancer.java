package fr.eni.yamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lancer implements Affichage {
	Scanner scan = new Scanner(System.in);
	private List<Joueur> joueurs;
	int numeroDeLancer;
	int nombreDes;
	private List<De> des;
	

	public Lancer(List<Joueur> joueurs) {
		this.numeroDeLancer = numeroDeLancer;
		this.nombreDes = nombreDes;
		this.des = new ArrayList<>();
		this.joueurs = joueurs;
	}
	
public void newLancer(Joueur joueur) {
	setNumeroDeLancer(0);
		do {
			setNumeroDeLancer(getNumeroDeLancer()+1);
			System.out.println("Lancer N° "+ getNumeroDeLancer());
			System.out.println(joueur.getNom() + " appuyer sur entrée pour lance les dé");
			scan.nextLine();
			for (int indexDe = 1; indexDe <= getNombreDes(); indexDe++) {
				De de = new De(6, getNumeroDeLancer());
				de.lancerDe();
				ajouterDe(de);
			}
			if(joueur.desSauvegarde.size() != 0) {
				des.addAll(joueur.desSauvegarde);
			}
			
			affichageLancer(getNombreDes(), getDes());
			setNombreDes(5);
			if(getNumeroDeLancer() != 3) {
				joueur.choixLancer(getDes());
				if(joueur.desSauvegarde.size() != 0) {
					setNombreDes(getNombreDes()-joueur.desSauvegarde.size());
				} 
			}
			
		} while (getNumeroDeLancer() != 3);

	}


	/**
	 * @return the numeroDeLancer
	 */
	public int getNumeroDeLancer() {
		return numeroDeLancer;
	}

	/**
	 * @param numeroDeLancer the numeroDeLancer to set
	 */
	public void setNumeroDeLancer(int numeroDeLancer) {
		this.numeroDeLancer = numeroDeLancer;
	}

	/**
	 * @return the nombreDes
	 */
	public int getNombreDes() {
		return nombreDes;
	}

	/**
	 * @param nombreDes the nombreDes to set
	 */
	public void setNombreDes(int nombreDes) {
		this.nombreDes = nombreDes;
	}
	
	public void ajouterDe(De de) {
		des.add(de);
	}
	public List<De> getDes(){
		return des;
    }
	
	
	
}
