

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BienvenueServlet")
public class BienvenueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public BienvenueServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>BienvenueServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<head>Bienvenue au cours de Programmation Web avancée 2 avec Jakarta EE</head>");
		DateFormat formatDate= new SimpleDateFormat("dd/MM/yyyy-HH'h'mm");
		out.println(formatDate.format(new Date()));
		int compteur = 0;
		compteur++;
		out.println("</br><p>Cette servlet a été invoquée "+compteur +" fois.</p>");
		
		out.println("</body>");
		out.println("</html>");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
