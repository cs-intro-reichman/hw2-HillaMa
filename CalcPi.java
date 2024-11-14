// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt(args[0]);
		double approximated = 1;
		int i = 1;
		int curIndex = 1;
		while(curIndex < numOfTerms) { 
			curIndex ++;
			if(curIndex % 2 == 0) {
				i = i + 2;
				approximated = approximated - (double) 1 / i;
			}
			else {
				i = i + 2;
				approximated = approximated + (double) 1 / i;
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + approximated * 4);
	}
}
