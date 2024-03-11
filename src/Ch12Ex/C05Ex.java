package Ch12Ex;

abstract class OddDetector{
	protected int n;
	public OddDetector (int n) {
		this.n = n;
		
	} 
	public abstract boolean isOdd(); // 홀수이면 true 리턴

}
public class B extends OddDetector{
	public B(int n) {
		super(n);
	}
	
	@Override
	public boolean isOdd() {
		if(n%2 == 0)
			return false;
		else
			return true;
	}
}


public class C05Ex {

	public static void main(String[] args) {
		B b = new B(10);
		System.out.println(b.isOdd());
	}

}
