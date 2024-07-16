package logicalPrograms;

import java.util.Scanner;

public class ThreeWaysToReverseString {
	
	public static  String reverseStringOne(String str) {
		int i=0;
		String s="";
		while(i<str.length()) {
			s=str.charAt(i)+s;
					i++;
		}
		return s;
	}
	
	public static String reverseStringTwo(String str) {
		char[] array = str.toCharArray();
		int i=array.length-1;
		String st="";
		while(i>=0) {
			st=st+array[i];
			i--;
			//System.out.println(st);
		}
		return st;
	}
	
	private static String reverseStringThree(String st) {
		if(st.isEmpty()) {
			return st;
		}
		return reverseStringThree(st.substring(1))+st.charAt(0);
	}
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String st=scan.nextLine();
		
		String string = reverseStringOne(st);
		System.out.println(string);
		
		String string1 = reverseStringTwo(st);
		System.out.println(string1);
		
		String string3 = reverseStringThree(st);
		System.out.println(string3);
		scan.close();
		
	}

	

}
