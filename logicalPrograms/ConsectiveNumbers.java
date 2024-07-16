package logicalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ConsectiveNumbers {
	
	public static  boolean isConsectiveNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) return false;
				else if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}		
		}
		System.out.println(Arrays.toString(arr));
		for (int j = 1; j < arr.length; j++) {
			if(arr[j]!=arr[j-1]+1)return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int[] num=new int[scan.nextInt()];
		for (int i = 0; i < num.length; i++) {
			num[i]=scan.nextInt();
		}
		boolean number = isConsectiveNumber(num);
		System.out.println(number);
		scan.close();
	}
}
