package it.unical.ingsw;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		FunnyAlgorithm m = new FunnyAlgorithm();
		try {
			List<Integer> list = Arrays.asList(new Integer[]{2, 3, -7});
			System.out.println(m.findIndex(list, 2 ));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
