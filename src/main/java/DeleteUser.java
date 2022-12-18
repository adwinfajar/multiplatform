import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import koneksi.KoneksiUser;
import koneksi.User;

@WebServlet(name = "DeleteUser", urlPatterns = "/delete")

public class DeleteUser extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		try {
			KoneksiUser uC = new KoneksiUser();
			uC.deleteUser(id);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			response.sendRedirect("/UasMultiplatform2022");
		}

//		getServletContext().getRequestDispatcher("/formedit.jsp").forward(request, response);

	}

}
