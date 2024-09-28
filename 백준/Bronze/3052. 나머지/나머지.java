import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		
		for (int i=0; i<10; i++) {
			nums[i] = sc.nextInt() % 42;
		}

		Set<Integer> nums_set = new HashSet<Integer>();
		for(int i=0; i<10; i++) {
			nums_set.add(nums[i]);
		}
		System.out.println(nums_set.size());
	}
}
