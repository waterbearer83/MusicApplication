package Dao;

import java.sql.Connection;

public class ArtistsDao {

	private Connection connection;
	
	public ArtistsDao() {
		connection = DBConnection.getInstance().getConnection();
	
	}
}
