package DSA;

public class EvenNumberDigit {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		int count = findNumbers(nums);
		System.out.println(count);
		
	}
	static int findNumbers(int[] arr) {
		int count=0;
		
		for(int num : arr) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	
	static boolean even(int num) {
		
		int n = digits(num);
		if(n%2==0) {
			return true;
		}
		return false;
	}
	static int digits(int n) {
		if(n<0) {
			n = n * -1;
		}
		return (int)(Math.log10(n))+1;
//		int count =0;
//		while(n>0) {
//			count ++;
//			n = n/10;
//		}
//		return count;
	}
}
