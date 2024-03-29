package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Mutter;

public class MutterDAO {
	// データベース接続に使用する情報
	private final String JDBC_URL = "jdbc:mysql://10.16.141.200/R3A105";
	private final String DB_USER = "R3A105";
	private final String DB_PASS = "password";

	public List<Mutter> findAll() {
		List<Mutter> mutterList = new ArrayList<Mutter>();

		// データベース接続
		try (Connection conn = DriverManager.getConnection(
				JDBC_URL, DB_USER, DB_PASS)) {

			// SELECT文の準備
			String sql = "SELECT ID,NAME,TEXT FROM MUTTER ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SELECTを実行
			ResultSet rs = pStmt.executeQuery();

			// SELECT文の結果をArrayListに格納
			while (rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("NAME");
				String text = rs.getString("TEXT");
				Mutter mutter = new Mutter(id, userName, text);
				mutterList.add(mutter);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return mutterList;
	}

	public boolean create(Mutter mutter) {
		// データベース接続
		try (Connection conn = DriverManager.getConnection(
				JDBC_URL, DB_USER, DB_PASS)) {

			// INSERT文の準備(idは自動連番なので指定しなくてよい）
			String sql = "INSERT INTO MUTTER(NAME, TEXT) VALUES(?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// INSERT文中の「?」に使用する値を設定しSQLを完成
			pStmt.setString(1, mutter.getUserName());
			pStmt.setString(2, mutter.getText());

			// INSERT文を実行
			int result = pStmt.executeUpdate();

			if (result != 1) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean delete(Mutter mutter) {
		// データベース接続
		try (Connection conn = DriverManager.getConnection(
				JDBC_URL, DB_USER, DB_PASS)) {

			// SELECT文の準備
			String sql = "DELETE FROM MUTTER";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// DELETEを実行
			int result = pStmt.executeUpdate();

			if (result != 1) {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}