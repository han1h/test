package ex3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		// 컨트롤러에서 전달해온 request의 주소를 가지고 값을 저장하자
		request.setAttribute("str", "반갑습니다.");
				
		// view의 경로를 반환한다
		return "/ex3/view3.jsp";
	}

}
