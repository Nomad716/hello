package hello;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�����·ݣ�");
		Scanner in=new Scanner(System.in);
		int month=in.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:System.out.println("����");break;
		case 6:
		case 7:
		case 8:System.out.println("�ļ�");break;
		case 9:
		case 10:
		case 11:System.out.println("�＾");break;
		case 12:
		case 1:
		case 2:System.out.println("����");break;
		}
	}

}
