/***********************
 *
 *   CarWorthSrv - contains a method to calculate the worth of a car
 *
 *   Author: Corey Caldwell 
 *   Date:     16-Feb-29
 *
 ***********************/

 public class CarWorthSrv {

	public int carWorth (int year, int initVal, int mileage)
	{
		double miles = mileage / 1.0;
		int valAfterPurchase = initVal - 1000;
		final int CURRENT_YEAR = 2016;
		int yearsOld = CURRENT_YEAR - year;
		if(yearsOld == 0){
			if((miles) > 12000){
				valAfterPurchase -= yearsOld * 1550;
			}
			else if((miles) < 10000){
				valAfterPurchase -= yearsOld * 1320;
			}
			else{
				valAfterPurchase -= yearsOld * 1400;
			}
			if(valAfterPurchase < 0){
				valAfterPurchase = 0;
			}
		}
		else{
			if((miles/yearsOld) > 12000){
				valAfterPurchase -= yearsOld * 1550;
			}
			else if((miles/yearsOld) < 10000){
				valAfterPurchase -= yearsOld * 1320;
			}
			else{
				valAfterPurchase -= yearsOld * 1400;
			}
			
			if(valAfterPurchase < 0){
				valAfterPurchase = 0;
			}
		}
		return valAfterPurchase;
	}
	
 }
