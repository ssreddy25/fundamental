package w3resourse;

import java.util.Scanner;

public class MultificatonTable {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a multification table number");
	 int n=sc.nextInt();	
	  for(int i=1;i<=10;i++) {
		  System.out.println(n+"*"+i+"="+n*i);
	  }
	}

}
