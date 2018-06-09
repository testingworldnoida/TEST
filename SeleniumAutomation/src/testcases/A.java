package testcases;

import java.util.HashMap;

public class A {

	
	public HashMap sum(int a, int b)
	{
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		float div=a/b;
		HashMap  map = new HashMap();
		map.put("Sum", sum);
		map.put("Sub", sub);
		map.put("Mul", mul);
		map.put("Div", div);
		
		return map;
	}
	
	
	
}
