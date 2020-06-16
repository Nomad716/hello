package hello;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ÊäÈëÔÂ·İ£º");
		Scanner in=new Scanner(System.in);
		int month=in.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:System.out.println("´º¼¾");break;
		case 6:
		case 7:
		case 8:System.out.println("ÏÄ¼¾");break;
		case 9:
		case 10:
		case 11:System.out.println("Çï¼¾");break;
		case 12:
		case 1:
		case 2:System.out.println("¶¬¼¾");break;
		}
	}

}
