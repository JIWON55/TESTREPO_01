package Ch08;

public class C01Main {

	public static void main(String[] args) {		// main 메서드 : 최초로 실행되는 메서드 다른 클래스에서 만든 객체 이용 {} stack 영역 메모리 사용
			C01Person hong = new C01Person();		// new 예약어 사용으로 heap 영역 사용 / hong은 heap 영역의 주소값을 받아옴
			hong.name = "홍길동";
			hong.age = 55;
			hong.height=177.5f;
			hong.weight= 70.4;
			System.out.printf("%s %d %f %f \n", hong.name,hong.age,hong.height,hong.weight);
		
	}

}
