package com.bishtb.tree;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	// constructor
	TreeNode(){};

	TreeNode(int val){
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
