package com.leeyc.study.board.service;

import java.util.List;

import com.leeyc.study.board.vo.BoardVO;

public interface BoardService {

	// �Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception;
	
	//�Խù� ���
	public List<BoardVO> list() throws Exception;
}
