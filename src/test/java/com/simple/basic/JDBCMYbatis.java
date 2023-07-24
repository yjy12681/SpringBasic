package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.command.BoardVO;
import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

@RunWith(SpringJUnit4ClassRunner.class) //junit테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //테스트를 진행할 스프링 설정파일
public class JDBCMYbatis {
	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void testCode01() {
//		int result = testMapper.insertOne("test");
//		System.out.println("성공실패" + result);
//	}
//	@Test
//	public void testCode02() {
//		ScoreVO vo = new ScoreVO(0, "test", "100", "90");
//		testMapper.insertTwo(vo);
//	}
//	@Test
//	public void testCode03() {
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "맵을통한");
//		map.put("kor", "100");
//		map.put("eng", "99");
//		testMapper.insertThree(map);
//	}
//	@Test
//	public void testCode04() {
//		testMapper.insertFour("파람", "98", "97");
//	}
//	@Test
//	public void testCode05() {
//		
//		testMapper.update1(new ScoreVO(9,"업데이트","1","1"));
//		
//	}
	
//	@Test
//	public void testCode06() {
//		
//		ScoreVO vo = testMapper.selectOne(9);
//		System.out.println(vo.toString());
//		
//	}
	
//	@Test
//	public void testCode07() {
//		
//		HashMap<String, Object> map = testMapper.selectTwo(9);
//		System.out.println(map.toString());
//		
//	}
	
//	@Test
//	public void testCode08() {
//		
//		ArrayList<HashMap<String, Object>> list = testMapper.selectThree();
//		System.out.println(list.toString());
//		
//	}
	
//	@Test
//	public void testCode09() {
//		
//		ArrayList<ScoreVO> list = testMapper.joinOne();
//		System.out.println(list.toString());
//		
//		
//	}
	
//	@Test
//	public void testCode10() {
//		MemberVO vo = testMapper.joinTwo("test");
//		System.out.println(vo.toString());
//	}
	
	@Test
	public void testCode11() {
		testMapper.boardRegist("이름", "제목", "내용");
	}
}
