package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.java.browser.dom.DOMService;
import com.sun.xml.internal.txw2.Document;

/**
 * Servlet implementation class ValidateLoginServlet
 */
@WebServlet("/ValidateLogin")
public class ValidateLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request , response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void doService(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException  {
		String login = request.getParameter("login");
		String password  = request.getParameter("password");
		String user = request.getParameter("user");
		
		if(user == null){ mostrarErro(request, response , "Selecione o tipo de usuário");}
		else{
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("MenuPrincipal.jsp");
			dispatcher.forward(request, response);
		}
	}

	private void mostrarErro(HttpServletRequest request, HttpServletResponse response, String message) throws ServletException, IOException  {
		request.setAttribute("erro", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
	}
	

}
