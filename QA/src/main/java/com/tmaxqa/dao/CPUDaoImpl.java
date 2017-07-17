package com.tmaxqa.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmaxqa.entity.CPU;

@Repository
public class CPUDaoImpl implements CPUDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	private final String nameSpace = "tmaxqa.mappers.CPUMapper.";

	@Override
	public int insertCPU(CPU cpu) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "insertCPU";
		return sqlSession.insert(stmt, cpu);
	}

	@Override
	public int updateCPU(CPU cpu) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "updateCPU";
		return sqlSession.update(stmt, cpu);
	}

	@Override
	public int deleteCPU(String ip) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "deleteCPU";
		return sqlSession.delete(stmt, ip);
	}

	@Override
	public CPU getCPUByCPUIp(String ip) {
		// TODO Auto-generated method stub
		String stmt = nameSpace + "getCPUByCPUId";
		CPU result = sqlSession.selectOne(stmt, ip);
		return result;
	}

}
