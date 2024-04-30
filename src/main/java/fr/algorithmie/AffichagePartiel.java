package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		for (int i = 0; i < array.length; i++) {
			// test conditionnel pour vérifier si la valeur est superieur à 3
			if (array[i] > 3) {
				// affichage de la valeur
				System.out.println(array[i]);
			}
		}
		// utilisation de la boucle for pour afficher les éléments du tableau
		for (int i = 0; i < array.length; i++) {
			// test conditionnel pour vérifier si l'élement est pair
			if (array[i] % 2 == 0) {
				// affichage de l'élement si la condition est remplie
				System.out.println(array[i]);
			}
		}
		// utilisation ne boucle et un test de manière à n’afficher que les valeurs correspondant aux index impairs
		for (int i = 0; i < array.length; i++) {
			// test conditionnel pour vérifier si l'élement est impair
			if (i % 2 != 0) {
				System.out.println(array[i]);
			}
		}

	}
}