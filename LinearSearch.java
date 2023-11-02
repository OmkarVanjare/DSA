package DSA;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50,60,70,80,90,100};
		int target = 50;
		int ans = linearsearch(nums,target);
		System.out.println(ans);

	}
	static int linearsearch(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=0;index<arr.length;index++) {
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		return -1;
	}
}
