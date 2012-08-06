import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String args[]) throws IOException {
		int t;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		StringTokenizer st;
		t = Integer.parseInt(input);
		
		for (int i=0; i<t; ++i) {
			String websites[][] = new String[10][2];
			int h = -1;
			for (int j=0; j<10; ++j) {
				st = new StringTokenizer(rd.readLine());
				websites[j][0] = st.nextToken();
				websites[j][1] = st.nextToken();
				if (Integer.parseInt(websites[j][1]) > h) {
					h = Integer.parseInt(websites[j][1]);
				}
			}
			
			System.out.println("Case #"+(i+1)+":");
			for (int j=0; j<10; ++j) {
				String s = "" + h;
				if (websites[j][1].equals(s)) {
					System.out.println(websites[j][0]);
				}
			}
		}
	}

}
