package array;

public class Aufgabe2 {

	private static String[] sings1 = {"f", "Do", "MOS", "MOS", "MOS", "MOS", "WES"};
	private static String[] sings2 = {"f", "Do", "MOS", "MOS", "WES", "MOS", "MOS"};
	 
	public static void isProbablyApproaching(String[]signs) {
		int anz = 1;
		for(int i=1; i<signs.length; i++) {
			if(signs[i].equals(signs[i-1])) {
				anz++;
				
			}else {
				anz = 1;
				System.out.println("no ship is aproching");
			}
			if(anz >= 4 ) {
				System.out.println("this ship is aproching " + signs[i]);
				
			}
			
		}
	
	}
	
	public static boolean isProbablyApproaching2(String[]signs) {
		int anz = 1;
		for(int i=1; i<signs.length; i++) {
			if (anz<4) {
				if(signs[i].equals(signs[i-1])) {
					anz++;
				
				}else {
					anz = 1;
				}
			}else {
			return true;
		}
	}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		 System.out.println(isProbablyApproaching2(sings2));

	}

}
