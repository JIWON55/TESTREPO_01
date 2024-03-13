package Ch14;

class A{
	int x;
	int y;
	
	
	@Override
	public String toString() {
		return "x="+x+" y="+y;
	}
	
	
	
	
}

public class C01ObjectMain {

	public static void main(String[] args) {

	Object ob = new Object();
	//ob.toString()		//object로부터 재정의를 받음
	
	System.out.println(ob);
	System.out.println(ob.toString());
	
	A ob2 = new A();
	
	
	System.out.println(ob2);
	System.out.println(ob2.toString()); //object로 부터 물려받은 toStign 재정의가능

	
	}
	

}
