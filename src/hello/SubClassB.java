package hello;

	abstract class SuperClass
    {
        String nName = "SuperClass";
        abstract void ShowTip();
}

     class SubClassA extends SuperClass
    {
       String nName = "SubClassA";
        String tip = "tip";
       void ShowTip()
       {
           System.out.println("This is " + nName);
       }
}

   public class SubClassB  extends  SubClassA
   {
       String c = "c";
       public static void main(String[] args)
       {
           SubClassA a = new SubClassA();
           System.out.println("This is " + a.nName);
           a.ShowTip();
           SubClassB b = new SubClassB();
           b.ShowTip();
          System.out.println("This is " + b.nName + "  " +  b.c);
      }
   }