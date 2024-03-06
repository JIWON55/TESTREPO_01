package Ch08;

class C06Simple{
	
	int sum(int x, int y) {		// 함수의 이름은 동일하게 두고 다양한 매개변수를 받는다 
		System.out.println("int sum(int x, int y)");
		return x + y; 
	}
	int sum(int x, int y, int z) {		// 함수의 이름은 동일하게 두고 다향한 매개변수를 받는다 
		System.out.println("int sum(int x, int y,  int z)");
		return x + y + z; 
	}
	int sum(double x, double y, double z) {		// 함수의 이름은 동일하게 두고 다양한 매개변수를 받는다 
												// 반환 자료형을 다양하게 두는 것도 오버로딩? 함수의 반환타입은 오버로딩에서 고려되지 않는다
												//함수를 찾아낼때 함수명과 매개변수의 형태로 구별을 한다
		System.out.println("int sum(double x, double y,  double z)");
		return (int) (x + y + z); 
	} // => 오버로딩 X 다른 함수가 만들어진 것
}

public class C06MethodOverloading {

	public static void main(String[] args) {
		C06Simple obj = new C06Simple();
		obj.sum(10,20);
		obj.sum(10,20,30);
	}

}
