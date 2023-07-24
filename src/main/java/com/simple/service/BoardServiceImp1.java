package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.mapper.BoardMapper;

@Service("boardService")
public class BoardServiceImp1 implements BoardService{

	@Autowired
	BoardMapper boardMapper;
	
	
	@Override
	public void boardRegist(BoardVO vo) {
		boardMapper.boardRegist(vo);
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		ArrayList<BoardVO> vo = boardMapper.getList();
		return vo;
	}

	@Override
	public void boardDelete(int index) {
		boardMapper.boardDelete(index);
		
	}

}
