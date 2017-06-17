package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.BoardDao;
import com.example.demo.model.vo.BoardVo;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	public List<BoardVo> list() {

		List<BoardVo> list = boardDao.selectList("board.board_select", null);

		if (list == null) {
			return null;
		}

		for (BoardVo board: list) {
			board.setComments(boardDao.selectList("comment.comment_select", board.getBno()));
		}
		return list;
	}
	
	public int insert_board(BoardVo boardvo) {
		
		return boardDao.insert("board.board_insert", boardvo);
	}
	
}
