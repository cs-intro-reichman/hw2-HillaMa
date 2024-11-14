// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean isFirstSequence = true;
		int curNum = 1;
		int counter = 1;
		if(mode.equals("c")) {
			System.out.println("Every one of the first "+ N + " halistone sequences reached 1");
		}
		else {
			for(int i = 1 ; i <= N ; i++) {
				while(curNum != 1 || isFirstSequence) {
					if(isFirstSequence){
						isFirstSequence = false;
					}
					if(curNum % 2 == 0) {
						System.out.print(curNum + " ");
						curNum = curNum / 2;
					}
					else {
						System.out.print(curNum + " ");
						curNum = curNum * 3 + 1;
					}
					counter++;
				}
				System.out.println(curNum + " (" + counter + ")");
				curNum = i + 1;
				counter = 1;
			}
			System.out.println();
			System.out.println("Every one of the first "+ N + " halistone sequences reached 1");
		}
	}
}
