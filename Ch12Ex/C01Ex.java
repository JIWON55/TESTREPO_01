package Ch12Ex;

//[1번] 다음 main()메소드와 샐행 결과를 참고하여 TV를 상속 받은 ColorTv 클래스를 작성하라.

// 출력결과

//32인치 1024컬러

class TV{

	private int size; 
	public TV(int size) {this.size=size;}
	protected int getSize(){return size;}
	}

class ColorTV extends TV{
	int color;
	ColorTV(int size, int color){
	super(size);
	this.color=color;
	}
	
void printProperty() {
//	getSize();
//	this.color=color;
	System.out.println(getSize() +"인치 " + color + "컬러" );
}
}


public class C01Ex {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();

	}

}
