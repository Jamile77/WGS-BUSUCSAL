package br.ucsal.busucsal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.busucsal.model.Usuario;
import br.ucsal.busucsal.service.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String ADMIN = "ADMINISTRADOR";
	private static String COLAB = "COLABORADOR";
	private static String ALUNO = "ALUNO";
    
	private LoginService loginService = new LoginService();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("user");
		String senha = request.getParameter("pass");
		
		Usuario usuario = loginService.login(login, senha);
		
		if (usuario == null) {
			request.setAttribute("erro", "Login ou Senha Inválidos!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("./index.jsp");
			dispatcher.forward(request, response);
			
		} else if(usuario.getPapelUsuario().equals(ADMIN)) {
			System.out.println("Sou administrador");
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect("./private/admin.jsp");
			
		}else if(usuario.getPapelUsuario().equals(COLAB)) {
			System.out.println("Sou colaborador");
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect("./private/colaborador.jsp");
			
		}else if(usuario.getPapelUsuario().equals(ALUNO)) {
			System.out.println("Sou aluno");
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect("./private/aluno.jsp");
		}
	}
}