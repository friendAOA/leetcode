package 哈希.四数之和;

import java.util.HashMap;
import java.util.Map;

class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            Map<Integer,Integer> sumMap= new HashMap();
            Integer result=0;
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    int sum=nums1[i]+nums2[j];
                    sumMap.put(sum,sumMap.get(sum)==null?1:sumMap.get(sum)+1);

                }
            }

            for(int i=0;i<nums3.length;i++){
                for(int j=0;j<nums4.length;j++){
                    int r=0-nums3[i]-nums4[j];
                    if(sumMap.containsKey(r)){
                        result+=sumMap.get(r);
                    }
                }
            }
            return result;


        }
}