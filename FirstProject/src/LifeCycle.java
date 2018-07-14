import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LifeCycle extends HttpServlet {

	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("InService");
		HttpSession s=req.getSession();
		s.setAttribute("Book", "Java");
		
	}

	@Override
	public void destroy() {
		System.out.println("Destroyed");
	}

	@Override
	public void init() throws ServletException {
		
		ServletConfig s=this.getServletConfig();
		String file=s.getInitParameter("FileName");
		System.out.println(file);
		//System.out.println("Initiated");
	
	}


}