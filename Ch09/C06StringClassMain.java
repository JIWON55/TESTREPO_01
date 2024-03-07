package Ch09;

import java.util.Scanner;

import Ch01.C02SystemOut;

public class C06StringClassMain {

	public static void main(String[] args) {
		String str1 = "Java Powerful";
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		
		//문자열 덧붙이는 작업반복 (StringBuffer, StringBuilder)
		StringBuffer str5 = new StringBuffer();
		System.out.println("======================");
		System.out.printf("%x\n", System.identityHashCode(str5));
		str5.append(str1).append(str2).append(str3).append(str4);
		System.out.printf("%x\n", System.identityHashCode(str5));
		System.out.println("======================");
		
		//문자열 확인
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//위치확인
		System.out.printf("%x\n", System.identityHashCode(str1));	//새로운 메모리공간 사용
		System.out.printf("%x\n", System.identityHashCode(str2));	
		System.out.printf("%x\n", System.identityHashCode(str3));
		System.out.printf("%x\n", System.identityHashCode(str4));
		//
		System.out.println("---------------------------------");
		System.out.println("문자열길이 : " + (str1.length()));
		System.out.println("문자열길이 : " + (str1.charAt(1)));
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.next().charAt(0); // 공백을 포함하지 않는 문자열을 받아서 한 문자 뽑아내기
		System.out.println("문자찾기 : " +(str1.indexOf("a"))); //p가 시작하는 index
		System.out.println("문자찾기 : " +(str1.lastIndexOf("Po"))); 
		
		System.out.println("문자포함여부 : " + (str1.contains("va")));
		System.out.println("문자포함여부 : " + (str1.contains("abs")));
		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		System.out.println(tmp.length());	// 공백 포함 길이
//		System.out.println(tmp.trim().length());	// 공백제거 길이
		
		
		System.out.println("문자열자르기 : " + (str1.substring(2,6)));  // 잘라낼 문자의 시작 인덱스와 끝 인덱스
		
		String str6 = "홍길동,남길동,서길동,동길동,길동길동";
		str6.split(",");	// 받은 문자를 기준으로 잘라서 배열형태로
		String[] result = str6.split(",");
		for(String val : result) {
			System.out.println(val);
		}
	
	}

}
