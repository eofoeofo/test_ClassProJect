package com.inhatc.persistence;

import com.inhatc.domain.StudentInfoVO;

public interface StudentInfoDAO {
	
	public void insertStudentInfo(StudentInfoVO vo);
	
	public StudentInfoVO readStudentInfo(String classnum)throws Exception;

	

}
