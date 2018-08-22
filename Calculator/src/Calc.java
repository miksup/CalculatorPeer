
public class Calc {

	int a;
	int b;
	int c;
	
	public Calc(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void addition() 
	{
		a = this.a;
		b = this.b;
		c = this.c;
		
		if ((a + b) == c) {
			System.out.println(a + "+" + b + "=" + c);
		} else if ((a + c) == b) {
			System.out.println(a + "+" + c + "=" + b);
		} else if ((b+c) == a) {
			System.out.println(b + "+" + c + "=" + a);
		}		
		
	}
	
	public void subtraction() 
	{
		
		a = this.a;
		b = this.b;
		c = this.c;
		
		if ((a-b) == c) {
			System.out.println(a + "-" + b + "=" + c);
		} else if ((b-a) == c) {
			System.out.println(b + "-" + a + "=" + c);
		} else if ((a - c) == b) {
			System.out.println(a + "-" + c + "=" + b);
		} else if ((b - c) == a) {
			System.out.println(b + "-" + c + "=" + a);
		} else if ((c - b) == a) {
			System.out.println(c + "-" + b + "=" + a);
		} else if ((c - a) == b) {
			System.out.println(c + "-" + a + "=" + b);
		}
	}
	
	public void multiplication() 
	{
		a = this.a;
		b = this.b;
		c = this.c;
		
		if ((a * b) == c) {
			System.out.println(a + "x" + b + "=" + c);
		} else if ((a * c) == b) {
			System.out.println(a + "x" + c + "=" + b);
		} else if ((b*c) == a) {
			System.out.println(b + "x" + c + "=" + a);
		}		
		
	}
	
	public void divide() 
	{
		
		a = this.a;
		b = this.b;
		c = this.c;
		
		if ((a/b) == c) {
			System.out.println(a + "/" + b + "=" + c);
		} 
		if ((b/a) == c) {
			System.out.println(b + "/" + a + "=" + c);
		} 
		if ((a/ c) == b) {
			System.out.println(a + "/" + c + "=" + b);
		} 
		if ((b / c) == a) {
			System.out.println(b + "/" + c + "=" + a);
		}
		if ((c / b) == a) {
			System.out.println(c + "/" + b + "=" + a);
		}
		if ((c / a) == b) {
			System.out.println(c + "/" + a + "=" + b);
		}
	}
	
}
