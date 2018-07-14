import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiplyNumbers extends HttpServlet{


	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("number"));
		//int num = (int) request.getAttribute("number");
		
		int square = 0;
		square = num*num;
		//System.out.println("Square = " + square);
		
		//response.setContentType("text");
		PrintWriter pw=response.getWriter();
		
		StringBuffer x1 = new StringBuffer();
		x1.append("<html><body bgcolor =\"orange\">");
	
		x1.append("<b> The sum of two numbers is : " +square+"	</body></html>");
	
		pw.println(x1.toString());		
		
	}
	
}
