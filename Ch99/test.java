package Ch99;


class C01Buyer{
	 int myMoney;
	 int appleCnt; //사과 갯수
	C01Buyer(int money, int cnt){
		this.myMoney = money;
		this.appleCnt = cnt;
	}; // 반환자료형 x
	public void pay(C01Seller seller, int money) {
		myMoney -= money; 	// 특정판매자 Seller에게 돈 주기 전 1. myMoney 에서 money만큼 차감
		int cnt = seller.receive(money); // 2. Seller의 receive 메서드를 이용해서 money를 전달
		appleCnt += cnt;	// 6. 사과개수를 받아 appleCnt 누적
	};
	
	void showinfo() {
	
		System.out.println("보유금액 : " + myMoney);
		System.out.println("사과개수 : " + appleCnt);
		
	}
}
class C01Seller{
	 int myMoney;
	 int appleCnt; //사과 갯수
	public int price;
	C01Seller(int money, int cnt, int price){
		this.myMoney = money;
		this.appleCnt = cnt;
		this.price = price;
	}
	public int receive(int money) {
		
		myMoney += money; // 3. myMoney에 전달받은 money를 누적
		int cnt = money/price;
		appleCnt -= cnt; // 4. 보유사과개수(appleCnt)에 전달받은 money/price 차감
						
		return cnt;		// 5. 호출했던 위치(구매자의 pay함수)로 사과개수(money/price) 전달
	};
	void showinfo() {
		System.out.println("보유금액 : " + myMoney);
		System.out.println("사과개수 : " + appleCnt);
		System.out.println("개당가격 : " + price);
	}
}



public class test {

	public static void main(String[] args) {
		C01Seller seller = new C01Seller(100000,100,1000); // 보유금액, 사과개수, 사과 1개 가격
		C01Buyer buyer01 = new C01Buyer(10000,0);
		C01Buyer buyer02 = new C01Buyer(20000,0);
		C01Buyer buyer03 = new C01Buyer(30000,0);
		
		buyer01.pay(seller,2000);
		buyer02.pay(seller,5000);
		buyer03.pay(seller,3000);
	
	
	
	
	System.out.println("---판매자 정보---");
	seller.showinfo();
	System.out.println("---구매자 정보---");
	System.out.println("-buyer01-");
	buyer01.showinfo();
	System.out.println("-buyer02-");
	buyer02.showinfo();
	System.out.println("-buyer03-");
	buyer03.showinfo();
	
	
	}

}
