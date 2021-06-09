package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Tracks;

public class TracksDao {
	
	private Connection connection;
	private final String ALL_TRACKS_QUERY = "select * from tracks";
	
	public TracksDao() {
		connection = DBConnection.getInstance().getConnection();
	}
	
	public List<Tracks> getAllTracks() throws SQLException {
		List<Tracks> out = new ArrayList<>();
		ResultSet rs = connection.prepareStatement(ALL_TRACKS_QUERY).executeQuery();
		while (rs.next()) {
			out.add(new Tracks(rs.getInt("id"), rs.getString("track")));
		}
		return out;
	}
public void close() {
	DBConnection.getInstance().closeConnection();
}
}
