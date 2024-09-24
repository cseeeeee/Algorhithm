import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iter = Integer.parseInt(br.readLine());
		StringBuilder res  = new StringBuilder();
		
		for(int i=0; i<iter; i++) {
			String[] input = br.readLine().split(" ");
			int num = Integer.parseInt(input[0]);
			String str = input[input.length -1];
			
			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j);
				res.append(String.valueOf(ch).repeat(num));
			}
			res.append("\n");
		}
		System.out.println(res.toString());
	}
}