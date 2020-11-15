package leetcode437;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		
		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.left.right.right = new TreeNode(1);
		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);
		root.right.right = new TreeNode(11);
		
		System.out.println("Input: " + "[10,5,-3,3,2,null,11,3,-2,null,1]");
		int sum = 8;
		
		System.out.println("Target Sum: " + sum);
		
		FindAllArrayOfSumFunction solution = new FindAllArrayOfSumFunction();
		
		System.out.println("Solution: " + solution.pathSum(root, sum));

	}
	
	
}
