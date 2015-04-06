package edu.worcester.cs.cs348;

import java.util.*;

public class Test {
	public static void main(String [] args) {
		System.out.println("Hi java");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("Hi java");

		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String text = in.next();
			System.out.println(text);
		}
		in.close();
	}
}
