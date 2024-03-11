package Ch00Prac;

//홍길동이 GS감삼점에서 컵라면은 2개 구매한다.

		class Buyer{
			int myMoney;
			int prodCnt;
			Buyer(int money, int cnt){
				this.myMoney=money;
				this.prodCnt=cnt;
			}
			public void pay(Store GsGamsam, int money) {
				myMoney-= money;  // 가지고 있는 돈에서 줄 금액 만큼 차감
				int cnt = GsGamsam.receive(money); //Store의 receive 함수를 이용하여 money 전달
				prodCnt +=cnt; // receive함수를 이용하여 컵라면 개수 받아 prodCnt에 누적
			};
		}
		
		
		class Store{
			int myMoney;
			int prodCnt;
			int price;
			Store(int money, int cnt, int price){
				this.myMoney = money;
				this.prodCnt = cnt;
				this.price = price;
			}
			public int receive(int money) {
				myMoney += money; // myMoney에 전달받은 money를 누적
				int cnt = money/price; // buyer가 사고자 하는 컵라면 개수
				prodCnt -= cnt; 	// 보유 컵라면 개수에서 팔린 컵라면 개수 차감
				return cnt;			// buyer의 pay함수로 컵라면 개수 전달
			}
			
		}
		
		// 구매자
		// ----------
		// 보유금액
		// 컵라면개수
		// 구매하기(누가한테, 얼마를)
		
		// 판매자
		// -----------
		// 보유금액
		// 컵라면개수
		// 금액
		// 전달하기(금액)


public class test01 {

	public static void main(String[] args) {
		
		Store GsGamsam = new Store(100000,100,1800);
		Buyer hong = new Buyer(10000,0);
		
		hong.pay(GsGamsam, 3600);
		
		System.out.printf("%d,%d\n" , GsGamsam.myMoney, GsGamsam.prodCnt);
		System.out.printf("%d,%d\n" , hong.myMoney, hong.prodCnt);
		
		
		
	
		// (-) : private
		// (+) : public

	}

}
