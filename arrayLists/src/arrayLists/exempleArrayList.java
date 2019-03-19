package arrayLists;

import java.util.ArrayList;

public class exempleArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList();

		int i = (int) (Math.random() * 20);
		while (i != 0) {
			numeros.add(i);
		i = (int) (Math.random() * 11 - Math.random() * 11);
		}
		System.out.println(numeros);
	}
}