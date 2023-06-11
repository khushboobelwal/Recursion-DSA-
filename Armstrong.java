public class Armstrong {
	static int rev=0;
	static int r;
	
	public static int reverse(int number) {
		
		
		if(number>0) {
	    r=number%10;
	    rev=rev+r*r*r;
		reverse(number/10);
	}	
		return rev;	
	}
	

	public static void main(String args[]) {
		int number=153;
		reverse(number);
		
		if(rev==number) {
			System.out.println("Armstrong");
			
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
	}
	
	


