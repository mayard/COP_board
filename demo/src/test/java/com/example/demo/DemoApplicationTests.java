package com.example.demo;

import com.example.demo.model.dao.BoardDao;
import com.example.demo.model.vo.BoardVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private BoardDao boardDao;

	@Test
	public void dbTest() {

		System.out.println(boardDao.selectList("board.test", null));

		BoardVo boardVo = new BoardVo();

		boardVo.setUsername("test");
		boardVo.setSubject("제목");
		boardVo.setContent("내용");

		boardDao.insert("board.board_insert", boardVo);
	}
	
	@Test
	public void insert_commnet() {

		BoardVo boardVo = new BoardVo();

		boardVo.setUsername("test");
		boardVo.setSubject("제목");
		boardVo.setContent("내용");

		boardDao.insert("board.insertTest", boardVo);
	}

}
