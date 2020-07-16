package com.leeyc.study.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.leeyc.study.board.vo.BoardVO;

@Repository
public interface BoardDao{
	 
	// �Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception; 
	
	// �Խñ� ���
	public List<BoardVO> list() throws Exception;
	
}
 