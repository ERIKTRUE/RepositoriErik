package arrayLists;

import java.util.ArrayList;

public class exempleArrayList {
	public static void main(String[] args) {
		private int numero;
		
		ArrayList<Integer> numeros = new ArrayList();

		int i = (int) (Math.random() * 40);
		while (i != 0) {
			numeros.add(i);
		i = (int) (Math.random() * 11 - Math.random() * 11);
		}
		System.out.println(numeros);
	}
}