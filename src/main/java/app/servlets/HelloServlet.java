package app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/Servlets_RobertoBenitez/HelloServlet

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		response.getWriter().append("Hola Mundo.. Soy roberto! ")
							.append(request.getContextPath())
							.append("Hola Mundo.. Soy roberto! ")
							.append("Segundo Commint");
		
		*/
		
		response.getWriter().append("<html>")
							.append("<h2>Do Get => Hola mundo</h2>")
							.append("<p>Este es mi primer servlet</p>")
							.append("</html>");
		
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		response.getWriter()
				.append("<html>")
				.append("<h2>Do Post => Hola mundo</h2>")
				.append("<p>Este es mi primer servlet</p>")
				.append("</html>");
			
	}

}
