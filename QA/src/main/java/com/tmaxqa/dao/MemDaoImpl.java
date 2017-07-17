package com.tmaxqa.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmaxqa.entity.Mem;

@Repository
public class MemDaoImpl implements MemDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	private final String nameSpace = "tmaxqa.mappers.MemMapper.";

	@Override
	public int insertMem(Mem mem) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "insertMem";
		return sqlSession.insert(stmt, mem);
	}

	@Override
	public int updateMem(Mem mem) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "updateMem";
		return sqlSession.update(stmt, mem);
	}

	@Override
	public int deleteMem(String ip) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "deleteMem";
		return sqlSession.delete(stmt, ip);
	}

	@Override
	public Mem getMemByMemIp(String ip) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "getMemByMemId";
		Mem result = sqlSession.selectOne(stmt, ip);
		return result;
	}

}
