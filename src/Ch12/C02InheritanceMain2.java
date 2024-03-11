package Ch12;

class Point2D{ 
	int x;
	int y;
	
	Point2D(){
		System.out.println("Point2D() 생성자 호출!");

	}
	Point2D(int x){
		this.x = x;
		System.out.println("Point2D(int x) 생성자 호출!");

	}
	Point2D(int x, int y){
		this.x=x; this.y=y;
		System.out.println("Point2D(int x, int y) 생성자 호출!");

	}
	@Override
	public String toString() {
		return "point2D [x=" + x + ", y=" + y + "]";
	}
	
	
}
class Point3D extends Point2D{
	int z;

	Point3D(){
		super(); // 상속 관계에 있는 상위 클래스 생성자를 먼저 호출하겠다 : Point2D() 호출
		System.out.println("Point3D() 생성자 호출!");
	}
	Point3D(int x){
		super(x); // 인자 하나 받는 상위 클래스 생성자 호출 : Point2D(int x)
		// this.x = x; 시점의 차이
		System.out.println("Point3D(int x) 생성자 호출!");
	}
	Point3D(int x, int y){
		super(x,y); // 인자 두개 받는 상위 클래스 생성자 호출 : Point2D(int x, int y)
		System.out.println("Point3D(int x, int y) 생성자 호출!");
	}
	Point3D(int x, int y, int z){
		super(x,y); // 인자 두개 받는 상위 클래스 생성자 호출 : Point2D(int x, int y)
		this.z=z;	// z는 Point3D 생성하는 시점에서 대입
		System.out.println("Point3D(int x, int y, int z) 생성자 호출!");
	}
	
	@Override
	public String toString() {
		return "point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}

	
	}
	





public class C02InheritanceMain2 {

	public static void main(String[] args) {
//		Point3D ob = new Point3D();
//		Point3D ob2 = new Point3D(10);
//		Point3D ob3 = new Point3D(10,20);
		Point3D ob4 = new Point3D(10,20,30);
//		System.out.println(ob2);
		
	}

}
