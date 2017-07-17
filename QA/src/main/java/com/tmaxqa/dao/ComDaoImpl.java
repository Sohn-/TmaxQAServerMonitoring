package com.tmaxqa.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmaxqa.entity.Com;

@Repository
public class ComDaoImpl implements ComDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	private final String nameSpace = "tmaxqa.mappers.ComMapper.";

	@Override
	public int insertCom(Com com) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "insertCom";
		return sqlSession.insert(stmt, com);
	}

	@Override
	public int updateCom(Com com) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "updateCom";
		return sqlSession.update(stmt, com);
	}

	@Override
	public int deleteCom(String ip) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "deleteCom";
		return sqlSession.delete(stmt, ip);
	}

	@Override
	public Com getComByComIp(String ip) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "getComByComId";
		Com result = sqlSession.selectOne(stmt, ip);
		return result;
	}

}
