package com.inhatc.persistence;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.inhatc.domain.StudentInfoVO;
import org.apache.ibatis.session.SqlSession;


	
	@Repository
	public class StudentInfoDAOImpl implements StudentInfoDAO {
		
		@Inject
		private SqlSession sqlSession;
		
		private static final String namespace =
				"com.inhatc.mapper.StudentInfoMapper";
		
		@Override
		public void insertStudentInfo (StudentInfoVO vo) {
			sqlSession.insert(namespace+".insertStudentInfo", vo);
		}
		@Override
		public StudentInfoVO readStudentInfo(String classnum) throws Exception {
			return (StudentInfoVO) 
					sqlSession.selectOne(namespace+".selectStudentInfo", classnum);
		}
		
	}
