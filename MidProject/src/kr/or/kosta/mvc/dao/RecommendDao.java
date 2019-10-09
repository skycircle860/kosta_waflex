package kr.or.kosta.mvc.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.UserTagWeightedList;
import kr.or.kosta.dto.TagVO;

@Repository
public class RecommendDao {
	@Autowired
	private SqlSessionTemplate ss;
	
	//�� ����� ��� ����Ʈ�� �մ� ��ȭ�鿡 ���� �±׵�� �±׵��� ����ġ�� ����Ͽ� �ҷ���.
	public UserTagWeightedList getMyList(UserTagWeightedList utwl){
		ss.selectList("recommend.getmylist_proc",utwl);
		return utwl;
	}
}
