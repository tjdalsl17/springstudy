package com.gdu.app06.service;

import java.util.List;

import com.gdu.app06.domain.BoardDTO;

public interface BoardService {
	public List<BoardDTO> getBoardList();		// 목록
	public BoardDTO getBoardByNo(int board_no);	// 상세 -> 번호를 저장할게요
	public int addBoard(BoardDTO board);
	public int modifyBoard(BoardDTO board);
	public int removeBoard(int board_no);
	public void testTx();

}
