public class kata_henkan {
	public static void main(String[] args) {
		//暗黙的型変換 代入時
		byte b=10;
		short s=20;
		int i=30;
		//i=1.1;
		double d=1.1;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		System.out.println("------------------");
		
		//short型の変数にbyte型の変数を代入
		s=b;
		//int型の変数にshort型の変数を代入
		i=s;
		//double型の変数にint型の変数を代入
		d=i;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		System.out.println("------------------");
		
		//byte型の変数にshort型の変数を代入
		//b=s;
		//short型の変数にint型の変数を代入
		//s=i;
		//int型の変数にdouble型の変数を代入
		//i=d;
		
		//暗黙的型変換 代入時以外
		System.out.println(100*1.1);
		
		i=100;
		d=1.1;
		
		System.out.println(i*d);
		
		System.out.println(100+"10");
		
		System.out.println("------------------");
		
		//明示的な型変換
		
		//準備
		b=10;
		s=20;
		i=30;
		d=1.1;
		
		//byte型の変数にshort型の変数を代入
		b=(byte)s;
		//short型の変数にint型の変数を代入
		s=(short)i;
		//int型の変数にdouble型の変数を代入
		i=(int)d;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);

  }
}
