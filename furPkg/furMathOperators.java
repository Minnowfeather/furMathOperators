package furPkg;
public class furMathOperators
{
	
	public static double limit(furExpression input, double approach)
	{
		return 0;
	}

	public static double sqrt(double x)
	{
		double si = 1;
		double sf = si;
		
		while(true)
		{
			si = avg(si,(x/si));
			if(abs((sf*sf)-(si*si)) > 0.0000001){
				break;
			}
			sf = si;
		}
		return si;

	}

	public static double abs(double x)
	{
		if(x < 0)
		{
			x -= (2*x);
			
		}
		return x;
	}
	
	public static double avg(double... x)
	{
		double average = 0;
		for(int i = 0; i < x.length; i++){
			average += x[i];
		}
		return average/x.length;
	}

	public static double exponent(double x, int n)
	{
		double output = 1;
		System.out.println("exponent: " + abs(n));
		for(int i = 0; i < abs(n); i++){
			output *= x;
		}
		if(n < 0){
			return (1/output);
		}
		return output;
	}
}