package house;
public class Calculation {
		public double Costcal(char standard,double houseArea,char automated)
		{
			double hc=0;
			if(automated=='n')
			{
				if(standard=='s')
					hc=houseArea*1200;
				else if(standard=='a')
					hc=houseArea*1500;
				else if(standard=='h')
					hc=houseArea*1000;
			}
			else if(standard=='h' && automated=='y')
				hc=houseArea*2500;
		return hc;	
		}

}
