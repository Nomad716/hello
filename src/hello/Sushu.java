package hello;

import java.util.Scanner;
public class Sushu {
	
	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.print("输入一个整数：");
		in = new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(n+"以内的素数有：");
		for(int k=2;k<=n;k++)
			if(IsSushu(k))
			{
				System.out.print(k+" ");
				count++;
				if(count%10==0)
					System.out.println("");
			}
	}
	
	public static boolean IsSushu(int m) {
		boolean flag=true;
		for(int i=2;i*i<=m;i++) {
			if(m%i==0)
				flag=false;
		}
		return flag;
	}
}
