package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {

	// Créer un tableaux qui contient la somme totale des 2 précédents tableaux
	public static void main(String[] args) {
		// Initialisation des tableaux
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		// Initialisation des variables pour la somme		
		int sum1 = 0;
		int sum2 = 0;
	
		// Boucle pour calculer la somme des 2 tableaux
		for (int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
		}
		
		// Création d'un nouveau tableau pour stocker la somme totale
		int[] sumArray = new int[2]; // Le tableau a une taille de 2 pour stocker la somme totale
		sumArray[0] = sum1 + sum2; // Stockage des 2 sommes dans le nouveau tableau
		
	// Affichage du nouveau tableau 
	System.out.println("Le tableau résultant est : " + Arrays.toString(sumArray));
}
}
