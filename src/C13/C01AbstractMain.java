package C13;

//정의되지않고 선언만 한 메서드 : 선언부만 작성 ex)void ShowInfo();
//추상클래스는 미완성형이므로 객체생성 불가능

class Super1{
	void Func() {};
}

class Son1 extends Super1{
	void Func() {System.out.println("Son1's Function()");}
	
}

//추상클래스 상속관계

abstract class Super2{
	abstract void Func();
}
class Son2 extends Super2{

	@Override
	void Func() {
		System.out.println("Son2's Function()");
		
		
	}
	
}

public class C01AbstractMain {

	public static void main(String[] args) {
		//01
//		Super1 ob1 = new Super1(); //상위클래스 객체 생성 O
//		Son1 ob2 = new Son1();		// 하위클래스 객체 생성 O
//		ob1.Func();					// 상위클래스에서 하위클래스가 추가한 메서드 접근 X
//									// 상위클래스에서 정의한 메서드를 하위클래스에서 재정의한 경우 접근 O
//		Super1 ob3 = ob2; 			// UpCasting
//		ob3.Func();
		
		
		//02
//		Super2 ob1 = new Super2();		// X 
		Son2 ob2 = new Son2();			// O
		
		Super2 ob3 = ob2;				// UpCasting O
		ob3.Func();
	}

}
