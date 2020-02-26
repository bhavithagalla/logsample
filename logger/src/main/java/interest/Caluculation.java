package interest;

public class Caluculation
	{
	public double simpleInterest(double principal,double rateOfInterest,double time)
	{
		double intrst;
		intrst=principal*Math.pow((1+rateOfInterest/100),time);
		return intrst;
	}
	public double compoundInterest(double principal,double rateOfInterest,double time)
	{
		double intrst;
		intrst=(principal*rateOfInterest*time/100);
		return intrst;
		
	}

}
