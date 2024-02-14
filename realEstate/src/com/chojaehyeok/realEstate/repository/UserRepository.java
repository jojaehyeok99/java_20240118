package com.chojaehyeok.realEstate.repository;

import java.sql.SQLException;

public interface UserRepository {
	
	boolean existById(String id) throws SQLException;
}
