package Ch08;

//import java.util.Arrays;


class C07Simple{
	int sum(int ...arg) {	// 매개값의 수를 모를때 사용/ 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다.
		
		//System.out.println(arg);
		for(int num : arg) {
			System.out.println(num + " ");
		}
		return 0;
	}
	
	// 가변인자 VS 오버로딩
	// 공 : 함수이름을 같게 해서 여러 인자를 받을 수 있다. 
	// 차 :

	
}
public class C07Method가변인자 {
	
	public static void main(String[] args) {
		
		C07Simple obj = new C07Simple();
		obj.sum(10);
		System.out.println();
		obj.sum(11,22);
		System.out.println();
		obj.sum(13,23,34);
		System.out.println();
	}

}
