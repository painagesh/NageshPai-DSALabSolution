package com.greatlearning.services;

import java.util.Stack;

public class BalancingBrackets {

	//P1 
	//Static function
	//return a boolean
	//brackets String... bracketExpression e.g. {([])}

	public boolean bracketcheck (String bracketExpression) {

		//Initialise the data structure

		Stack <Character> stack = new Stack <Character>();


		for (int i = 0; i < bracketExpression.length(); i++) {

			//fetch each character
			char c = bracketExpression.charAt(i);
			//System.out.println(c);

			//check if character is opening bracket

			if (c == '{' || c == '(' || c == '[') {

				stack.push(c);
				continue;
			}

			if (stack.isEmpty())
				return false;


			char stackelement;
			stackelement = stack.pop();

			switch (c) {

			case ']':
				if (stackelement !='[')
					return false;
				break;

			case '}':
				if (stackelement != '{')
					return false;
				break;

			case ')':
				if (stackelement != '(')
					return false;
				break;

			default:
				return false;

			}
		}

		return (stack.isEmpty());

	}

}
