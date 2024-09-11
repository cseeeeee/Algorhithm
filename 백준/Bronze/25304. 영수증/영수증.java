import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int totalPrice;
	public static int sum;
	public static String res;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalPrice = Integer.parseInt(br.readLine());
		int totalNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<totalNum; i++) {
			String input=br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int price = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			sum += (price * num);
		}
		res = (sum == totalPrice) ? "Yes": "No";
		System.out.println(res);
	}
}