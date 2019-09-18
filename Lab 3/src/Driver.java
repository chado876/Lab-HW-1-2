
public class Driver {
	public static void main(String[] args ) {
		
		IterationMathLib iterationLibrary = new IterationMathLib();
		RecursiveMathLib recursionLibrary = new RecursiveMathLib();
		System.out.println("----Iteration----");
		runTestCode(iterationLibrary);
		System.out.println("----Recursion----");
		runTestCode(recursionLibrary);
		
	}
	
	
	public static void runTestCode(MathLib library) {
	System.out.println("GCD(4,2) = " + library.gcd(4, 2));
	//System.out.println("ACK(4,2) = " + library.ack(4, 2));
	System.out.println("Fib(4) = " + library.fib(4));
	System.out.println("Hanoi(4) = " + library.hanoi(4));
	
		/*for(int i=5;i>0;i--) {
			System.out.println("Hanoi("+i+") = " + library.hanoi(i));
		}*/
	}
	
}
