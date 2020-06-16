package hello;

public class Shuixian {
	public static void main(String args[]) {
		int i,j,k;
		for(int m=100;m<=999;m++) {
			i=m/100;
			j=(m-i*100)/10;
			k=m%10;
			if(i*i*i+j*j*j+k*k*k==m)
				System.out.println(m);
		}
	}
}
