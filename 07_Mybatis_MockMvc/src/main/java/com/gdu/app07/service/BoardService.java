package com.gdu.app07.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gdu.app07.domain.BoardDTO;

public interface BoardService {
	public List<BoardDTO> getBoardList();
	public BoardDTO getBoardByNo(HttpServletRequest request);
	public int addBoard(HttpServletRequest request);	
	public int modifyBoard(HttpServletRequest request);
	public int removeBoard(HttpServletRequest request); // // jsp 파라미터값-> controller는 HttpServletRequest로 request는 DAO에서 int값으로 변환

}
