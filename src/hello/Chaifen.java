package hello;

public class Chaifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1678;
		int i,j,k,m;
		i=n/1000;
		j=(n-i*1000)/100;
		m=n%10;
		k=(n%100-m)/10;
		System.out.println("n="+i+","+j+","+k+","+m);
	}

}
