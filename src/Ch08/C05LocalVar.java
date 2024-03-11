package Ch08;


	// 멤버 변수

	// 지역 변수 : {} 내에서 선언되어지는 변수
	//		   : {} 에서 더이상 실행 로직이 없다면 공간 반환(없어진다..)  
	//		   : 변수명 중복시 좁은 지역의 변수가 적용
	//		   : 매개변수, 멤버변수, 일반변수
	// 전역 변수 : static 예약어 사용시





class C05Simple{
	int num=5;		//멤버변수
	void Func1() {
		System.out.println("멤버변수 num : " + num);
		int num=10;
		System.out.println("Func1 지역변수 num : " + num);
		System.out.println("this.num : " + this.num);		//멤버변수와 지역변수를 구분할 때 this 사용
	}
	void Func2() {
		System.out.println("멤버변수 num : " + num);
		if(true) {
			int num=22;
			System.out.println("if내의 지역 num : " + num);
		}
		System.out.println("멤버변수 num : " + num);
//		while(num<10) {
//			int num=5;	// 끝나는 시점에 없어지고 다시 생성 되서 무한 루프 ==> 6이 되어서 끝났지만 없어지고 다시 5
//			num++;
//		}
	}
	void Func3(int num) {
		System.out.println("num : " + this.num);
	}
	void Func4() {}
	
} 	// {} 사이는 하나의 영역
	
public class C05LocalVar {

	public static void main(String[] args) {
		C05Simple obj = new C05Simple();
		//obj.Func1();
		//obj.Func2();
		obj.Func3(100);
	}
}