package Assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 71;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	     
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println( num + " \n The given number is a prime number.");
	    else
	      System.out.println(num + " \n The given number is not a prime number.");

	}

}
