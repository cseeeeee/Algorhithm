import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int res;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(a==b&& b==c && c==a) {
			res= 10000 + a*1000;
		}else if((a==b) || (a==c) || (b==c)) {
			if(a==b) {
				res= 1000 + a*100;
			}else if(b==c) {
				res = 1000 + b*100;
			}else {
				res = 1000 + c*100;
			}
		}else {
			int max = Math.max(Math.max(a, b), c);
			res = max*100;
		}
		
		System.out.println(res);
	}
}