import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import koneksi.KoneksiUser;
import koneksi.User;

@WebServlet(name = "CreateUser", urlPatterns = "/create")

public class CreateUser extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user_id = request.getParameter("user_id");
		String nama = request.getParameter("nama");
		String email = request.getParameter("email");
		String kota = request.getParameter("kota");
		System.out.println(kota);

		try {
			User user = new User();
			user.setUser_id(user_id);
			user.setNama(nama);
			user.setEmail(email);
			user.setKota(kota);

			KoneksiUser uC = new KoneksiUser();
			uC.createUser(user);

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Gagal Input Data!");
			doGet(request, response);

		}
		response.sendRedirect("/UasMultiplatform2022");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/forminput.jsp").forward(request, response);

	}

}
