package 哈希.快快乐树;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hash=new HashSet();
        while(n!=1&& !hash.contains(n)){
            hash.add(n);
            n=nextNum(n);
        }
        return n==1;
    }
    public int nextNum(int n){
        int res=0;
        while(n>0){
            int temp=n%10;
            n=n/10;
            res=res+temp*temp;
        }
        return res;
    }
}