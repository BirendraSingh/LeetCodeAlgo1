package com.bishtb.twopointers;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLongestSubstring(String s) {
        int i = 0, j =0, max =0;
        if(s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
