package fr.algorithmie;

import java.util.ArrayList;
import java.util.Collections;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Conversion du tableau en ArraList
		ArrayList<Integer> arrayCopy = new ArrayList<>();
		for (int i : array) {
			arrayCopy.add(i);
		}
		
		// Inversion de l'ordre du tableau dans la liste
		Collections.reverse(arrayCopy);		
	
	
	//Affichage des éléments du tablea inversée
		
	for(int i : arrayCopy) {
		System.out.println(i);
	}
	
	}
}
