import furPkg.*;
public class test
{
	
	public static void main(String[] args)
	{
		/* furMathOperators */
		// Average test
		// System.out.println("" + furMathOperators.avg(10, 50));

		// Absolute value test
		// System.out.println("" + furMathOperators.abs(-50));
		// System.out.println("" + furMathOperators.abs(50));
		// System.out.println("" + furMathOperators.abs(0));
		
		// Exponent test
		// System.out.println("" + furMathOperators.exponent(5, 4));
		// System.out.println("" + furMathOperators.exponent(2, -3));
		// System.out.println("" + furMathOperators.exponent(0, 5));
		
		
		/* furExpression */
		furExpression exp = new furExpression(1,2,4);

		// Evaluate test
		System.out.println("" + exp.evaluate(3));
	}
	
}