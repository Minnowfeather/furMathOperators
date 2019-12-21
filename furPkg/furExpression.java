package furPkg;
public class furExpression
{
	private double[] expression;
	public furExpression(double... x)
	{
		expression = x;
	}

	public double evaluate(double input)
	{
		double output = 0;
		int iterator = 0;
		for(int i = expression.length-1; i >= 0; i--)
		{
			output += (expression[iterator] * furMathOperators.exponent(input, i));
			iterator++;
		}
		return output;
	}


}