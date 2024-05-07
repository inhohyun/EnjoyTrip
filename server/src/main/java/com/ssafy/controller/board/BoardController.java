package com.ssafy.controller.board;

import org.springframework.web.bind.annotation.RestController;

import com.ssafy.service.board.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BoardController {
	private final BoardService boardService;

	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

}
