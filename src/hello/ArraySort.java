package hello;

import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max;
		System.out.print("���������С��");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.print("����"+n+"������:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		min=a[0];	max=a[0];
		for(int j=1;j<n;j++) {
			if(a[j]<min)
				min=a[j];
			if(a[j]>max)
				max=a[j];
		}
		System.out.print("���ֵ��"+max);
		System.out.println("");
		System.out.print("��Сֵ��"+min);
		System.out.println("");
		Arrays.sort(a);
		for(int k=0;k<n;k++)
			System.out.print(a[k]+" ");
	}

}
