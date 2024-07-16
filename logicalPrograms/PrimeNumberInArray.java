package logicalPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberInArray {
	
	public static int[] getPrimeArray(int[] arr) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])==true) {
				al.add(arr[i]);
			}
		}
		int[] a=new int[al.size()];
		for(int i=0;i<a.length;i++) {
			a[i]=al.get(i);
		}
		return a;
	}
	
	public static boolean isPrime(int number) {
		if(number==1)
			return false;
		for(int i=2;i<number/2;i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int el=scan.nextInt();
		int[] n=new int[el];
		System.out.println("enter the elements to the array");
		for(int i=0;i<el;i++) {
			n[i]=scan.nextInt();
			
		}
		int[] array = getPrimeArray(n);
		for(int i:array) {
			System.out.println(i);
		}
		
	}

}
