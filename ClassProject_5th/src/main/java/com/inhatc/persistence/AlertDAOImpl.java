package com.inhatc.persistence;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.inhatc.domain.AlertVO;
import org.apache.ibatis.session.SqlSession;

@Repository
public class AlertDAOImpl implements AlertDAO {

	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.inhatc.mapper.AlertMapper";

	@Override
	public void insertAlert(AlertVO vo) {
		sqlSession.insert(namespace+".insertAlert", vo);
	}

	@Override
	public AlertVO readAlert(String bno) throws Exception {
		return sqlSession.selectOne(namespace + ".selectAlert", bno);
	}



}
