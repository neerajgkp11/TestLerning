package test;

import java.util.ArrayList;

public class MaxDistinct {

	public static void main(String[] args) {
		String string="AABBBCBB";
		MaxDistinct maxDistinct=new MaxDistinct();
		int result=maxDistinct.maxDistinctStringLength(string);
		System.out.println(result);
		
	}

	private int  maxDistinctStringLength(String string) {
		// TODO Auto-generated method stub
		
		int stringSize=string.length();
		int result=stringSize;
		
		int distinictChar=getTotalDistinictChar(string);
		for (int i = 0; i < stringSize; i++) {
			for (int j = 0; j < stringSize-i; j++) {
				String subString=string.substring(i, j+i+1);
				int subStringLength=subString.length();
				int subStringDistChar=getTotalDistinictChar(subString);
				
				 if (subStringLength < result && distinictChar == subStringDistChar){ 
					 result = subStringLength; 
		            } 
				
			}
			
		}
		System.out.println(result);
		return result;
	}

	private int getTotalDistinictChar(String string) {
		// TODO Auto-generated method stub
		
		String distinctCharString="";
		char[] charArry=string.toCharArray();
		for (int i = 0; i < charArry.length; i++) {
			if (!distinctCharString.contains(""+charArry[i])) {
				distinctCharString=distinctCharString+charArry[i];
			}
			
		}
		
		return distinctCharString.length();
	}
}

