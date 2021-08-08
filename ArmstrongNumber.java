package Assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 153, temp, remainder, result = 0;

        temp = n;

        while (temp != 0)
        {
            remainder = temp % 10;
            result += Math.pow(remainder, 3);
            temp /= 10;
        }

        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");

	}

}
