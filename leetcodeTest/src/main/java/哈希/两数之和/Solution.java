package 哈希.两数之和;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash=new HashMap();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int l=target-nums[i];
            if(hash.containsKey(l)){
                result[0]=hash.get(l);
                result[1]=i;
                return result;
            }
            hash.put(nums[i],i);
        }
        return result;
    }
}