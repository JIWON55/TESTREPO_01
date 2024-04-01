package Ch36Prac.Domain.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Ch36Prac.Domain.Dto.JoinDto;

public class JoinDaoImpl {
	//DB 연결
	private String url="jdbc:mysql://localhost:3306/memberdb";
	private String id = "root";
	private String pw = "1234";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public JoinDaoImpl() throws Exception{		//클래스 못찾으면 그때가서 처리할게
		Class.forName("com.mysql.cj.jdbc.Driver"); // DB와 연결하는 리플렉션 API
		conn = DriverManager.getConnection(url,id,pw); //JDBC를 이용해 DB와 연결하는 객체
		System.out.println("[DAO] JoinDaoImpl's INIT DB CONNECTED..");
	} 
	
	// INSERT
//	public boolean Insert(JoinDto dto) {  // JoinDto 객체가 잘 들어갔나 안들어갔나 확인
//		 pstmt=conn.prepareStatement("insert into join values(?,?,?,?)");
//	}


}
