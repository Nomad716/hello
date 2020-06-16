package hello;

import java.util.Scanner;

public class trans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in=new Scanner(System.in);
	    String s=in.next();
	    char c=s.charAt(0);
		switch(c) {
		case 'a':System.out.println("A");break;
		case 'b':System.out.println("B");break;
		case 'c':System.out.println("C");break;
		case 'd':System.out.println("D");break;
		case 'e':System.out.println("E");break;
		default:System.out.println("other");break;
		}
	}
}
