package ex3;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		Date now = new Date(System.currentTimeMillis()); 
		
		request.setAttribute("date", now.toString());
		
		return "/ex3/view2.jsp";
	}

}
