package OopConcept;

public class methods {
	
	static int e;

	public static void main(String[] args) {
	methods obj =new methods();
	  
//	 int e = obj.abc();
		test();
//	 System.out.println(e);
	 
	 
	 int a1= obj.addition(40,20);
	 System.out.println(a1);
	}

	 public static void test() {
		System.out.println("test method");
		methods obj1=new methods();
		e= obj1.abc();
		System.out.println(e);
		
	}
	public int abc( ) {
		System.out.println("abc method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	public int addition(int x, int y) {
		System.out.println("addition method");
		int z = x+y;
		return z;
	}

}


