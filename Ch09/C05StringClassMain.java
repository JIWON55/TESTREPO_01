package Ch09;

public class C05StringClassMain {

	public static void main(String[] args) {
		
		String str1 = "java"; 
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println("str1==str2 ? " + (str1==str2));		// str1 과 str2는 같은 주소값을 받는다
		System.out.println("str3==str4 ? " + (str3==str4));		// 각각 다른 heap영역에 주소값을 따로 관리
		System.out.println("str1==str3 ? " + (str1==str3));
		System.out.println("str2==str4 ? " + (str2==str4));
		System.out.println("===========================");
		System.out.println("str1==str2 ? " + (str1.equals(str2)));		// str1 과 str2는 같은 주소값을 받는다
		System.out.println("str3==str4 ? " + (str3.equals(str4)));		// 각각 다른 heap영역에 주소값을 따로 관리
		System.out.println("str1==str3 ? " + (str1.equals(str3)));
		System.out.println("str2==str4 ? " + (str2.equals(str4)));
		
	}

}
