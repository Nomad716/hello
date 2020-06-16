package hello;

public class Seven {
	public static void main(String args[]) {
		int sum=0,count=0;
		System.out.println("1~100之间7的倍数的整数：");
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				count++;
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("");
		System.out.println("个数："+count);
		System.out.println("总和："+sum);
	}
}
