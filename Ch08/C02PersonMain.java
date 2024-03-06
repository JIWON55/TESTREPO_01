package Ch08;


class C02Person {	//한 파일 안에 다른 클래스를 사용시 public 사용X
		//속성
		String name;
		int age;
		float height;
		double weight;	
	
}
	
public class C02PersonMain {

	
	public static void main(String[] args) {
		//기능
		C01Person hong = new C01Person();		// new 예약어 사용으로 heap 영역 사용 / hong은 heap 영역의 주소값을 받아옴
		hong.name = "홍길동";
		hong.age = 55;
		hong.height=177.5f;
		hong.weight= 70.4;
		System.out.printf("%s %d %f %f \n", hong.name,hong.age,hong.height,hong.weight);

		

	}
}