package DSA;

public class FindMin {

	public static void main(String[] args) {
		int num[]= {10,20,30,4,50,6,7};
		System.out.println(minimum(num));

	}
	static int minimum(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
		
	}

}
