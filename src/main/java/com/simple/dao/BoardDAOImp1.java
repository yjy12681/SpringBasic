package com.simple.dao;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public class BoardDAOImp1 implements BoardDAO{

	ArrayList<BoardVO> list = new ArrayList<BoardVO>();
	
	@Override
	public void boardRegist(BoardVO vo) {
		list.add(vo);
		System.out.println(list.toString());
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void boardDelete(int index) {
		list.remove(index);
		
	}

}
