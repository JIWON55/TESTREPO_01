package Ch99;


class Buyer{
	 private int myMoney;	//buyer의 보유 금액 자료형 선언
	 private int appleCnt; 	//buyer의 사과 개수 자료형 선언
	 
	Buyer(int money, int cnt){ 		//생성자 함수
		this.myMoney = money; 	// 생성된 buyer의 money 인자값을 myMoney에 대입
		this.appleCnt = cnt;	// 생성된 buyer의 cnt 인자값을 appleCnt에 대입
	}; 
	
	public void pay(Seller seller, int money) {		//seller에게 money만큼의 돈을 전달하고(보유금액 차감), 사과 개수를 누적하는 함수 생성
		myMoney -= money; 	// 특정판매자 Seller에게 돈 주기 전 1. myMoney 에서 money만큼 차감
		int cnt = seller.receive(money); // 2. Seller의 receive 메서드를 이용해서 money를 전달
		appleCnt += cnt;	// 6. 사과개수를 받아 appleCnt 누적
	};
	
	void showinfo() {		// 바이어 정보 표현 함수 생성
	
		System.out.println("보유금액 : " + myMoney);
		System.out.println("사과개수 : " + appleCnt);
		
	}
}


class Seller{
	 private int myMoney;	// seller의 보유 금액 자료형 선언 
	 private int appleCnt; 	// seller의 사과 개수 자료형 선언
	public int price;	//사과 가격\
	
	Seller(int money, int cnt, int price){		// 생성자 함수
		this.myMoney = money; 		//생성된 seller의 money 인자값을 myMoney에 대입
		this.appleCnt = cnt;		//생성된 seller의 cnt 인자값을 appleCnt에 대입
		this.price = price;			//생성된 seller의 price 인자값을 price에 대입
	}
	
	public int receive(int money) {		// money 누적, 사과개수 값을 차감 후 buyer에게 전달하는 함수 생성 
		
		myMoney += money; // 3. myMoney에 전달받은 money를 누적
		int cnt = money/price;
		appleCnt -= cnt; // 4. 보유사과개수(appleCnt)에 전달받은 money/price = cnt(구매자가 구매한 개수) 차감
						
		return cnt;		// 5. 호출했던 위치(구매자의 pay함수)로 사과개수(money/price) 전달
	};
	
	void showinfo() {		// 셀러 정보 표현 함수 생성
		System.out.println("보유금액 : " + myMoney);
		System.out.println("사과개수 : " + appleCnt);
		System.out.println("개당가격 : " + price);
	}
}



public class test {

	public static void main(String[] args) {
		Seller seller = new Seller(100000,100,1000); // seller 객체생성 (보유금액, 사과개수, 사과 1개 가격)
		Buyer buyer01 = new Buyer(10000,0);			// buyer01 객체생성 (보유금액, 사과개수)
		Buyer buyer02 = new Buyer(20000,0);			// buyer02 객체생성 (보유금액, 사과개수)
		Buyer buyer03 = new Buyer(30000,0);			// buyer03 객체생성 (보유금액, 사과개수)
		
		buyer01.pay(seller,2000);  		//buyer01이 pay 메서드 이용
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
