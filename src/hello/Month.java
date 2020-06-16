package hello;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in); 
		int n;
		while(true) {
			System.out.println("请输入一个1~12之间的整数：");
			n=in.nextInt();
			if(1<=n&&n<=12)
				break;
			else
				continue;
		}
		switch(n) {
		case 1:System.out.println("1月有31天");break;
		case 2:System.out.println("2月有28天");break;
		case 3:System.out.println("3月有31天");break;
		case 4:System.out.println("4月有30天");break;
		case 5:System.out.println("5月有31天");break;
		case 6:System.out.println("6月有30天");break;
		case 7:System.out.println("7月有31天");break;
		case 8:System.out.println("8月有31天");break;
		case 9:System.out.println("9月有30天");break;
		case 10:System.out.println("10月有31天");break;
		case 11:System.out.println("11月有30天");break;
		case 12:System.out.println("12月有31天");break;
		}
	}

}
