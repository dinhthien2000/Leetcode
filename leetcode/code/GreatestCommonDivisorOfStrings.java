package leetcode.code;

import java.util.Iterator;

public class GreatestCommonDivisorOfStrings {

	public static int getGreatestLengthCommon(int bigLength, int smallLength){
        
        int big = bigLength;
        int small = smallLength;
        int common = 0;

        for(int i = 0; i < smallLength; i++ ){
        	
        	common = big - small;

        	if (common == small) {
				break;
			}
        	big = small > common ? small : common;
        	small = small < common ? small : common;

        }
        
        return common;
    }

	public static String gcdOfStrings(String str1, String str2) {
		
		int length = getGreatestLengthCommon(str1.length(), str2.length());
		String common = "";
		
		for (int i = 0; i <= length; i++) {
			
			if (i == length) {
				if(str1.charAt(length) != str2.charAt(0)) {
					common = "";
				}
				break;
			}
			
			if (str1.charAt(i) == str2.charAt(i)) {
				common += str1.charAt(i);
			}else {
				common = "";
				break;
			}
		}
		return common;
		
	}

	public static void main(String[] args) {
		
		System.out.println(gcdOfStrings("ABCABC","ABC"));
		System.out.println(gcdOfStrings("",""));
		System.out.println(gcdOfStrings("",""));
	}
}
