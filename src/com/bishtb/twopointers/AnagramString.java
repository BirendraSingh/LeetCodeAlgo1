package com.bishtb.twopointers;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public boolean checkInclusion(String s1, String s2) {
	        if(s1.length() > s2.length())
	            return false;
	        int[] count = new int[26];
	        for(int i=0; i<s1.length();i++){
	            count[s1.charAt(i) - 'a']++;
	            count[s2.charAt(i) - 'a']--;
	        }
	        if(allZero(count)) return true;

	        for(int i = s1.length(); i<s2.length(); i++){
	            count[s2.charAt(i-s1.length()) - 'a']++;
	            count[s2.charAt(i) - 'a']--;
	            if(allZero(count)) return true;
	        }
	        return false;
	    }
	    public boolean allZero(int[] arr){
	        for(int i: arr)
	            if(i!=0) return false;
	        return true;
	    }
}
