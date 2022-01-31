package com.greatlearning.driver;

import com.greatlearning.services.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String InputString = "{([])}";
		
		BalancingBrackets BB = new BalancingBrackets();
		
		if (BB.bracketcheck(InputString))
			System.out.println("The string is balanced");
		
		else 
			System.out.println ("The string is not balanced");
		
		
		
		
	}

}
