package org.algomaster.arrays;

public class MoveZeroes_Approach2 {

    public void moveZeroes(int[] nums) {

        // Time Complexity : O(N) and Space Complexity : O(1)
        int p1 = 0, p2 = 0;
        while(p1 < nums.length){
            if(nums[p1] != 0){
                int temp = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = temp;
                p2++;
            }
            p1++;
        }

    }

}
