import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int hour1=Integer.parseInt(st.nextToken());
		int minute1=Integer.parseInt(st.nextToken());
		
		int minute2;
		int hour2;
		if(minute1 >= 45) {
			minute2 = minute1-45;
			hour2 = hour1;
			if(hour2 < 0) {
				hour2 = 23;
			}
		}else {
			minute2 = minute1-45+60;
			hour2 = hour1 -1;
			if(hour2<0) {
				hour2 = 23;
			}
		}
		
		System.out.println(hour2+" "+minute2);
	}
}