package Ch36Prac.Controller;

import java.util.Map;

import Ch36Prac.Domain.Dto.JoinDto;
import Ch36Prac.Domain.Service.JoinServiceImpl;

public class JoinController implements SubController {
	
	private JoinServiceImpl service;
	
	
	@Override
	public Map<String, Object> execute(int ServiceNo, Map<String, Object> params) {
		System.out.println("JoinController's execute()");
	
	if(ServiceNo==1) {		//INSERT
		JoinDto dto = (JoinDto)params.get("joinDto");
		System.out.println("[SC]JoinController's Insert.." + dto);
	if(!isValide(dto))
		return null;
	boolean isRegistred = false;
	try {
		isRegistred = service.
	}
	
	}
	else if(ServiceNo==2) {}
	else if(ServiceNo==3) {}
	else if(ServiceNo==4) {}
	else if(ServiceNo==5) {}
	else {}
	return null;
	
	
	}
	private boolean isValide(JoinDto dto) {
		return true;
	}
}
