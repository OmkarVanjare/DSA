package DSA;

import java.util.Arrays;

public class Searchin2D {

	public static void main(String[] args) {
		int num[][]= {
				{1,2,3,4,5},
				{6,8,7,9},
				{10,51,66,77},
				{5,6,3,8}
		};
		int target = 7;
		int[] ans = search2(num, target);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
//		System.out.println(Arrays.toString(ans));
		
	}
	static int[] search2(int arr[][],int t) {
		for(int i=0;i< arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int element = arr[i][j];
				if(element == t) {
					return new int[]{i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
}
