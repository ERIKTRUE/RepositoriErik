package arrayLists;

import java.util.ArrayList;

public class test1ArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList();

		int i = (int) (Math.random() * 20);
		while (i != 0) {
			numeros.add(i);
		i = (int) (Math.random() * 11 - Math.random() * 11);
	}
	System.out.println(numeros);
	
	ArrayList<Integer> numeros1 = new ArrayList();
	for (Integer a:numeros) {
		numeros1.add(a);
	}
	
	numeros.add(100);
	numeros.add(100);
	numeros.add(100);
	
	System.out.println(numeros1);
	System.out.println(numeros);
	
	}
}
