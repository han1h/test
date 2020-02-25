package ex2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiAction {

	// 컨트롤러에 의해 호출된다. 그리고 request와 response를 사용해야 한다.
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 컨트롤러에서 전달해온 request의 주소를 가지고 값을 저장하자
		request.setAttribute("msg", "환영합니다.");
		
		// view의 경로를 반환한다
		return "/ex2/page1.jsp";
		
	}
}
