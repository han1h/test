package ex2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetAction {

	// 일관성이 있어야 한다.
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 컨트롤러에서 전달해온 request의 주소를 가지고 값을 저장하자
		request.setAttribute("str", "반갑습니다.");
		
		// view의 경로를 반환한다
		return "/ex2/page2.jsp";
		
	}
}
