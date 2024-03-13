package Ch13;

interface Remocon{
	int MAXVOL=100;
	int MINVOL=0;
	void on();
	void off();
	void setVolumn(int vol);	//외부로부터 볼륨값을 받음
	
}
interface Browser{
	void SearchURL(String url);
}
class TV implements Remocon{ //interface와 상속관계 예약어 implements(구현)
	private int vol; //기존 볼륨값 저장
	@Override
	public void on() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void off() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolumn(int vol) {
		if(vol>=MAXVOL)
			this.vol=MAXVOL;
		else if(vol<=MINVOL)
			this.vol=MINVOL;
		else
			this.vol = vol;
		System.out.println("현재 TV Volumn : " + this.vol);
		
	}	
	
}

class SmartTv extends TV implements Browser{

	@Override
	public void SearchURL(String url) {
		System.out.println(url + " 로 이동합니다.");
		
	}
	
}



class Radio implements Remocon{
	private int vol;
	@Override
	public void on() {
	System.out.println("RADIO를 켭니다.");
	
}

@Override
public void off() {
	System.out.println("RADIO를 끕니다.");
	
	}

@Override
public void setVolumn(int vol) {
	if(vol>=MAXVOL)			//볼륨이 최대치보다 같거나 크면 MAXVOL 값으로 설정
		this.vol=MAXVOL;
	else if(vol<=MINVOL)	//볼륨이 최소치보다 같거나 작으면 MINVOL 값으로 설정
		this.vol=MINVOL;
	else
		this.vol = vol;
	System.out.println("현재 Radio Volumn : " + this.vol);
	
}

}

public class C02InterfaceMain { 

	public static void TurnOn(Remocon remocon) {
		remocon.on();
	} //인터페이스 두기
	public static void TurnOff(Remocon remocon) {
		remocon.off();
	}
	public static void Volumn(Remocon remocon, int vol) {
		remocon.setVolumn(vol);
	}
	public static void BrowserSearch(Browser searchUrl, String url) {
		searchUrl.SearchURL(url);
	}
	
	
	public static void main(String[] args) {
		
		TV tv1 = new TV(); 	//TV 객체 생성
		Radio radio1 = new Radio();		//Radio 객체 생성 
		
		SmartTv smartTv = new SmartTv();
		TurnOn(smartTv);
		Volumn(smartTv,50);
		BrowserSearch(smartTv,"www.naver.com");
//		TurnOn(tv1);
//		Volumn(tv1,10);		// 볼륨을 10으로 설정하겠다
//		TurnOn(radio1);
//		Volumn(radio1,105);
//		
//		TurnOff(tv1); 	
//		TurnOff(radio1);
//		
	}

}
