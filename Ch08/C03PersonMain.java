package Ch08;

//import java.util.Scanner;

class C03Person {	//한 파일 안에 다른 클래스를 사용시 public 사용X
	//속성
	String name;
	int age;
	float height;
	double weight;	
	
	//기능	메서드의 이름은 어떤 기능을 하는지 잘 적어야한다
	//말하다
	void talk() {
		System.out.println(this.name + " 이 말합니다.");
	}
	//걷다
	void walk() {
		System.out.println(this.name + "이 걷습니다.");
	}
	//정보확인
	void showInfo() {
		System.out.printf("%s %d %f %f \n" , name, age, height, weight);
	}
	//정보확인  -  우클릭 - source - Generate toString()
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	

}

public class C03PersonMain {


public static void main(String[] args) {
	//기능
	C03Person hong = new C03Person();		// new 예약어 사용으로 heap 영역 사용 / hong은 heap 영역의 주소값을 받아옴
	hong.name = "홍길동";
	hong.age = 55;
	hong.height=177.5f;
	hong.weight= 70.4;
	hong.talk();
	hong.walk();
	hong.showInfo();
	System.out.println("------------------------------");
	System.out.println(hong); //Ch08.C03Person@17c68925
	//System.out.printf("%s %d %f %f \n", hong.name,hong.age,hong.height,hong.weight);

	

}

@Override
public String toString() {
	return "C03PersonMain []";
}
}
