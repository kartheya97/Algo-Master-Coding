package org.algomaster.arrays;

public class MoveZeroes_Approach1 {

    public void moveZeroes(int[] nums) {

        //Time Complexity : O(N) and Space Complexity : O(1)
        int start = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[start] = nums[i];
                start++;
            }
        }
        for(int i = start;i<nums.length;i++)
            nums[i] = 0;

    }

}
