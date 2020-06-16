package hello;

import java.util.Scanner;

public class Date {
	public static void main(String args[]) {
		int[] a= {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner in=new Scanner(System.in);
		System.out.print("month:");
		int month=in.nextInt();
		System.out.print("day:");
		int day=in.nextInt();
		int count=0;
		for(int i=0;i<month-1;i++) {
			count+=a[i];
		}
		count=count+day;
		System.out.println("2014年"+month+"月"+day+"日是2014年的第"+count+"天");
	}
}
