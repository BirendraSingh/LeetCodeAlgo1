package com.bishtb.twopointers;

public class LC344ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
		for(char c: s)
			System.out.println(c);
	}

	public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length -1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
