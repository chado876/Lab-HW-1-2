
public class IterationMathLib extends MathLib{

	@Override
	public int gcd(int x, int y) {
		
		while(y != 0) {
			if(x>y && x!=0) {
				int temp = x;
				x = y;
				y = temp % y;
			}
		}
		return x;
	}
	
/*	public int ack(int x, int y) {
		if(x == 0) {
			return y + 1;
		}
		
		if(y== 0) {
			return ack(x - 1, 1);
		}
		
		return ack(x-1,ack(x,y-1));
	}
	*/
	
	public int fib(int x) {
		while(x >= 1 ) {
			if(x == 1) {
				return 1;
			}
			
			if(x > 1) {
				return fib(x-1) + fib(x-2);
			}
		}
		
		return 0;
	}
	
	public int hanoi(int n) {
		
		int y = 0;
		
		while(n>0) {
			if(n==1) {
			 y = 1;
			 return y;
			}
			
			else {
				y = 2 * (2 * n - 1) + 1;
				return y;
			}
			
		}
		
		return y;
		
	}
	
}
		

