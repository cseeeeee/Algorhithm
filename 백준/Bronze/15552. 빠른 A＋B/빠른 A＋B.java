import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		
		for(int i=0; i<number; i++) {
			String input= br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			String res = String.valueOf(a+b);
			bw.write(res+"\n");
			
		}
		bw.flush();
	}
}