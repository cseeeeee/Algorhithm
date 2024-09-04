import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String first=bf.readLine();
		int a= Integer.parseInt(first);
	
		String second= bf.readLine();
		int b=Integer.parseInt(second);
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}