package hello;

 class Sup {
	  public int getLength() { return 4;}
	}

	   public class Sub extends Sup {
	   public int getLength() { return 5;}

	   public static void main(String args[]){
	     Sup sooper = new Sup();
	     Sub  sub = new Sub();
	     System.out.println(
	     sooper.getLength() + "," + sub.getLength());
	   }
	   }

