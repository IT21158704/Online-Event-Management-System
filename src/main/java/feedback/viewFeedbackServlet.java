package feedback;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class viewFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cusid = request.getParameter("cusid");
		
		feedbackDBUtil.validate(cusid);
		
		try {
		List<feedback> fbkDetails = feedbackDBUtil.validate(cusid);
		request.setAttribute("fbkDetails", fbkDetails);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("viewFeedback.jsp");
		dis.forward(request, response);
	}

}
