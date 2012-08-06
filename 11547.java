import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String args[]) throws IOException {
		int t;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		
		t = Integer.parseInt(input);
		
		int n;
		for (int i=0; i<t; ++i) {
			n = Integer.parseInt(rd.readLine());
			n *= 567;
			n /= 9;
			n += 7492;
			n *= 235;
			n /= 47;
			n -= 498;
			
			n /= 10;
			n %= 10;
			if (n < 0)
				n *= -1;
			
			System.out.println(n);
		}
	}

}
