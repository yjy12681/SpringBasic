package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz_quizVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	@RequestMapping("/quiz01")
	public String quiz01() {
		
		
		return "quiz/quiz01";
	}
	@RequestMapping("/quiz01_ok")
	public String quiz01_ok(@RequestParam("year") String year, @RequestParam("month") String month, @RequestParam("day") String day, Model model) {
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		
		return "quiz/quiz02";
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute("xxx") Quiz_quizVO vo) {
		
		return "quiz/quiz02_ok";
	}
	
	@RequestMapping("/quiz03")
	public String quiz03() {
		
		return "quiz/quiz03";
	}
	
	@RequestMapping("/join2")
	public String join2(@RequestParam("id") String id, @RequestParam("pw") String pw, @RequestParam("pw_check") String pw_check, RedirectAttributes ra, Model model) {
		if(id.equals("")) {
			System.out.println(id);
			System.out.println(pw);
			System.out.println(pw_check);
			ra.addFlashAttribute("msg", "아이디를 입력하세요");
			return "redirect:/quiz/quiz03";
		}else if(!pw.equals(pw_check)) {
			ra.addFlashAttribute("msg", "비밀번호를 확인하세요");
			return "redirect:/quiz/quiz03";
		}else {
			model.addAttribute("id", id);
			return "/quiz/quiz03_ok";
		}
	}
}
