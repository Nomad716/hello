package hello;

import java.util.Scanner;

public class Score {
		public static void main(String args[]) {
			Scanner in=new Scanner(System.in);
			System.out.print("Input your Score:");
			int score=in.nextInt();
			if(score>=60)
				System.out.println("�ϸ�");
			else
				System.out.println("���ϸ�");
		}
}
