package app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/recordServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("username");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int resultado = num1 + num2;
		System.out.println("Hola Usuario: "+request.getParameter("username")+ "\n"+ "La suma de los numero enviados es: "+ resultado);
		
		response.getWriter()
							.append("<html>")
							.append("<h1> Hola " + user +" </h1>")
							.append("<p>Este es mi primer servlet</p>")
							.append("<h4>Ser recbio numero1 = "+num1+ "</h4>")
							.append("<h4>Ser recbio numero2 = "+num2+ "</h4>")
							.append("<h5>EL resultado de la suma es = "+resultado+ "</h5")
							.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
