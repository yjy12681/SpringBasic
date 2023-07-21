package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;


@Controller
@RequestMapping("/service")
public class ScoreController {
	
	//1st
//	ScoreService service = new ScoreServiceImp1();
	
	//2st -직접 빈등록 자동주입
//	@Autowired
//	ScoreService service;
	
	//3st
	@Autowired
	@Qualifier("scoreService")
	ScoreService scoreService;
	
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		
		return "service/scoreRegist";
	}
	
	//목록화면
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		ArrayList<ScoreVO> list =  scoreService.getScores();
		model.addAttribute("list", list);
		return "service/scoreList";
	}
	
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		
		return "service/scoreResult";
	}
	
	@RequestMapping(value = "/scoreForm", method = RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {
		
		scoreService.scoreRegist(vo);
		
		return "redirect:/service/scoreResult";
	}
	
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int index) {
		System.out.println(index);
		scoreService.scoreDelete(index);
		return "redirect:/service/scoreList"; //삭제이후에는 목록으로
	}
	
}
