package com.bishtb.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("***** PreOrder *****");
        for(int i: new TreeTraversal().preOrder(root))
        	System.out.println(i);
        System.out.println("**** InOrder *****");
        for(int i: new TreeTraversal().inOrder(root))
        	System.out.println(i);
        System.out.println("**** PostOrder *****");
        for(int i: new TreeTraversal().postorderTraversal(root))
        	System.out.println(i);
        System.out.println("**** Level order *****");
        for(List<Integer> list: new TreeTraversal().levelOrder(root)) {
        	for(int i: list)
        		System.out.println(i);
        }
	}

	//Preorder ( Root, Left, Right) traversal of a tree (DFS)
	public List<Integer> preOrder(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null)
			return result;
		result.add(root.val);
		result.addAll(preOrder(root.left));
		result.addAll(preOrder(root.right));
		return result;
	}

	public List<Integer> inOrder(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null)
			return result;
		result.addAll(inOrder(root.left));
		result.add(root.val);
		result.addAll(inOrder(root.right));
		return result;
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null)
			return result;
		result.addAll(postorderTraversal(root.left));
		result.addAll(postorderTraversal(root.right));
		result.add(root.val);
		return result;
    }

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()) {
        	List<Integer> resultList = new ArrayList<Integer>();
            int level = queue.size();
            for(int i=0; i<level;i++) {
            	TreeNode node = queue.poll();
        	    resultList.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            result.add(resultList);
        }
        return result;
    }
}
