package com.gdu.app05.service;

import java.util.List;

import com.gdu.app05.domain.BoardDTO;

public interface BoardService {
	public List<BoardDTO> getBoardList();
	public BoardDTO getBoardByNo(int board_no);		// 번호를 저장할게요
	public int addBoard(BoardDTO board);			
	public int modifyBoard(BoardDTO board);			
	public int removeBoard(int board_no);			

}
