package com.ji.nov063.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// main이 없음. > main은 tomcat 내부에 존재한다.

// Servlet = Server + Application

// Server
//	Web Server : HTML + CSS 요청하면 HTML + CSS
//	WAS	: Web Application Server(Web Server보다 한 체급 높다.)
//			프로그램 실행이 가능한 웹 서버.
//			웹 서버 + 프로그래밍 언어
//			웹 서버 + JDK
//			웹 서버 + C언어 등등...


// @ > Annotation
//		원래 다 직접 구현했어야 하는데 > 자동 구현이 됨.
//		LearnServlet을 Tomcat에 등록해라. (지우면 실행 X,클래스 명과 일치해야함!)
@WebServlet("/LearnServlet")
public class LearnServlet extends HttpServlet {
	//	HttpServlet 클래스에 있는 기능(요청 > 응답)을 상속 받음.
	//	뭔가 필요하면 더 추가할 수 있음.(Extends기 때문에.)
	
	//	지워도 됨. 작업하면서 버전 표시해주는 기능.
	private static final long serialVersionUID = 1L;
       
	//	생성자. 별로 쓸 일이 많지는 않음.(지워도 무방)
	//		이 LearnServlet 객체를 만드는 건 Tomcat
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	//	event-driven-programming(이벤트 기반 프로그래밍)
	//		Tomcat 이 실행중 > LearnServlet을 실행
	//		> Tomcat이 LearnServlet 객체를 만들어서 무한루프
	//		> 어떤 이벤트가 발생하면 그걸 처리 후 루프로 복귀한다.
	
    public LearnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    // 핵심
    //	루프를 돌다가 Client가 이 Servlet으로 get형 or post형으로 신청을 하면?
    //	tomcat이 get형 or post형 메소드로 맞춰 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
