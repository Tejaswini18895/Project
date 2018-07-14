import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddNumbers extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num_one = Integer.parseInt(request.getParameter("num1"));
		int num_two = Integer.parseInt(request.getParameter("num2"));
		int sum = 0;
		sum = num_one + num_two;
		
		/*RequestDispatcher rd=request.getRequestDispatcher("product");
		request.setAttribute("number", sum);
		rd.forward(request, response);
		*/
		
		/*
		HttpSession s = request.getSession();
		System.out.println((String)s.getAttribute("Book"));
		*/
		response.sendRedirect("product?number="+sum);
		
		
//		System.out.println("Sum = " +sum);
		
		//response.setContentType("text");
/*		PrintWriter pw=response.getWriter();
		
		StringBuffer x = new StringBuffer();
		x.append("<html><body bgcolor =\"orange\">");
	
		x.append("<b> The sum of two numbers is : " +sum+"	</body></html>");
	
		pw.println(x.toString());
*/		
		
		
	}/*
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
		int num_one = Integer.parseInt(request.getParameter("num1"));
		int num_two = Integer.parseInt(request.getParameter("num2"));
		int sum = 0;
		sum = num_one + num_two;
		System.out.println("Sum = " +sum);
		
		//response.setContentType("text");
		PrintWriter pw=response.getWriter();
		
		StringBuffer x = new StringBuffer();
		x.append("<html><body bgcolor =\"silver\">");
	
		x.append("<b> The sum of two numbers is : " +sum+"	</body></html>");
	
		pw.println(x.toString());
		
		
	}
*/	
}
