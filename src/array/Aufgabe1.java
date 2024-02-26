package array;

public class Aufgabe1 {

	
	private static int[] dailyGains = {1000, 2000, 500, 9000, 9010};
	
	public static int count5PercentJumps(int[] dailyGains) {
		int  anz = 0;
		for(int i=1; i < dailyGains.length; i++) {
			if(dailyGains[i]-dailyGains[i-1] >= dailyGains[i-1]*0.05) {
				anz++;
			}
		}
		return anz;
	}
	public static void main(String[] args) {
		System.out.println("anzahl = " + count5PercentJumps(dailyGains));

	}

}
