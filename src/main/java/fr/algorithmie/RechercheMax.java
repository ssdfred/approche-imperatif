package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// Rechercher le plus grand élément du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		// Initialisation du plus grand élément avec le premier élément du tableau
		int maxElement = array[0];
	
		// Boucle pour parcourir le tableau
		for (int i = 1; i < array.length; i++) {
			// Test conditionnel pour trouver le plus grand élément du tableau
			if (array[i] > maxElement) {
				// Mise à jour du plus grand élément si un élément plus grand est trouvé
				maxElement = array[i];
			}
		}
	
		// Affichage du plus grand élément du tableau
		System.out.println("Le plus grand élément du tableau est : " + maxElement);
	}
	}

