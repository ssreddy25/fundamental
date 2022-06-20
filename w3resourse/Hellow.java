package w3resourse;

import java.util.Scanner;

public class Hellow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your fname");
		String fname=sc.next();
		System.out.println("enter your lname");
		String lname=sc.next();
		sc.close();
		System.out.println();
		System.out.println("Hello \n"+fname+" "+lname);
	}

}
