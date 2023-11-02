package DSA;

public class SearchInRange {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50,60,70,80,90,100};
		int target = 50;
		System.out.println(rangesearch(array, target, 1, 4));

	}
	
	static int rangesearch(int arr[],int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=start;i<=end;i++) {
			int element = arr[i];
			if(element==target) {
				return i;
			}
		}
		return -1;
	}

}
