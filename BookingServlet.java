import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookingServlet extends HttpServlet {
	private Object response;

	protected void doPost (
		HttpServletRequest request,
		HttpServletResponse responce)
	
		throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String pack = request.getParameter("package");
		String date = request.getParameter("date");
				
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into booking(customer_name, package_name,booking_date) values(?,?,?)");
			ps.setString(1,name);
			ps.setString(2,pack);
			ps.setString(3,date);
			
			ps.executeUpdate();
			
			((HttpServletResponse) response).sendRedirect("success.jsp");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		

}
