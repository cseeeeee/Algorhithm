import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int max= 0;
		int num =-1;
		int[] nums = new int[9];
		for(int i=0; i<9; i++) {
			// 스캔 받은 자연수들을 배열에 넣
			nums[i] = sc.nextInt();
			
			// nums[i]가 max보다 크다면 그때의 인덱스 저장하고 max 값 바꾸기
			if(nums[i] > max) {
				num = i+1;
				// 새로 들어온 nums[i]와 max중 max를 찾음
				max = Math.max(max, nums[i]);
			}
		}
		System.out.println(max);
		System.out.println(num);
	}
}