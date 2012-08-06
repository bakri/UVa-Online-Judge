import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String args[]) throws IOException {
		int t;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		StringTokenizer st;
		t = Integer.parseInt(input);
		
		for (int i=0; i<t; ++i) {
			int noOfWalls = Integer.parseInt(rd.readLine());
			input = rd.readLine();
			
			st = new StringTokenizer(input);
			int h = Integer.parseInt(st.nextToken());
			int high = 0, low = 0;
			int hnext;
			for (int j=1; j<noOfWalls; ++j) {
				hnext = Integer.parseInt(st.nextToken());
				if (hnext > h)
					++high;
				else if (hnext < h)
					++low;
				h = hnext;
			}
			
			System.out.println("Case " + (i+1) + ": " + high + " " + low);
		}
	}

}
