package hello;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in); 
		int n;
		while(true) {
			System.out.println("������һ��1~12֮���������");
			n=in.nextInt();
			if(1<=n&&n<=12)
				break;
			else
				continue;
		}
		switch(n) {
		case 1:System.out.println("1����31��");break;
		case 2:System.out.println("2����28��");break;
		case 3:System.out.println("3����31��");break;
		case 4:System.out.println("4����30��");break;
		case 5:System.out.println("5����31��");break;
		case 6:System.out.println("6����30��");break;
		case 7:System.out.println("7����31��");break;
		case 8:System.out.println("8����31��");break;
		case 9:System.out.println("9����30��");break;
		case 10:System.out.println("10����31��");break;
		case 11:System.out.println("11����30��");break;
		case 12:System.out.println("12����31��");break;
		}
	}

}
