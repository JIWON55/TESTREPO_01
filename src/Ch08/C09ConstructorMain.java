package Ch08;


// 클래스 선언시 생성자함수를 하나도 명시하지 않았을때는 디폴트 생성자가 주입이 되나
// 하나 이상의 생성자 함수가 명시되면 디폴트생성자는 주입되지 않는다.

class C09Simple{
	int num;
	// C09Simple(int num){this.num=num;} // 인자를 받는 생성자 = 모든 경우의 수를 받는 생성자를 만들어준다. 이때 인자를 받지않는 디폴트 생성자도 같이 생성
										 // = @AllArgsConstructor(모든) @NoArgsConstructor(아무것도 받지 않는)
}
public class C09ConstructorMain {

	public static void main(String[] args) {
		C09Simple ob = new C09Simple(); //인자를 받지않는 디폴트 생성자
		

	}

}
