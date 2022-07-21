package com.spring.mvc.dynamicQuery.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DynamicQueryDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Map<String,Object>> selectOrderList(){
		return sqlSession.selectList("dynamicQuery.list");
	}
	
	public List<Map<String,Object>> ifEx(Map<String,String> searchMap){
		return sqlSession.selectList("dynamicQuery.ifEx" , searchMap);
	}
	
	
}




