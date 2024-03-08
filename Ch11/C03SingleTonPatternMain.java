package Ch11;

class Company{
	int n1;
	int n2;
	//싱글톤 패턴 코드	 객체를 여러개 만들지 않고 하는 만들어서 계속 사용하겠다
	private static Company instance;
	private Company() {}		// 객체생성 제한
	public static Company getInstance() {		//객체 생성은 여기서
		if(instance==null)
			instance = new Company();
		return instance;
	}
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
	
}


public class C03SingleTonPatternMain {

	public static void main(String[] args) {
		
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		com1.n1=100; com2.n2=200;
		
		System.out.println(com2);
	}

}
