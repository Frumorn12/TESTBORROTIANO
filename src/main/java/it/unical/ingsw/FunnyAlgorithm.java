package it.unical.ingsw;

import java.util.List;

public class FunnyAlgorithm {

	public int findIndex(List<Integer> list, int value){
		if(list == null){
			throw new IllegalArgumentException("Lista null");
		}

		for (int i = 0; i < list.size()-1; i++) {
			if(list.get(i) == value){ // Se l'elemento in posizione i è uguale a value, restituisco i
				return i;
			}
		}
		return -1;
	}
}
