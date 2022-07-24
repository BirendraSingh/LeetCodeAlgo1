package com.bishtb.twopointers;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * @author biren
 *
 */
public class LC557ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] str = s.split(" ");
        for(String s1: str) {
            char[] chStr = s1.toCharArray();
            int i = 0;
            int j = chStr.length - 1;
            while(i<j){
                char temp = chStr[i];
                chStr[i] = chStr[j];
                chStr[j] = temp;
                i++;
                j--;
            }
            result.append(String.valueOf(chStr));
            result.append(" ");
        }
        return result.toString().trim();
    }
}
