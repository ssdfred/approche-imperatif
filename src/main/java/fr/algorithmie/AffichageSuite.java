package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0 ) {
				System.out.println(i);
			}
		}
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0 ) {
				System.out.println(i);
			}
		}

		// Boucle While
	int nb = 0;
		while (nb <=10) {
			System.out.println(nb);
			 nb++;
	}
	int i = 0;
	while (i <= 10) {
		if (i % 2 == 0) {
			System.out.println(i);
		}
		i++;
	}
	int j = 0;
	while (j <= 10) {
		if (j % 2 != 0) {
			System.out.println(j);
		}
		j++;
	} 

}

}
