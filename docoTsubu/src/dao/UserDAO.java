package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	//比較を入れるとセキュリティ適に良い
	//パスワードだけ
	//getUserPassword(id)
	//select password from user where = 'id'

	/*public static void main(String[] args) {
	  // データベースに接続
	  try (Connection conn = DriverManager.getConnection(
	  		"jdbc:mysql://10.16.141.200/R3A105", "R3A105", "password")) {
	
	    // SELECT文を準備
	    String sql = "SELECT ID,PW FROM USER";
	    PreparedStatement pStmt = conn.prepareStatement(sql);
	
	    // SELECTを実行し、結果表（ResultSet）を取得
	    ResultSet rs = pStmt.executeQuery();
	
	    // 結果表に格納されたレコードの内容を表示
	    while (rs.next()) {
	      String id = rs.getString("ID");
	      String pw = rs.getString("PW");
	
	      // 取得したデータを出力
	      System.out.println("ID:" + id);
	      System.out.println("名前:" + pw);
	    }
	  } catch (SQLException e) {
	    e.printStackTrace();
	  }
	}*/
	public static Boolean UserData(String id, String pw) {
		//ArrayList<String> userData = new ArrayList<String>();
		Boolean check = false;
		// データベースに接続
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://10.16.141.200/R3A105", "R3A105", "password")) {

			// SELECT文を準備
			String sql = "SELECT ID,PW FROM USER";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SELECTを実行し、結果表（ResultSet）を取得
			ResultSet rs = pStmt.executeQuery();

			// 結果表に格納されたレコードの内容を表示
			while (rs.next()) {
				String dbId = rs.getString("ID");
				String dbPw = rs.getString("PW");

				//userData.add(id);
				//userData.add(pw);

				//id+pw判定
				if (dbId.equals(id) && dbPw.equals(pw)) {
					check = true;
				}

				// 取得したデータを出力
				System.out.println("ID:" + id);
				System.out.println("名前:" + pw);
				System.out.println("dbID:" + dbId);
				System.out.println("db名前:" + dbPw);
				System.out.println("ans:" + check);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return userData;
		return check;
	}
}
