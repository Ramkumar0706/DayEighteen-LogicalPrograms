package logicalPrograms;

import java.util.Scanner;

public class PigLatin {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the word:");
	    String input = scan.next();
	    String pigLatin = toPigLatin(input);
	    System.out.println("Pig Latin translation: " + pigLatin);
	    scan.close();
	}

	public static String toPigLatin(String word) {
	    
	    char firstChar = word.charAt(0);
	    if ("AEIOUaeiou".indexOf(firstChar) != -1) {
	        return word + "ay"; 
	    } else {
	        int index = 0;
	        for (int i = 1; i < word.length(); i++) {
	            if ("AEIOUaeiou".indexOf(word.charAt(i)) != -1) {
	                index = i;
	                break;
	            }
	        }
	        return word.substring(index) + word.substring(0, index) + "ay";
	    }
	}

	

}
