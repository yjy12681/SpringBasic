package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.simple.command.BoardVO;
import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

public interface TestMapper {
	//추상메서드 - xml에서 실행시킬 추상메서드
	public String getTime();
	
	//insert - 단일값 전달
	public int insertOne(String name);
	
	//insert - 다중값 전달
	public int insertTwo(ScoreVO vo);
	
	//insert - 다중값 전달(맵)
	public int insertThree(HashMap<String, Object> map);
	
	//insert - 매개변수가 여러개일때 Param("이름")
	public int insertFour(@Param("name") String name,@Param("kor") String kor,@Param("eng") String eng);
	
	//update
	public boolean update1(ScoreVO vo);
	
	//select
	public ScoreVO selectOne(int num);
	//select - 반환유형이 맵
	public HashMap<String, Object> selectTwo(int num);
	//한행을 맵으로 처리하는 여러행이라면
	public ArrayList<HashMap<String, Object>> selectThree();
	
	//join처리
	//M:1 방식 = ORM은 M쪽에 변수를 추가
	public ArrayList<ScoreVO> joinOne();
	
	//1:M 방식 - ORM은 직접처리
	public MemberVO joinTwo(String name);
	
	//보드 리지스트 인서트
	public int boardRegist(@Param("name") String name, @Param("title") String title, @Param("content") String content);
}
