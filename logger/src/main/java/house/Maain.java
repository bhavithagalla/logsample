package house;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Maain {
private static final Logger LOGGER = LogManager.getLogger(Maain.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c=new Calculation();
		Scanner s=new Scanner(System.in);
		LOGGER.info("enter housearea,material standard,automated status");
		char standard=s.next().charAt(0);
		double houseArea=s.nextInt();
		char automated=s.next().charAt(0);
		double result =c.Costcal(standard,houseArea,automated);
		LOGGER.info("House Construction Cost is:"+result);
		s.close();

	}

}
