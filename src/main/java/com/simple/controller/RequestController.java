package com.simple.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;
import com.simple.command.Req_quizVO;

@Controller
@RequestMapping("/request") //각 메서드의 공통분모
public class RequestController {

	@RequestMapping("/req_ex01")
	public String ex01() {
		return "/request/req_ex01";
	}

	//	@RequestMapping(value = "/basic1", method = RequestMethod.GET)
	@GetMapping("/basic1")
	public void basic1() {
		System.out.println("basic요청");
	}

	//	@RequestMapping(value = "/basic2", method = RequestMethod.POST)
	@PostMapping("/basic2")
	public void basic2() {
		System.out.println("basic2요청");
	}

	@RequestMapping("/basic3")
	public void basic3() {
		System.out.println("basic3요청");
	}

	///파라미터값 받기
	@RequestMapping("/req_ex02")
	public String ex02() {
		return "/request/req_ex02";
	}

	//	//전통적인방법
	//	@RequestMapping("/param1")
	//	public String param1(HttpServletRequest request) {
	//		String name = request.getParameter("name");
	//		String age = request.getParameter("age");
	//		
	//		String[] inter = request.getParameterValues("inter");
	//		System.out.println(name);
	//		return "/request/result";
	//	}

	//@RequestParam(네임값) - 반드시 필수로 값이 전달이 되야 합니다.
	//required = false는 반드시 필수가 아님
	//defaultValue 값이 없을 때 기본값
//	@RequestMapping("/param1")
//	public String param1(@RequestParam("name") String name,
//			@RequestParam(value = "age",required = false, defaultValue = "0") int age,
//			@RequestParam(value = "inter", defaultValue = "") ArrayList<String> inter) {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(inter.toString());
//		return "/request/result";
//
//	}
	
	//커맨드객체를 이용하는 방법
	@RequestMapping("/param1")
	public String param1(ReqVO vo) {
		System.out.println(vo.toString());	
		return "/request/result";

	}
	
	@RequestMapping("/req_quiz01")
	public String quiz01() {
		return "/request/req_quiz01";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("id")String id, @RequestParam("pw")String pw) {
		
		if(id.trim().equals("abc123") && pw.trim().equals("xxx123") ) {
			
			return "/request/req_quiz_ok";
		}else {
			
			return "/request/req_quiz_no";
		}
		
		
	}
}
