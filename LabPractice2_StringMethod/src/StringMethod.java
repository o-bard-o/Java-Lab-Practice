
public class StringMethod {
	static String addString(String s1, int index, String s2) {
		return (s1.substring(0, index+1).concat(s2)).concat(s1.substring(index+1));
	}
	static String reverse(String s) {
		return new StringBuffer(s).reverse().toString();
	}
	static String removeString (String s1, String s2) {
		String a[]=s1.split(s2);
		for(int i=1;i<a.length;i++) {
			a[0]=a[0].concat(a[i]);
		}
		return a[0];
	}
	public static void main(String[] args) {
		System.out.println(addString("0123456",3,"-"));
		System.out.println(reverse("abc"));
		System.out.println(removeString("01001000","00"));
	}
}
