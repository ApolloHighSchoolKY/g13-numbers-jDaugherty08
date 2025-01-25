//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		System.out.println(test);
		System.out.println("odd count = "+test.countOdds());
		System.out.println("even count = "+test.countEvens());
		System.out.println("perfect count = "+test.countPerfects()+"\n\n");


		//add more test cases
		NumberAnalyzer test2 = new NumberAnalyzer("1 2 3 4 5 6 7 8");
		System.out.println(test2);
		System.out.println("odd count = "+test2.countOdds());
		System.out.println("even count = "+test2.countEvens());
		System.out.println("perfect count = "+test2.countPerfects()+"\n\n");

		NumberAnalyzer test3 = new NumberAnalyzer("36 15 59 92 18 64 73 85");
		System.out.println(test3);
		System.out.println("odd count = "+test3.countOdds());
		System.out.println("even count = "+test3.countEvens());
		System.out.println("perfect count = "+test3.countPerfects()+"\n\n");

		NumberAnalyzer test4 = new NumberAnalyzer("6 28 258 99 350 36 58 84");
		System.out.println(test4);
		System.out.println("odd count = "+test4.countOdds());
		System.out.println("even count = "+test4.countEvens());
		System.out.println("perfect count = "+test4.countPerfects()+"\n\n");
	}
}