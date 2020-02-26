package interest;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Maain {
	private static final Logger LOGGER = LogManager.getLogger(Maain.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caluculation c=new Caluculation();
		Scanner s = new Scanner(System.in);
		LOGGER.info("enter the principal,rate of interest and time");
		double principal=s.nextInt();
		double rateOfInterest=s.nextInt();
		double time=s.nextInt();
		double sInterest=c.simpleInterest(principal,rateOfInterest,time);
		double cInterest=c.compoundInterest(principal,rateOfInterest,time);
		LOGGER.info("Simple Interest is"+sInterest+"\nCompound Interest is"+cInterest);
		s.close();
	}

}
