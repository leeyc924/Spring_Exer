package com.leeyc.study.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.leeyc.study.board.vo.BoardVO;

public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSession sqlSession;
	 
	// �Խñ� �ۼ�
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);
	}
}
