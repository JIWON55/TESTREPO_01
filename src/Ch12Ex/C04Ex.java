package Ch12Ex;

class SharpPencile{
	private int width;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
class Ballpen extends SharpPencile{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
class FountainPen extends Ballpen{
	public void refill(int n) {
		setAmount(n);
	}
}



//풀이

// class Pen{
//	private int amount
// public int getAmount(){return amount;}
// public void setAmount(int amount){this.amount = amount;}
//}

// class SharpPen extends Pen{
//	private int width;
//}

// class BallPen extends Pen{
// private String color;
// public String getColor(){return color;}
//}

// class FountainPen extends BallPen{
// public void refill(int n) {amount=n;}
//}

// ++ 둘 중 차이가 있을까..? 어느 것이 더 좋은 코드일까..
public class C04Ex {

	public static void main(String[] args) {
		

	}

}
