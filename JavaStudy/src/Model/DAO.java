package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	// DB연결
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	public void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "STUDENT";
			String pw = "12345";
			conn = DriverManager.getConnection(url, id, pw);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	

	// DB해제 
	public void getClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//학생조회 
	public ArrayList<DTO> List() {

		getConn();

		ArrayList<DTO> List = new ArrayList<>();

		String sql = "select * from 학생";

		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery(); // 쿼리 실행문

			while (rs.next()) {
				String name = rs.getString("이름");
				int birthday = rs.getInt("생일");
				String address = rs.getString("주소");
				String phonNumber = rs.getString("핸드폰번호");

				DTO dto = new DTO(name, birthday, address, phonNumber);
				List.add(dto);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();
		return List;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
