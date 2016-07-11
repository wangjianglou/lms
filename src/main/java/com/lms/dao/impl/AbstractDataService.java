package com.lms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import com.ibatis.sqlmap.client.SqlMapClient;

public class AbstractDataService {
	@Resource(name="sqlMapClient")
	private SqlMapClient sqlMapClient;
	
	public Object insert(String id, Object obj)  {
		Object object = null;
		try {
			object = sqlMapClient.insert(id, obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
	@SuppressWarnings("rawtypes")
	public List queryForList(String id, Object obj) {
		List list = null;
		try {
			list = (List) sqlMapClient.queryForList(id, obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public Object queryForObject(String id, Object obj) {
		Object object = null;
		try {
			object = sqlMapClient.queryForObject(id, obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
	public int update(String id, Object obj) {
		int i = 0;
		try {
			i = sqlMapClient.update(id, obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public int delete(String id, Object obj) {
		int i = 0;
		try {
			i = sqlMapClient.delete(id, obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
