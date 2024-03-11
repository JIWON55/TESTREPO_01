package Ch12;

//casting : 형변환
//UpCasting : 부모 클래스로 형변환(자동형변환)
//DownCasting : 자식 클래스로 형변환
class Super{
	int  n1;
}

class Sub extends Super{
	int n2;
}


public class C04UpDownCastingMain {

	public static void main(String[] args) {
		//NoCasting
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1=10;
		ob2.n2=20;
		
		//UpCasting : 상위클래스의 참조변수로 하위클래스객체 연결
		//UpCasting은 상위클래스형으로 형변환을 하는 문범
		//UpCasting은 자동형변환이 된다
		Super ob3 = new Sub();
		ob3.n1 = 100;
//		ob3.n2 = 200; //상위클래스 참조변수는 확장된 하위클래스객체에 접근 불가능하다
		
		
		//DownCasting : 하위클래스 참조변수 = 상위클래스형객체 UpCastig이 전제 
		//DownCasting은 하위클래스형으로 형변환을 시도하는 문법
		//DownCasting은 강제형변환을 한다
		
		
//		Sub ob4 = ob3;  // 다른 메모리영역을 침범할 수 있다
		Sub ob4 = (Sub)ob3;		//강제 형변환
//		Sub ob4 = (Sub)new Super();
		ob4.n1=100;
		ob4.n2=200;
	}

}
