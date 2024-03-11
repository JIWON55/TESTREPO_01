package Ch08;

// new (예약어) : 클래스라는 자료형을 대상으로 heap이라는 메모리 영역을 쓰겠다는 예약어
// 생성자 메서드? 객체를 생성하는 것 , 만들어진 객체 내에서 계속 사용할 수 없음
// 객체 생성시에 한번 호출되는 특수한 형태의 메서드
// 객체 생성시에 1회 호출
// 생성된 객체 내에서는 사용이 불가
// 객체 생성시에 필요한 메모리공간형성과 초기값 부여에 사용
// 생성자 함수는 클래스명과 동일하며 반환자료형을 가지지 않는다.
// 생성자 함수를 클래스 내에 명시하지 않으면 컴파일러에 의해 주입되는 생성자가 있는데 이름 디폴트 생성자라고 한다.
// 디폴트 생성자는 모든 멤버변수의 초기값을 0(or false or null) 지정

class C08Simple{
	//속성
	int n1;
	double n2;
	boolean n3;
	String n4;
	
	//기능(생성자)
	C08Simple(){
		System.out.println("C08Simple() 호출!");
		this.n1=100;
		this.n2=200.2;
		this.n3=true;
		this.n4="HI";
	}
	
	//생성자에 오버로딩 : 생성자에 들어오는 초기값을 외부로부터 받아와서 다양하게 둘 수 있다. 
	C08Simple(int n1){
		System.out.println("C08Simple(int n1) 호출!");
		this.n1=n1;
	}
	C08Simple(int n1,double n2){
		System.out.println("C08Simple(int n1,doubl n2) 호출!");
		this.n1 = n1;
		this.n2 = n2;
	
	}
	C08Simple(int n1, double n2, boolean n3){
		System.out.println("C08Simple(int n1, double n2, boolean n3) 호출!");
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	//builder 패턴
	//여러가지 값들의 대한 패턴을 받아낼 수 있다.
	public C08Simple(int n1, double n2, boolean n3, String n4) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
	
	
}
public class C08ConstructorMain {

	public static void main(String[] args) {
		C08Simple ob = new C08Simple();			//디폴트 생성자
		System.out.printf("%d %f %b %s \n", ob.n1,ob.n2,ob.n3,ob.n4);
		C08Simple ob2 = new C08Simple(111);
		C08Simple ob3 = new C08Simple(111,222.3);
		C08Simple ob4 = new C08Simple(111,222.3,false);
		
	}

}
