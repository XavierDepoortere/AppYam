package fr.eni.yamApp;

import java.util.Random;

public class De {
	private int numeroDe;
    private int nombreDeFace;
    private int faceTiree;
    private int numeroDeLancer;
    private Random rand = new Random();
	/**
	 * @param numeroDe
	 * @param nombreDeFace
	 */
	public De(int nombreDeFace, int numeroDeLancer) {
		this.nombreDeFace = nombreDeFace;
		this.numeroDeLancer = numeroDeLancer;
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
	 * @return the numeroDe
	 */
	public int getNumeroDe() {
		return numeroDe;
	}



	/**
	 * @return the faceTiree
	 */
	public int getFaceTiree() {
		return faceTiree;
	}
	
	



	/**
	 * @param faceTiree the faceTiree to set
	 */
	public void setFaceTiree(int faceTiree) {
		this.faceTiree = faceTiree;
	}



	public int lancerDe() {
		return this.faceTiree = rand.nextInt(nombreDeFace) + 1;
	    }

}
