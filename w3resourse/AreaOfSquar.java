package w3resourse;

import java.util.Scanner;

public class AreaOfSquar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radiues value");
		double radiues=sc.nextDouble();
		System.out.println("area of circle is a :"+Math.PI* radiues* radiues);
		System.out.println("area of premeter is a :"+2*radiues* Math.PI);
	}

}
