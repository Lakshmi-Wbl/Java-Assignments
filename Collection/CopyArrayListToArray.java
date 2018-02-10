package com.Collection;

import java.util.ArrayList;

public class CopyArrayListToArray {
	
	public static void main(String a[]) {
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("Red");
		arrl.add("Blue");
		arrl.add("Green");
		arrl.add("Yellow");
		System.out.println("Actual ArrayList:" + arrl);
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("Created Array content:");
		for (String str : strArr) {
			System.out.println(str);
		}
	}

}
