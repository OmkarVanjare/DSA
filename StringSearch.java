package DSA;

public class StringSearch {

	public static void main(String[] args) {
		
		String name = "Omkar";
		char target = 'p';
		boolean ans = search(name,target);
		System.out.println(ans);

	}
static boolean search(String s,char target) {
	if(s.length()==0) {
		return false;
	}
	for(int i=0;i<s.length();i++) {
		if(target==s.charAt(i)) {
			return true;
		}
	}
	
	return false;
	
}
}
