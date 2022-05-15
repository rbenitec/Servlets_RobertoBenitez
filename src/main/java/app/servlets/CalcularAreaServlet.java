package app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularAreaServlet
 */
@WebServlet("/CalcularAreaServlet")
public class CalcularAreaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularAreaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int altura = Integer.parseInt(request.getParameter("altura"));
		int base = Integer.parseInt(request.getParameter("base"));
		
		int calculo=0;
		
		String tipo = request.getParameter("tipo");
		
		System.out.println(tipo);
		
		if(tipo.equalsIgnoreCase("triangulo")) {
			calculo = (base*altura)/2;
		}else {
			calculo = (base*altura);	
		}
		System.out.println(calculo);
		response.getWriter()
							.append("<html>")
							.append("<h1>"+tipo+"</h1>")
							.append("<h3> El area es: "+calculo+ "</h3")
							.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
