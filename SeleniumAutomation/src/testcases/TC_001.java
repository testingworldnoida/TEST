package testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;



public class TC_001 {

	
	
	public static void main(String[] args) {
		
		A  o = new A();
		HashMap m = o.sum(10, 4);
		System.out.println(m.keySet());
        System.out.println(m.get("Mul"));
	}
	
	 
}
