package hello;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max,min,sum=0;
		double average=0;
		int[] a= new int[10];
		System.out.println("1~100֮���10 ���������");
		for(int k=0;k<=9;k++) {
			a[k]=(int)(Math.random()*100);
			System.out.print(a[k]+" ");
	}
		System.out.println("");
		min=a[0];
		max=a[0];
		for(int i=0;i<=9;i++) {
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
			sum+=a[i];
			average=(double)sum/10;
		}
		System.out.println("���ֵ��"+min);
		System.out.println("��Сֵ��"+max);
		System.out.println("ƽ��ֵ��"+average);
		System.out.println("��ֵ��"+sum);
	}
}
