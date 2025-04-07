package org.algomaster.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_Approach1 {

    public int majorityElement(int[] nums) {
        //Time Complexity : O(N), Space Complexity : O(1)
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num : nums)
            map.put(num,map.getOrDefault(num,0)+1);
        int majorityElement = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
            if(entry.getValue() > nums.length/2)
                majorityElement = entry.getKey();
        return majorityElement;
    }



}
