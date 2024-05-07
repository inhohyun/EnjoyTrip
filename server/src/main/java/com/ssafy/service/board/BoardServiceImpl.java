package com.ssafy.service.board;

import org.springframework.stereotype.Service;

import com.ssafy.mapper.board.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	private final BoardMapper boardMapper;

	public BoardServiceImpl(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
}
