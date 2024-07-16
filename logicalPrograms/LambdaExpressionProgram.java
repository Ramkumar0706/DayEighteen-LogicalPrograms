package logicalPrograms;

import java.util.function.Predicate;

public class LambdaExpressionProgram {

	public static void main(String[] args) {

		int [] num= {12,323,434,55,31,3};

		Predicate<Integer> oddOrEven=( number)->number%2==1;

		Predicate<Integer> prime=( number)->{
			if(number==1) return false;
			for(int i=2;i<number/2;i++) {
				if(number%i==0)return false;
			}
			return true;
		};

		Predicate<Integer> palindrome=(number)->{
			int temp=number;
			int sum=0;
			while(temp!=0) {
				int d=temp%10;
				sum=sum*10+d;
				temp=temp/10;
			}
			return sum==number;	
		};

		for(int a:num) {
			System.out.println("odd Number of "+a+ " : "+oddOrEven.test(a));
			System.out.println("Prime Number "+a+" :"+prime.test(a));
			System.out.println("Palindrome Number "+a+" :"+palindrome.test(a)+"\n");
		}
	}
}
