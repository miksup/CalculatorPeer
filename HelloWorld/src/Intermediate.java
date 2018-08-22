
public class Intermediate {
	
	public int blackJack(int a, int b)
	/* I want to know is there a way to ensure that both 
	 of these integers are both greater than 0? or Can I use for? */
	
	{
		if (a > b && a < 22) 
		{
			return a;
		}
		else if (b > a && b < 22)
		{
			return b;
		}
		else 
		{
			return 0;
		}
	}

	public int blackJackZero (int card1, int card2) // what am I doing about these zeros? 
	
	{
		// (card1 > 0 && card2 > 0)
		{
			if (card1 > card2 && card1 < 22)
			{
				return card1;
			}
			else if (card2 > card1 && card2 < 22)
			{
				return card2;
			}
			else 
			{
				return 0;
			}
			
		}
		
	}
	
	//UniqueSum (read the instructions wrong...)
	
/*	public int uniqueSum(int a, int b, int c)
	{
		int total = 0;
		
		if (a != b && b != c)
		{
			total = a + b + c;
		}
		else if (a != b || b != c)
		{
			total = a + c;
		}
		else 
		{
			total = a;
		}
		
		return total;
		
	} */
	
	/* long winded 
	 * { 
		if (a != b && b != c)
		{
			return a + b + c;
		}
		else if (a != b && a != c)
		{
			return b + c;
		}
		else if (a != c && a == b)
		{
			return a + c;
		}
		else if (b != c && b == a)
		{
			return 
		}
		else if (b == a || b == c)
		{
			return b + a;
		}		 
		else 
			{
			return a;
			} */
	
	public int correctSum(int a, int b, int c)
	{
		int total = 0; 
		if (a != b && a != c)
		{
			total = total + a; 
		}
		if (b != a && b !=c )
		{
			total = total + b;
		}
		if (c != a && c != b)
		{
			total = total + c;
		}
		return total; 
	}
	
	public boolean tooHot(int temperature, boolean isSummer)
	{
		if (isSummer && temperature <= 100 && temperature >= 60)
		{
			return true;
		}
		else if (!isSummer && temperature <= 90 && temperature >= 60)
		{
			return true;
		}
		return false;
	}
	}


