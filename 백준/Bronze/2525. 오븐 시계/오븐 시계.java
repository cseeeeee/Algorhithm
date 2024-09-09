import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input= bf.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int startHour = Integer.parseInt(st.nextToken());
		int startMinutes = Integer.parseInt(st.nextToken());
		
		String input2 = bf.readLine();
		int cookMinutes = Integer.parseInt(input2);
		
		int plusHour = cookMinutes / 60;
		int plusMinutes = cookMinutes % 60;
		
		int resHour = startHour + plusHour + ((startMinutes + plusMinutes) / 60);
		int resMinutes = (startMinutes + plusMinutes) % 60;
		
		if(resHour >= 24) {
			resHour = resHour - 24;
		}
		System.out.println(resHour+" "+resMinutes);	
		
	}
}
