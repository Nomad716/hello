

//continue语句的作用是跳过本次循环体中余下尚未执行的语句，
//立即进行下一次的循环条件判定，可以理解为仅结束本次循环。

//break结束当前整个循环，执行当前循环下边的语句。
//忽略循环体中任何其它语句和循环条件测试。



//Java基本数据类型可分为：
//整数类型：byte、short、int、long
//实数型：float、double
//字符型：char
//布尔型：boolean

package hello;

public class datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化
		int i=8;
		long j=12345678L;
		byte b=55;
		short s=128;
		float f=234.5F;
		double d=-1.5E-8;
		char c='a';
		boolean t=true;
		
		System.out.println("int类型："+i);
		System.out.println("long类型："+j);
		System.out.println("byte类型："+b);
		System.out.println("short类型："+s);
		System.out.println("float类型："+f);
		System.out.println("double类型："+d);
		System.out.println("char类型："+c);
		System.out.println("boolean类型"+t);
	}

}
