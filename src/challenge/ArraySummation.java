package challenge;

public class ArraySummation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Summation
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int nums: num) {
			sum+=nums;
		}
		System.out.println(sum);
	}

}
