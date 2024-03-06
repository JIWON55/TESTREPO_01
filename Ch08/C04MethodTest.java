package Ch08;

import java.util.Scanner;

class Sum{
	//속성
	public Scanner sc = new Scanner(System.in);		//참조변수 - scanner 객체의 주소값 받아온다
	//기능
	public int sum1(int n1,int n2) {return n1 + n2;} 		//함수 헤더 = 설명서 , 바디 = 로직 구현
	public int sum2() {return sc.nextInt() + sc.nextInt();}
	public void sum3(int n1, int n2) {System.out.println(n1+n2);}
	public void sum4() {System.out.println(sc.nextInt() + sc.nextInt());}
}

public class C04MethodTest {

	public static void main(String[] args) {
		Sum sumCalc = new Sum();	// 객체의 주소값을 받아온다
		System.out.println(sumCalc.sum1(10,20));
		System.out.println(sumCalc.sum2());
		sumCalc.sum3(10,20);
		sumCalc.sum4();
		
	}

}
