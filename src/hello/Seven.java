package hello;

public class Seven {
	public static void main(String args[]) {
		int sum=0,count=0;
		System.out.println("1~100֮��7�ı�����������");
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				count++;
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("");
		System.out.println("������"+count);
		System.out.println("�ܺͣ�"+sum);
	}
}
