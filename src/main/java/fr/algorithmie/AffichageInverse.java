package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}


		int[] arrayCopy = new int[array.length];
        // Copie des éléments du tableau source 'array' vers le tableau de destination 'arrayCopy'
        System.arraycopy(
            array, // Le tableau source dont les éléments seront copiés
            0,      // L'indice de départ dans le tableau source (0 signifie le début du tableau)
            arrayCopy, // Le tableau de destination où les éléments seront copiés
            0,      // L'indice de départ dans le tableau de destination (0 signifie le début du tableau)
            array.length // Le nombre d'éléments à copier du tableau source vers le tableau de destination
        );

		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}
	}

}
