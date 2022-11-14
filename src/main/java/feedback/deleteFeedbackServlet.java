package feedback;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class deleteFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =  request.getParameter("cID");
		
		boolean isTrue = feedbackDBUtil.deleteFeedback(id);
		
		if(isTrue == true){

			RequestDispatcher dis = request.getRequestDispatcher("feedback.jsp");
			dis.forward(request, response);
		}else {
			
			List<feedback> cusDetails = feedbackDBUtil.validate(id);
			request.setAttribute("cusDetails", cusDetails);

			RequestDispatcher dis2 = request.getRequestDispatcher("feedback.jsp");
			dis2.forward(request, response);
		}
		
	}

}
