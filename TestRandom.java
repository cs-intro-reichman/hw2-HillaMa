// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int N = Integer.parseInt(args[0]);
		int greaterThanHalf = 0;
		int lessThanHalf = 0;
		while(N > 0) {
			double randomNum = Math.random();
			if(randomNum > 0.5) {
				greaterThanHalf++;
				N--;
			}
			else {
				lessThanHalf++;
				N--;
			}
		}
		System.out.println("> 0.5: " + greaterThanHalf);
		System.out.println("<= 0.5: " + lessThanHalf);
		System.out.println("Ratio: " + (double)greaterThanHalf / lessThanHalf);
	}
}
