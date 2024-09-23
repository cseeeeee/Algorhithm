import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] str_nums = br.readLine().split(" ");
		int[] nums= new int[str_nums.length];
		
		for(int i=0; i<num; i++) {
			nums[i] = Integer.parseInt(str_nums[i]);
		}
		
		int max=nums[0];
		int min=nums[0];
		
		for(int i=0; i<num; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		
		System.out.print(min+" "+max);
	}
}