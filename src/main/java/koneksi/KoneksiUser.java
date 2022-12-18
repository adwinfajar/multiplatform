package koneksi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class KoneksiUser {
	ArrayList<User> User = new ArrayList<>();
	ConnectDB conn = new ConnectDB();
	java.sql.Statement st;
	
	public ArrayList<User> getUser() {
		ResultSet sd = conn.getResult("SELECT * FROM users");
		try {
			while (sd.next()) {
				User user = new User();
				user.setUser_id(sd.getString("user_id"));
				user.setNama(sd.getString("nama"));
				user.setEmail(sd.getString("email"));
				user.setKota(sd.getString("kota"));
				
				User.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return User;
	}
	
	
	public ArrayList<User> getUser(String i) {
		ResultSet sd = conn.getResult("SELECT * FROM users WHERE user_id=" + i);
		try {
			while (sd.next()) {
				User user = new User();
				user.setUser_id(sd.getString("user_id"));
				user.setNama(sd.getString("nama"));
				user.setEmail(sd.getString("email"));
				user.setKota(sd.getString("kota"));
				
				User.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return User;
	}
	
	public void createUser(User user) {
		String query = "INSERT INTO `users` (`user_id`, `nama`, `email`, `kota`) VALUES ('"
				+ user.getUser_id() + "','" + user.getNama() + "','"
				+ user.getEmail() + "', '"+ user.getKota() + "');";
		try {
			
			st = conn.con.createStatement();
			st.executeUpdate(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateUser(User user) {
		String query = "UPDATE `users` SET `user_id` = '" + user.getUser_id() + "', `nama` = '"
				+ user.getNama() + "', `email` = '" + user.getEmail() + "', `kota` = '" + user.getKota()+ "' WHERE `users`.`user_id` = " + user.getUser_id() + ";";
		try {
			System.out.println(query);
			st = conn.con.createStatement();
			st.executeUpdate(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteUser(String id) {
		String query = "DELETE FROM users WHERE user_id = " + id + ";";
		try {
			st = conn.con.createStatement();
			st.executeUpdate(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
