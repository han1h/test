package ex2;

import java.sql.Date;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateAction {

public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 현재 날짜 구하기
		/*
		   Calendar now = Calendar.getInstance(); //컴퓨터는 월래 달력을 가지고 있어서 가지고 오는 거사
		   
		   int yy = now.get(Calenda.Year);// 현재년도
		   int mm = now.get(Calendar.MONTH)+1;
		   int dd = now.get(Calendar.DAY_OF_MONTH);
		   
		   // 문자열로 만들기 위해 StringBuffer 사용
		    StringBuffer sb = new StringBuffer();
		    sb.apend(yy);
		    sb.apend("-");
		    sb.apend(mm);
		    sb.apend("-");
		    sb.apend(dd);
		    // 2020-2-18
		 */
	
		// 년따로 월따로 일따로 는 Calendar을 사용한다. 나이 구하기등
		java.sql.Date now = new Date(System.currentTimeMillis()); // 생성시 날짜로 나온다.
		
		request.setAttribute("date", now);
		
		// view의 경로를 반환한다
		return "/ex2/page3.jsp";
		
	}
	
}
