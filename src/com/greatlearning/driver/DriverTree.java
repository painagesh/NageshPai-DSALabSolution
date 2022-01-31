package com.greatlearning.driver;

import java.util.ArrayList;

import com.greatlearning.services.FindLongestPath;
import com.greatlearning.services.Node;

public class DriverTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node root = new Node (100);
		root.leftNode  = new Node (20);
		root.rightNode = new Node (130);
		root.leftNode.leftNode = new Node (10);
		root.leftNode.rightNode = new Node (50);
		root.rightNode.leftNode = new Node (110);
		root.rightNode.rightNode = new Node (140);
		root.leftNode.leftNode.leftNode = new Node (5);
		
		ArrayList<Integer> output = FindLongestPath.findlongestpath(root);
		int size = output.size();
		
		
		System.out.print("Longest path is: "+output.get(size-1));
		for (int i = size -2; i>=0; i--) {
			
			System.out.print("->"+output.get(i));
		}
		
		

	}

}
