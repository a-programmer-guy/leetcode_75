package solutions;

public class PivotIndex {


	    public int solution(int[] nums) {
	        int arraySum = 0;
	        // Get total sum of the array
	        for (int i = 0; i < nums.length; i++){
	            arraySum += nums[i];
	        }
	        // Minus the current sum and index value from the total for comparison 
	        int currentSum = 0;
	        for(int y=0; y < nums.length; y++){
	        	int remainingSum = arraySum-currentSum-nums[y];
	        	// Check the current sum against the remaining sum
	            if(currentSum == remainingSum){
	            	System.out.println("Pivot Index is: " + y + ". The left sum is "+ currentSum + ". The right sum is " + remainingSum);
	                return y;
	            }
	            // Add current index value to the current sum
	            currentSum += nums[y];
	        }
	        return -1;
	    }

	
	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		PivotIndex pivotIndex = new PivotIndex();
		pivotIndex.solution(nums);
	}

}
