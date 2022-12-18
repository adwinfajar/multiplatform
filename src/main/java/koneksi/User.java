package koneksi;

public class User {
	String user_id, nama, email, kota;

	public User() {
		super();
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}
	
	public String toString() {
		return "User [" + user_id + ", " + nama + ", " + email + ", " + kota + "]";
	}

}
