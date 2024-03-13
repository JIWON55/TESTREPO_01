package Ch14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C06SimpleDateFormat {

	public static void main(String[] args) throws ParseException {  // 제대로 입력 안했을때에 대한 예외 처리
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력 : ");
		String ymd = sc.next();
		
		//포매터 객체 생성 (입력용) 입력받은 문자열을 데이터 객체로
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd"); //소문자로 처리하나 대문자 M은 월, 소문자 m은 분이다
																	 //y,M,d,h,m,s
		System.out.println(ymd);
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
		//포매터 객체 생성(출력용)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy~MM~dd");
		System.out.println(fmtout.format(date));
	}

}
