import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String args[]) throws IOException {
		int n;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while ((input = rd.readLine()) != null) {
			n = Integer.parseInt(input);
			
			if (n == 0) {
				break;
			}
			
			int sum = getSum(n);
			while (sum >= 10) {
				sum = getSum(sum);
			}
			
			System.out.println(sum);
		}
	}
	
	private static int getSum (int n) {
		int sum = 0;
		int i;
		while (n > 0) {
			i = n % 10;
			sum += i;
			n /= 10;
		}
		
		return sum;
	}
}
