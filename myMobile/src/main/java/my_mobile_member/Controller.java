package my_mobile_member;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my_mobile_member_servlet/*")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		String uri=request.getRequestURI();
		System.out.println(uri);
		MmmDAO dao=new MmmDAO();
		
		if(uri.indexOf("list.do") != -1) {
			String keyNum=request.getParameter("keyNum");
			String result="";
			Map<String,Object> map=new HashMap<>();
			List<MmmDTO> list=dao.manager(keyNum);
			if(list.isEmpty()) {
				result="잘못된 입력입니다.";
			}else {
				result="관리자님 어서오세요!";
			}
			map.put("list", list);
			map.put("count", list.size());
			request.setAttribute("map", map);
			request.setAttribute("result", result);
			String page="/myMobile/management_list.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(page);
			rd.forward(request, response);				
			
		}else if(uri.indexOf("join.do") != -1) {
			String userid=request.getParameter("userid");
			String userpw=request.getParameter("userpw");
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String hp=request.getParameter("hp");
			String address=request.getParameter("address");
			
			MmmDTO dto=new MmmDTO();
			dto.setUserid(userid);
			dto.setUserpw(userpw);
			dto.setName(name);
			dto.setEmail(email);
			dto.setHp(hp);
			dto.setAddress(address);
			dao.insert(dto);
			
		}else if(uri.indexOf("login.do") != -1) {
			String userid=request.getParameter("userid");
			String userpw=request.getParameter("userpw");
			MmmDTO dto=new MmmDTO();
			dto.setUserid(userid);
			dto.setUserpw(userpw);
			String result=dao.loginCheck(dto);
			request.setAttribute("result", result);
			String page="/myMobile/result.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(page);
			rd.forward(request, response);
			
		}else if(uri.indexOf("remind_id.do") != -1) {
			String email=request.getParameter("email");
			MmmDTO dto=new MmmDTO();
			dto.setEmail(email);
			String remind=dao.remindId(dto);
			request.setAttribute("remind", remind);
			String page="/myMobile/result2.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(page);
			rd.forward(request, response);
			
		}else if(uri.indexOf("remind_pw.do") != -1) {
			String userid=request.getParameter("userid");
			MmmDTO dto=new MmmDTO();
			dto.setUserid(userid);
			String remind=dao.remindPw(dto);
			request.setAttribute("remind", remind);
			String page="/myMobile/result2.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(page);
			rd.forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		doGet(request, response);
	}

}