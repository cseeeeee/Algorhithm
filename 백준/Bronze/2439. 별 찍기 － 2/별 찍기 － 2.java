import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		for(int i=1; i<number+1; i++) {
			System.out.println(" ".repeat(number-i)+"*".repeat(i));
		}
	}
}