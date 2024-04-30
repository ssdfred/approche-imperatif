package fr.algorithmie;


public class RechercheMin {

	public static void main(String[] args) {
	    // Tableau d'entiers
	    int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	    
	    // Initialisation du plus petit élément avec le premier élément du tableau
	    int minElement = array[0];

	    // Boucle pour parcourir le tableau
	    for (int i = 1; i < array.length; i++) {
	        // Test conditionnel pour trouver le plus petit élément du tableau
	        if (array[i] < minElement) {
	            // Mise à jour du plus petit élément si un élément plus petit est trouvé
	            minElement = array[i];
	        }
	    }

	    // Affichage du plus petit élément du tableau
	    System.out.println("Le plus petit élément du tableau est : " + minElement);
	}

}
