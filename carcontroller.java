import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rent2.rentbean;
import rent2.rentdao;

/**
 * Servlet implementation class carcontroller
 */
@WebServlet("/carcontroller")
public class carcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public carcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter(); 
	String name=request.getParameter("name");
	String city=request.getParameter("city");
	long contact=Long.parseLong(request.getParameter("contact"));
	String days=request.getParameter("days");
	String destination=request.getParameter("destination");
	
	
	out.println(name);
	out.println(city);
	out.println(contact);
	out.println(days);
	out.println(destination);
		out.println("car booked successfully");
		rentbean rtb=new rentbean();
		rtb.setName(name);
		rtb.setCity(city);
		rtb.setContact(contact);
		rtb.setDays(days);
		rtb.setDestination(destination);
        rentdao rtd=new rentdao();
        try {
			rtd.insertDetails(rtb);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        response.sendRedirect("view1.jsp");
	    
	   
	}
}
