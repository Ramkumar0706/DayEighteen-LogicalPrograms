package logicalPrograms;

import java.util.Scanner;

public class ReverseOnlyWordInString {
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String name=scan.next();
		String returnString=stringReverse(name);
		System.out.println("original String :"+name);
		System.out.println("reversed String :"+returnString);
		scan.close();
	}

	private static String stringReverse(String name) {
		int l=0;
		int r=name.length()-1;
		char[] ch=name.toCharArray();
		while(l<r) {
			if(Character.isLetter(ch[l])&&Character.isLetter(ch[r])) {
				char temp=ch[l];
				ch[l]=ch[r];
				ch[r]=temp;
				l++;
				r--;
			}
			else {
				if(!Character.isLetter(ch[l])) {
					l++;
				}
				if(!Character.isLetter(ch[r])) {
					r--;
				}	
			}
		}
		return new String(ch) ;
	}
}
