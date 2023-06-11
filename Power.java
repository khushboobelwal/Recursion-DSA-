public class Power {
	static int pow(int number,int power ) {
		if(power==0) {
			return 1;
		}
		else 
		{
			return number*pow(number,power-1);
		}
	}

	public static void main(String[] args) {
		int number=2;
		int power=4;
		System.out.println(pow(number,power));
		// TODO Auto-generated method stub

	}

}
