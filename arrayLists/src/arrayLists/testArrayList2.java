package arrayLists;

import java.util.ArrayList;

public class testArrayList2 {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> bidim = new ArrayList();
		ArrayList<String> a = new ArrayList();
		a.add("pepe");
		a.add("paco");
		bidim.add(a);
		ArrayList<String> b = new ArrayList();
		a.add("ana");
		a.add("luis");
		a.add("juan");
		bidim.add(b);
		System.out.println(bidim);
		bidim.get(1).set(1,"pedro");
		System.out.println(bidim);
		bidim.get(1).add("mariano");
		System.out.println(bidim);
	}

}
