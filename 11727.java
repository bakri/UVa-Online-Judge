import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String args[]) throws IOException {
		int t;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		StringTokenizer st;
		t = Integer.parseInt(input);
		
		int salary[] = new int[3];
		for (int i=0; i<t; ++i) {
			st = new StringTokenizer(rd.readLine());
			salary[0] = Integer.parseInt(st.nextToken());
			salary[1] = Integer.parseInt(st.nextToken());
			salary[2] = Integer.parseInt(st.nextToken());
			Arrays.sort(salary);
			
			System.out.println("Case " + (i+1) +": " + salary[1]);
		}
	}

}
