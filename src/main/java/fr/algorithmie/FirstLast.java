package fr.algorithmie;

public class FirstLast {

	/*
	 * On calcule une valeur booléenne qui controle le tableau de sorte que :
	 * elle vaut true si il est superieur ou égal à 1 et si le premier et le dernier élements du tableau
	 * ont la même valeur
	 * si non elle vaut false
	 * */
	public static void main(String[] args) {
		// Déclaration d'un tableau d'entiers
		int[] tab = {1, 2, 3, 4, 5, 6};
		/*On calcule une valeur booléenne qui contrôle le tableau de la sorte :
		elle vaut true si le tableau a superieur ou égale à 1 élément et si le premier élément et le dernier élément ont la même valeur.
		Alors on retourne true sinon on retourne false*/
		
		boolean resultat;
		if (tab.length >= 1 && (tab[0] == tab.length -1)) {
			resultat = true;
		} else {
			resultat = false;
		}
		System.out.println("resultat = " + resultat);
		}


}
