package solutions;

import java.util.Arrays;

public class RunningSum {

  public int[] solution(int[] nums) {
      int[] ans = new int[nums.length];
      ans[0] = nums[0];
      for(int i = 1; i < nums.length; i++){
          ans[i] = ans[i-1] + nums[i];
      }
      System.out.println(Arrays.toString(ans));
      return ans;
  }
  
  public static void main(String[] args) {
	  int[] nums = {1,1,1,1,1};
	  RunningSum runner = new RunningSum();
	  runner.solution(nums);
  }	
}
