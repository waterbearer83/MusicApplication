package Dao;

import java.sql.Connection;

public class AlbumsDao {

	private Connection connection;
	
	public AlbumsDao() {
		connection = DBConnection.getInstance().getConnection();
	
	}
}
