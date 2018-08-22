
public class HelloWorld {
		
	public static void main(String [] args)
	{
		/* System.out.println("Hello World!");
		System.out.println("Good Afternoon");
		
		String hello = "Hello World";
		System.out.println(hello);
		
		*/
		Basic b = new Basic(); // making an instance of that class Basic
		/*
		b.exampleParamters("Stupid");
		b.exampleParamters("Learning"); 
		
		System.out.println(b.exampleReturn());
		System.out.println(b.exampleOperators(20, 45, true));
		System.out.println(b.exampleOperators(20, 45, false));
		
		System.out.println(b.exampleOperators2(22, 0));
		System.out.println(b.exampleOperators2(345, 23));
		System.out.println(b.exampleOperators2(0, 333));
		
		System.out.println("Iteration for loop:");
		for (int i = 0; i < 10; i++)
		{
			System.out.println(b.exampleOperators(2, i, true));
		}
		int number = 80; 
		System.out.print(number);
		System.out.println("Ohhhhhh" + (number + 100));
		System.out.print(number); */
		
		PracticeBasic p = new PracticeBasic();
		
		p.practiceParameters("interesting");
	
		int[] arrayPracticeBasic = {2, 45, 6, 87, 4};
		System.out.println(arrayPracticeBasic[0]);
		System.out.println(arrayPracticeBasic [2]);
		
		int[] arrayBasic = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		arrayBasic [1] = 2;
		arrayBasic [2] = 12;
		arrayBasic [3] = 14;
		arrayBasic [4] = 89; 
		arrayBasic [5] = 78;
		arrayBasic [6] = 65; 
		
		System.out.println(b.exampleOperators2(arrayBasic [1], arrayBasic [3]));
		
		for (int i=0; i < arrayBasic.length; i++)
		{
			System.out.println("Number: " + arrayBasic[i]);
		}
		
		for (int i: arrayBasic)
		{ 
			System.out.println("struggling " + i);
		}
		int [] arrayIteration = new int [10];
		for (int i = 0; i < arrayIteration.length; ++i)
		{
			arrayIteration[i] = i * 10;
			System.out.println("Iteration " + arrayIteration[i]);
		}
//		int number = 3; 
//		System.out.println(number);
//		String name = "hello silly"; 
	//	System.out.println(name);
		
		System.out.println(b.exampleReturn());
		
		Intermediate inter = new Intermediate();
		
		System.out.println(inter.blackJack(2,3));
		//System.out.println(" ");
		//System.out.println(b.practiceBoolean(2, true));
		//System.out.println(b.practiceBoolean(2, false));
		
		//practiceCondition relevant to Condition 2
		/*System.out.println(b.practiceCondition(0, 0, true));
		System.out.println(b.practiceCondition(2, 0, true));
		System.out.println(b.practiceCondition(2, 0, false));
		System.out.println(b.practiceCondition(3, 45, true));
		System.out.println("Oh here it is: " + b.practiceCondition(3, 45, false)); */
		
		/* for (int f = 100; f > 28; f--)
		{ 
			System.out.println(f); */ 
			
		System.out.println(inter.correctSum(8, 3, 3));
		System.out.println(inter.correctSum(3, 3, 3));
		System.out.println(inter.correctSum(1, 3, 6));
		System.out.println(inter.correctSum(3, 3, 8));
		System.out.println(inter.correctSum(3, 8, 3));
		
		System.out.println(inter.tooHot(97, false));
		System.out.println("too hot? " + inter.tooHot(60, true));
	}
	

}


