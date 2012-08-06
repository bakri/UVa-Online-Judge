import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

	public static void main(String args[]) throws IOException {
		int t;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		StringTokenizer st;
		t = Integer.parseInt(input);
		
		System.out.println("Lumberjacks:");
		for (int i=0; i<t; ++i) {
			input = rd.readLine();
			
			st = new StringTokenizer(input);
			ArrayList<Integer> beards = new ArrayList<Integer>();
			while (st.hasMoreTokens()) {
				beards.add(Integer.parseInt(st.nextToken()));
			}
			
			int start = beards.get(0);
			int next = -1, pos = -1;
			boolean ordered = true;
			for (int j=1; j<beards.size(); ++j) {
				if (beards.get(j) != start) {
					next = beards.get(j);
					pos = j;
					break;
				}
			}
			
			if (next != -1 && start > next) {
				for (int j=pos; j<beards.size(); ++j) {
					if (next < beards.get(j)) {
						ordered = false;
						break;
					}
					next = beards.get(j);
				}
			}
			else if (next != -1 && start < next) {
				for (int j=pos; j<beards.size(); ++j) {
					if (next > beards.get(j)) {
						ordered = false;
						break;
					}
					next = beards.get(j);
				}
			}
			
			if (ordered) {
				System.out.println("Ordered");
			}
			else
				System.out.println("Unordered");
		}
	}

}
