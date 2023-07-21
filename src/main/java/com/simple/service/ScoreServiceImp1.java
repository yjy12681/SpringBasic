package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;
import com.simple.mapper.ScoreMapper;

@Service("scoreService") //컴포넌트 스캔에 읽히면 자동으로 빈으로 등록
public class ScoreServiceImp1 implements ScoreService {
	
	@Autowired
	ScoreMapper scoreMapper;
	
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		scoreMapper.scoreRegist(vo);
		
	}

	@Override
	public ArrayList<ScoreVO> getScores() {
		ArrayList<ScoreVO> vo = scoreMapper.getScores();
		return vo;
	}

	@Override
	public void scoreDelete(int index) {
		scoreMapper.scoreDelete(index);
		
	}

	
	
	
	
	
	
	
	
	
	
	
//	//DAO영역
//	@Autowired
//	@Qualifier("xxx")
//	ScoreDAO scoreDAO;
//	
//	
//	@Override
//	public void scoreRegist(ScoreVO vo) {
//		scoreDAO.scoreRegist(vo);
////		System.out.println(vo.toString());
//	}
//
//
//	@Override
//	public ArrayList<ScoreVO> getScores() {
//		
//		return scoreDAO.getScores();
//	}
//
//
//	@Override
//	public void scoreDelete(int index) {
//		// TODO Auto-generated method stub
//		scoreDAO.scoreDelete(index);
//	}

	

}
