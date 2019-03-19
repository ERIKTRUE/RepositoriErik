package arrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList miArray = new ArrayList(100);
		miArray.add("una frase");
		miArray.add(6);
		miArray.add(7.345);
		miArray.add("a");
		System.out.println(miArray);
		System.out.println(miArray.get(3));
		miArray.add(2, "elementt");
		System.out.println(miArray);
		miArray.remove(3);
		System.out.println(miArray);
		miArray.add(10, "aaaaa");
		System.out.println(miArray);

		/*
		 * for (int i = 0 ; i<miArray.size(); i++) { System.out.println(miArray);
		 */
		miArray.set(2, "bbbb");
		System.out.println(miArray);
		System.out.println(miArray.contains("bbbb"));
		System.out.println(miArray.indexOf("bbbb"));
		System.out.println(miArray.getClass());
		miArray.clear();
		System.out.println(miArray.getClass());

		ArrayList<String> strings = new ArrayList();
		strings.add("bla bls");
		strings.add("7.6788");
		strings.add("c");

		int a = 0;
		Integer c = new Integer(6);

		ArrayList<Integer> numeros = new ArrayList();
		numeros.add(6);
		numeros.add(5);
		numeros.add(-6);

		System.out.println(numeros);
		/*
		 * for (int i = 0 ; i<miArray.size(); i++) { System.out.println(miArray.get(i));
		 */

		/*
		 * Iterator it = miArray.listIterator(); while (it.hasNext()) {
		 * System.out.println(it.hasNext()); }
		 */

		/*
		 * 
		 * for (String s:strings) { System.out.println(s); } for (Integer i:numeros) {
		 * System.out.println(i); }
		 * 
		 * for (Object o:miArray) { System.out.println(0); }
		 */
	}
}
