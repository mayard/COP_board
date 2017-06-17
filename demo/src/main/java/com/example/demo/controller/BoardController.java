package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dao.BoardDao;
import com.example.demo.model.vo.BoardVo;
import com.example.demo.service.BoardService;

@RestController
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	
    @RequestMapping("/")
    public String main() {
        return "this is board main!!!";
    }
    
    /** 
     * 게시글 리스트
     * @param board
     * @return
     */
    @RequestMapping("/list")
    public ModelMap boardlist()
    {
    	ModelMap modelmap = new ModelMap();
    	
    	modelmap.addAttribute("list", boardService.list());
    	return modelmap;
    }
    
    /** 
     * 게시글 등록
     * @param board
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> board_register(BoardVo board)
    {
		String ret_result = "";
		String ret_msg = "";
     	Map<String, Object> jsonObject = new HashMap<String, Object>(); 	
    	try {
    		int result = boardService.insert_board(board);
    		if (result <0) {
    			throw new Exception("게시글 등록에 실패하였습니다.");
    		}
    		ret_result = "success";
    		
    	} catch(Exception e){
            e.printStackTrace();
            ret_result = "fail";
            ret_msg = e.getMessage();
		}
		jsonObject.put("result", ret_result);
        jsonObject.put("msg", ret_msg);
		
		return jsonObject;	
    }

    
 
}
