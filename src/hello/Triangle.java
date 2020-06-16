package hello;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int[][] arr=new int[n][2*n-1];

		for(int i=0;i<n;i++) {
			int k=1;
			for(int j=n-1-i;j<=n-1;j++) {
				arr[i][j]=k;
				k++;
			}
			for(int j=n-1;j<=n-1+i;j++) {
				k--;
				arr[i][j]=k;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n-1;j++) {
				if(arr[i][j]==0)	System.out.print("  ");
				else System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
