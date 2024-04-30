package fr.algorithmie;

public class CalculMoyenne {
	public static void main(String[] args) {
		// tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};	
		//Initialisation de la somme à 0
		int sum = 0;
		
		// Boucle pôur parcourir le tableau et calculer la somme
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// Calcul de la moyene
		double average = (double) sum / array.length;
		
		//Affichage de la moyenne
		System.out.println("La moyenne du tableau est : " + average);
		
	}

}
