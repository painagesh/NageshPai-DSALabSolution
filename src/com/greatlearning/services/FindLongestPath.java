package com.greatlearning.services;

import java.util.ArrayList;

public class FindLongestPath {
	
	public static ArrayList<Integer> findlongestpath (Node root){
		
		
		//if root is null means there is no binary tree. Return a empty vector
		
		if (root == null) {
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}
		
		
		//Recursive call on root.RightNode
		ArrayList<Integer> rightNode = findlongestpath(root.rightNode);
		
		//Recursive call on root.LeftNode
		ArrayList<Integer> leftNode = findlongestpath (root.leftNode);
		
		//Compare the size of the two ArrayList and insert currentNode accordingly
		if (rightNode.size() < leftNode.size()) {
			leftNode.add(root.data);
		}else {
			
			rightNode.add(root.data);
		}
		
		//Return the appropriate ArrayList
		return (leftNode.size() > rightNode.size() ? leftNode : rightNode);
		
	}

}
