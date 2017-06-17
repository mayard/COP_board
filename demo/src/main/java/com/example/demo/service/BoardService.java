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
		
		return boardDao.selectList("board.board_select");
	}
	
	public int insert_board(BoardVo boardvo) {
		
		return boardDao.insert("board.board_insert", boardvo);
	}	
	
}
