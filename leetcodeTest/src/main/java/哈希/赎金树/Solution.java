package 哈希.赎金树;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        HashMap<Character,Integer> mage=new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++){
            char index= magazine.charAt(i);
            mage.put(index,mage.getOrDefault(index,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char index= ransomNote.charAt(i);
            mage.put(index,mage.getOrDefault(index,0)-1);
        }
        for(Character key:mage.keySet()){
            if(mage.get(key)<0){
                return false;
            }
        }
        return true;

    }
}