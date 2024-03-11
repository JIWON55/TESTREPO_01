package Ch10;

class C04Person{
	String name;
	int age;
	
	public C04Person() {}
	
	public C04Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class C04ClassArrayMain {

	public static void main(String[] args) {
		C04Person list[] = new C04Person[3]; // 생성자 함수X heap영역에 참조변수를 요소로하는 배열을 만든 것. 참조할 값이 없어서 오류
		list[0] = new C04Person(); 	// 생성자 함수
		list[0].name="홍길동";
		list[0].age=55;
		
		list[0].name="김영희";
		list[0].age=35;
		
		list[0].name="김범수";
		list[0].age=40;
		
		for(C04Person obj : list) {
			System.out.println(obj);
		}

	}

}
