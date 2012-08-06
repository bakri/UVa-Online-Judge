import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String args[]) throws IOException {
		int n;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input;
		while ((input = rd.readLine()) != null) {
			n = Integer.parseInt(input);
			
			if (n == 0) {
				break;
			}
			
			int cx, cy, x, y;
			st = new StringTokenizer(rd.readLine());
			cx = Integer.parseInt(st.nextToken());
			cy = Integer.parseInt(st.nextToken());
			
			for (int i=0; i<n; ++i) {
				st = new StringTokenizer(rd.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				System.out.println(getRegion(cx, cy, x, y));
			}
		}
	}
	
	public static String getRegion(int cx, int cy, int x, int y) {
		
		// on border
		if (x == cx || y == cy) {
			return "divisa";
		}
		
		// on right
		if (x > cx) {
			if (y > cy) {
				return "NE";
			}
			else {
				return "SE";
			}
		} else {
			
			//on left
			if (y > cy) {
				return "NO";
			}
			else
				return "SO";
		}
	}
}
