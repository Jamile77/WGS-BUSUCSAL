package br.ucsal.busucsal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.busucsal.model.Usuario;
import br.ucsal.busucsal.service.CadastroService;

/**
 * Servlet implementation class CadastroColaborador
 */
@WebServlet("/cadastrocolaborador")
public class CadastroColaborador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CadastroService cadastroService = new CadastroService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroColaborador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("key");
		String name = request.getParameter("fullname");
		String function = request.getParameter("function");
		if(login != null && senha != null && name != null && function != null) {
			cadastroService.cadastrarColaborador(new Usuario(login,senha,name,function));
			response.sendRedirect("./private/admin.jsp");
		}else {
			response.sendRedirect("./private/cad_colaborador.jsp");
		}
		
		
	}

}
