package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// Déclaration d'un tableau d'entiers
		int[] tab = {1, 2, 3, 4, 5, 6};
		/*On calcule une valeur booléenne qui contrôle le tableau de la sorte :
		elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		Alors on retourne true sinon on retourne false*/
		
		boolean resultat;

		if (tab.length > 1 && (tab[0] == 6 || tab[tab.length - 1] == 6)) {
			resultat = true;
		} else {
			resultat = false;
		}
		System.out.println(resultat);

	}

}
