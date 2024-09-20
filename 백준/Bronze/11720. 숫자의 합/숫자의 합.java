import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int sum=0;
		String[] input = bf.readLine().split("");
		for(int i=0; i<num; i++) {
			sum += Integer.parseInt(input[i]);
		}
		System.out.println(sum);
	}
}
