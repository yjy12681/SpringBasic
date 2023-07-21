package com.simple.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ReqVO;
import com.simple.command.Req_quizVO;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	@RequestMapping("/res_ex01")
	public void ex01() {
		
	}
	
	//model전달자
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		
		model.addAttribute("name","홍길동");
		model.addAttribute("data",new Date());
		
		return "response/ex02";
	}
	
	@RequestMapping("/ex03")
	public ModelAndView ex03() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("serverTime", new Date()); //데이터
		mv.setViewName("response/ex03"); //화면정보
		return mv; 
	}
	
	//@ModelAttribute(화면에서 넘어오는 키값)
	@RequestMapping("/ex04")
	public String ex04(@ModelAttribute("id") String id) {
		System.out.println(id);
		return "response/ex04";
	}
	
	//ModelAttribute객체타입 vo로 받아서 xxx이름으로 변경해서 화면으로 전달
	@RequestMapping("/ex05")
	public String ex05(@ModelAttribute("xxx") ReqVO vo) {
		System.out.println(vo.toString());
		
		return "response/ex05";
	}
	
	//////////////////////////////////////////
	
	@RequestMapping("/join")
	public String join() {
		
		return "response/join";
	}
	
	//폼요청
	@RequestMapping(value = "/joinForm", method = RequestMethod.POST)
	public String joinForm(ReqVO vo, RedirectAttributes ra) {
		
		//리다이렉트시에 사용하며, 1회성 데이터를 화면에 전달해줄 수 있습니다.
		//리다이렉트시에 model은 사용할 수 없습니다.
		ra.addFlashAttribute("msg", "정상 처리되었습니다.");
		return "redirect:/"; //절대경로
	}
	
	
	@RequestMapping("/res_quiz01")
	public String res_quiz01() {
		return "response/res_quiz01";
	}
	
	@RequestMapping("/res_login")
	public String res_login(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model, RedirectAttributes ra) {
	    if(id.equals("kim12") && pw.equals("1234")) {
	    	model.addAttribute("id", id);
	    	return "response/res_quiz02";
	    }else {
	    	ra.addFlashAttribute("msg", "아이디 비밀번호를 확인하세요");
	    	return "redirect:/response/res_quiz01";
	    }
		
		
	}

//	@RequestMapping(value = "/res_login", method = RequestMethod.POST)
//	public String res_quiz02(@ModelAttribute("xxx") Req_quizVO vo) {
//	    if (vo.getId().equals("kim12") && vo.getPw().equals("1234")) {    
//	        System.out.println(vo.getId());
//	        return "redirect:/response/res_login";
//	    } else {
//	        return "response/res_quiz01";
//	    }
//	}

}
