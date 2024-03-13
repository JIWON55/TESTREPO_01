package Ch14;

class C02Simple{
	int n;
	C02Simple(int n){
		this.n = n;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple)obj;
			return this.n == down.n;
		}
		
		return false;
	}
	
}

public class C02ObjectEquals {

	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		C02Simple ob3 = new C02Simple(10);
		
		ob1.equals(ob3);		// 재정의하지않고 사용할 경우 참조변수간 비교
								// ob1의 주소와 ob3의 주소 비교
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		System.out.println(str1.equals(str2));
	}

}
