package hello;
import java.util.Scanner;
public class hi {
	public static void main(String[] args) {
	int[] arr=new int[6];
	int avg=0;
	for(int x=0;x<arr.length;x++) {
		System.out.print("��"+(x+1)+"����ί���");
		Scanner sc=new Scanner(System.in);
		arr[x]=sc.nextInt();
	}
	System.out.println("��ѡ�ֵ�ƽ����Ϊ��"+(getSum(arr)-getMax(arr)-getMin(arr))/4);
	} 
	public static int getMax(int[] arr) {
		int max = 0;
		for(int x=0;x<arr.length;x++) {
			max=arr[0];
			if(arr[x]>max) {
				max=arr[x];
			}
		}
		return max;
}
	public static int getMin(int[] arr) {
		int min=0;
		for(int x=0;x<arr.length;x++) {
			 min=arr[0];
			if(arr[x]<min) {
				min=arr[x];
			}
		}
		return min;
}
	public static int getSum(int[] arr) {
		int sum=0;
		for(int x=0;x<arr.length;x++) {
			sum+=arr[x];
		}
		return sum;
}
}