import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bf.readLine().split(" ");
		String[] a = bf.readLine().split(" ");
		
		for(int i=0; i<Integer.parseInt(input[0]); i++) {
			if(Integer.parseInt(a[i]) < Integer.parseInt(input[1])) {
				System.out.printf(Integer.parseInt(a[i])+" ");
			}
		}
	}
}