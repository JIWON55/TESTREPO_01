package Ch11;


// Stack = {} 이하 임시영역 참조/지역변수가 있는 영역
// Heap = 객체저장 영역
// Class[Method] = 공유영역 










class C01Simple{
	static int num1;  
	// C01Simple 개체간 공유되는 변수
	// 객체 생성과 무관하게 메모리공간 할당
	// 클래스명으로 접근가능
	// 가급적 사용빈도수 낮추기
	
	int num2;
	
	
	C01Simple(){
		this.num1 = 0;
		this.num2 = 0;
	}

	@Override
	public String toString() {
		return "C01Simple [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
}

public class C01StaticMain {

	public static void main(String[] args) {
		
		C01Simple.num1 = 100;
		System.out.println(C01Simple.num1);
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
		ob2.num1 = 30; ob2.num2 = 40;
//		ob1.num1 = 10; ob1.num2 =20;
		System.out.println(ob1);
		System.out.println(ob2);
//		ob2.num1 = 30; ob2.num2 =40;
//		System.out.println();
//		System.out.println(ob1);
//		System.out.println(ob2);
	}

}
