package w3resourse;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input enter fristnumber");
		int num1=sc.nextInt();
		System.out.println("input enter secondnumber");
		int num2=sc.nextInt();
		int addtion=num1+num2;
		int substract=num1-num2;
		int product=num1*num2;
		int multify=num1/num2;
		int mod=num1%num2;
	    System.out.println();
	    System.out.println(num1+"+"+num2+"="+addtion);
	    System.out.println(num1+"-"+num2+"="+substract);
	    System.out.println(num1+"*"+num2+"="+product);
	    System.out.println(num1+"/"+num2+"="+multify);
		System.out.println(num1+"%"+num2+"="+mod);
		
	}

}
