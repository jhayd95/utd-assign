package programs;

public class Rainfall {

	public static void main(String[] args) {
		
		double [] totalRain = { 1.5 ,2.4, 3.2, 1.2, 1.8, 2.3, 2.6, 3.9, 4.3, 1.2, 1.0, 3.3};

		//method call
		rainStats(totalRain);
	}
	
	public static void rainStats(double[] totalRain ) {
		//initialization of the variables with zero
		float average = 0;
		double total = 0;
		int minMonth = 0;
		int maxMonth = 0;
		
		double maxVal = totalRain[1];
		double minVal = totalRain[1];
		
		//for loop will run until month 12 is reached. calculates total amount of rain in year
		//the average amount of rain, and the highest and lowest amounts of rain.
		for(int i = 0; i < 12; ++i) {
		
		
		total = total + totalRain[i];
		average = (float) (total /12);
		
		if (totalRain[i] >maxVal ) {
			maxVal = totalRain[i];
		}
		
		if (totalRain[i] == maxVal) {
			 maxMonth = i+ 1;
		}
		
		if (totalRain[i] < minVal) {
			minVal = totalRain[i];
		}
		
		if (totalRain[i] == minVal) {
			minMonth = i + 1;
		}
		
		}
		System.out.println("Total Amount of Rain This Year: " + total);
		System.out.printf("Average amount of Rain : %.2f \n", average) ;
		System.out.println("Month with the highest amount of rain is " +
		maxMonth + " with " + maxVal + " inches");
		System.out.println("Month with the lowest amount of rain is " +
				minMonth + " with " + minVal + " inches");
		
	}

}
