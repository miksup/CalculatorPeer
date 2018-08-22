
public class Basic {	
	public void exampleParamters (String param) 
	{
		System.out.println(param);
	}
	public String exampleReturn() 	
	{
		return "Hello World!";
	}
	public int exampleOperators(int a, int b, boolean condition)	
	{ 
		if (condition) 
		{
			return a + b;
			
		} 
		else {
			return a*b; 
		}
		
	}
	public int exampleOperators2(int a, int b)
	{
		if (a == 0)
		{
			return b;
		}
		else if (b ==0) 
		{
			return a; 
		}
		return a + b; 
	}
	
	public String practiceBoolean(int ab, boolean conditions)
	{
		if (ab == 2 && conditions)
		{
			return "true and ab is equal to 2"; 
		}
		else 
		{
			return "false and ab is not equal to 2";  
		}
	}
	
	// relevant to the Conditionals2
	public int practiceCondition(int a, int b, boolean practice)
	{
		if (a != 0 && b != 0)
		{
			if (practice)
			{
				return a + b;
			}
			else 
			{
				return a * b;
			}
		}
		else if (a == 0)
		{
			return b;
			}
		else if (b == 0)
		{
			return a;
		}
		else 
		{
			return 0;
		}
		}
	
	
	//forloop practice (intialising eg int i = 0; exit condition eg i <10; update eg i++) {sysout...}

	}
		
	
	
