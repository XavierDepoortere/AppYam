package fr.eni.yamApp;

import java.util.List;



public interface Affichage {
	public static final String GREEN = "\u001B[32m";
	 public static final String WHITE = "\u001B[37m";
	
	 
	String[][] graphiqueDes = { { "+-------+", "|       |", "|   O   |", "|       |", "+-------+" }, // Face décalage
			{ "+-------+", "|       |", "|   O   |", "|       |", "+-------+" }, // Face 1
			{ "+-------+", "| O     |", "|       |", "|     O |", "+-------+" }, // Face 2
			{ "+-------+", "| O     |", "|   O   |", "|     O |", "+-------+" }, // Face 3
			{ "+-------+", "| O   O |", "|       |", "| O   O |", "+-------+" }, // Face 4
			{ "+-------+", "| O   O |", "|   O   |", "| O   O |", "+-------+" }, // Face 5
			{ "+-------+", "| O   O |", "| O   O |", "| O   O |", "+-------+" } // Face 6
	};
	
	default void affichageLancer(int nbDe,List<De> list){
		System.out.println("Dé numéro 1   Dé numéro 2   Dé numéro 3   Dé numéro 4   Dé numéro 5");
		for (int i = 0; i < graphiqueDes[0].length; i++) {
			System.out.printf(" %s     %s     %s     %s     %s%n", 
		            graphiqueDes[list.get(0).getFaceTiree()][i],
		            (nbDe == 1) ? (Affichage.GREEN + graphiqueDes[list.get(1).getFaceTiree()][i] + Affichage.WHITE) : graphiqueDes[list.get(1).getFaceTiree()][i],
		            (nbDe == 1 || nbDe == 2 ) ? (Affichage.GREEN + graphiqueDes[list.get(2).getFaceTiree()][i] + Affichage.WHITE) : graphiqueDes[list.get(2).getFaceTiree()][i],
		            
		            (nbDe == 1 || nbDe == 2 || nbDe == 3 ) ? (Affichage.GREEN + graphiqueDes[list.get(3).getFaceTiree()][i] + Affichage.WHITE) : graphiqueDes[list.get(3).getFaceTiree()][i],
		            
		            (nbDe == 1 || nbDe == 2 || nbDe == 3 || nbDe == 4) ? (Affichage.GREEN + graphiqueDes[list.get(4).getFaceTiree()][i] + Affichage.WHITE) : graphiqueDes[list.get(4).getFaceTiree()][i]
		        );
		}
	
	}
	
	

}
