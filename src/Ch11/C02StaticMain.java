package Ch11;

class C02Simple{
	int n1;				//객체생성을 해야 만들어지는 공간
	static int n2;		//객체생성 이전에 만들어진 공간
	
	void func1() {
		n1=10;
		n2=20;
		
	}
	static void func2() {		//객체 생성 이전에 사용가능
		//n1=400;
		n2=30;
	}
}


public class C02StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
