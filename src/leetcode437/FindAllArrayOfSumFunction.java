package leetcode437;

import java.util.HashMap;
import java.util.List;

public class FindAllArrayOfSumFunction {
    public int pathSum(TreeNode root, int sum) {
    	HashMap<Integer, Integer> preSum = new HashMap<>();
    	
    	// base case, if current node is target
    	preSum.put(0, 1);
    	
        return findPathSum(root, 0, sum, preSum);
    }
    
    private int findPathSum(TreeNode node, int currentSum, int target, HashMap<Integer, Integer> preSum){
    	// If reach till the end of node
    	if(node == null){
    		return 0;
    	}
    	
    	currentSum += node.val;
    	
    	// Check if any presum is there
    	int result = preSum.getOrDefault(currentSum - target, 0);
    	
    	preSum.put(currentSum, preSum.getOrDefault(currentSum, 0) + 1);
    	
    	result += findPathSum(node.left, currentSum, target, preSum) + findPathSum(node.right, currentSum, target, preSum);
    	
    	// Remove all the presum that is not connected
    	preSum.put(currentSum, preSum.get(currentSum) - 1);
    	
    	return result;
    }

}
