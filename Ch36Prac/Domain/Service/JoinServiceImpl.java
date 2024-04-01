package Ch36Prac.Domain.Service;

import Ch36Prac.Domain.Dao.JoinDaoImpl;

public class JoinServiceImpl {
	private JoinDaoImpl dao;
	
	public JoinServiceImpl() throws Exception{
		dao = new JoinDaoImpl();
	}
	
	
}
