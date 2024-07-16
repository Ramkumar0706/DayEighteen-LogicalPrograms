package logicalPrograms;

import java.util.Scanner;

public class PhoneNumberDecoder {

	public static String decodeNumber(String str) {
		if(str.length()!=10) throw new RuntimeException("Invalid phone number lenght");
		String decode="";
		for(char ch:str.toCharArray()) {
			if(ch<='9'&&ch>='0') {
				decode=decode+ch;
			}
			else if(ch<='z'&&ch>='a'||ch<='Z'&&ch>='A') {
				decode=decode+convertLetterintoNumber(ch);
			}
		}
		return isdecoderFormat(decode);
	}

	private static String convertLetterintoNumber(char ch) {
		
		String[] keyPad= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",""};
		char lowerCase = Character.toLowerCase(ch);
		String decode="";
		secondLoop:
			for(int j=0;j<keyPad.length;j++) {
				String arr=keyPad[j];
				if(arr.contains(""+lowerCase)) {
					int h=0;
					while(h<arr.length()) {

						if(lowerCase==arr.charAt(h)) {
							decode=decode+j;
							break secondLoop;
						}
						h++;
					}
				}
			}
		return decode;
	}

	private static String isdecoderFormat(String st) {
		
		if(st.length()!=10)throw new RuntimeException("Phone number is not valid");
		return "("+ st.substring(0,3) + ")" +
				st.substring(3,6) + "-" +
				st.substring(6);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number with the string");
		System.out.println(decodeNumber(sc.next()));
		sc.close();
	}
}
