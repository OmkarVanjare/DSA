package DSA;

public class MaxWealth {

	public static void main(String[] args) {
		int arr[][]= {{1,5},{7,3},{3,5}};
		System.out.println(maxwealth(arr));
	}

	static int maxwealth(int arr[][]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum = sum + arr[i][j];
			}
			if(sum>max) {
				max = sum;
			}
		}
		return max;
	}
}
