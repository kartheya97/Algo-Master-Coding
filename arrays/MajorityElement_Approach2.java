package org.algomaster.arrays;

public class MajorityElement_Approach2 {

    class Solution {

        public int majorityElement(int[] nums) {

            //Time Complexity : O(N), Space Complexity : O(1)
            int candidate = 0;
            int counter   = 0;
            for(int num : nums){
                if(counter == 0 || candidate == num){
                    candidate = num;
                    counter++;
                }else
                    counter--;
            }
            return candidate;

        }

    }

}
