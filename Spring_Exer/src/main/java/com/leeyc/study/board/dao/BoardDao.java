package com.leeyc.study.board.dao;

import java.util.List;

import com.leeyc.study.board.vo.BoardVO;

public interface BoardDao {
	//�Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception;
	
	//�Խñ� ���
	public List<BoardVO> list() throws Exception;
}
