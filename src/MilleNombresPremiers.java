import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MilleNombresPremiers
 */
@WebServlet("/MilleNombresPremiers")
public class MilleNombresPremiers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean premier = true;
	int flag=1;
	int nbr=1000;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MilleNombresPremiers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html") ;	
		PrintWriter out = response.getWriter() ;
		out.println("<html><head><title>milleNombresPremiers</title></head>") ;
		out.println("<body><center>") ;
		out.println("<table border='1' width='60%'>");
		for(int i =2; i <= nbr; i++){
			premier = true;
			for(int j = 2; j <= i; j++){
				if((i%j == 0)&& (j!=i)){
					premier = false;
					break;
				}
			}
			 if(premier){			    	
				if(flag==1)
				{
					out.println("<tr>");
					out.println("<td align='center'>"+i+"</td>");
				}
				if(flag==10)
				{									
					out.println("<td align='center'>"+i+"</td>");
					out.println("</tr>");
					flag=0;					
				}
				if(flag!=10 && flag!=1 && flag!=0) {
					out.println("<td align='center'>"+i+"</td>");
				}						
				flag++;
			 }

			}
		out.println("</table></center>");
		out.println("</body>") ;
		out.println("</html>") ; 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}