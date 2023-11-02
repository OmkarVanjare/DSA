package DSA;

public class Maxin2D {

	public static void main(String[] args) {
		int num[][]= {
				{1,2,3,4,5},
				{6,8,7,9},
				{10,51,66,77},
				{5,6,3,8}
		};
		
		System.out.println(max(num));
		
	}
	static int max(int arr[][]) {
		int max = arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
					
				}
			}
		}
		return max;
		
	}

}
