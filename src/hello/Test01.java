package hello;
//import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System)
		int[] arr= {1,2,3,4,9,5};
		int target=16;
		int[] A=twoSum(arr,target); 
		if(A[0]==-1) System.out.println("没有符合条件的两个数");
		else System.out.print(A[0]+" "+A[1]);
	}
	public static int[] twoSum(int[] arr,int target ) {
		for(int x=0;x<arr.length-1;x++) {
			  for(int y=x+1;y<arr.length;y++) {
				  if(arr[x]+arr[y]==target)
					  return new int[] {x,y};
			  }
		}
		return new int[] {-1,-1};
	}
}
