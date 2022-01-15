package program;

public class Sample3 {
	
	int a;
	double b;
	Sample3(int x,double y)
	{
		a=x;
		b=y;
	}

	public static void main(String[] args) {
		
		Sample3 d1=new Sample3(10,10.5);
		System.out.println(d1.a);
		System.out.println(d1.b);

	}

}
