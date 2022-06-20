package w3resourse;

import java.util.Scanner;

public class DivdedOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input enter fristnumber");
		int num1=sc.nextInt();
		System.out.println("input enter secondnumber");
		int num2=sc.nextInt();
		int divided=num1/num2;
	    System.out.println();
		System.out.println("The division of num1 and num2 is :"+divided);
	}

}
