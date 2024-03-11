package Ch12Ex;

class Employee{
	String name;
	private int age;
	private String addr;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
}
class Parttimer extends Employee{
	private int hour_pay;
	
}
class Regular extends Employee{
	private int salary;
}
public class C02Ex {

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동",25,"대구",20000);
		Regular emp2 = new Regular("서길동",45,"울산",50000000);
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
