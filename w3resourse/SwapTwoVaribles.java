package w3resourse;

import java.util.Scanner;

public class SwapTwoVaribles {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter b number");
		int b=sc.nextInt();
		System.out.println("before swap");
		System.out.println("a"+"="+a);
		System.out.println("b"+"="+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("aftor swap");
		System.out.println("a"+"="+a);
		System.out.println("b"+"="+b);
		
	}
	

}
/**
 * another logic;
 
 * a = a + b;
 * b = a - b;
 * a = a - b;
*/