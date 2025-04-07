package org.algomaster.arrays;

public class RemoveDuplicatesFromSortedArray_Approach1 {

    public int removeDuplicates(int[] nums) {

        //Time Complexity : O(N), Space Complexity :O(1)
        int start = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[start] = nums[i];
                start++;
            }
        }
        return start;

    }

}
