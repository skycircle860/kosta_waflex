package kr.or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EventDao {
	@Autowired
	private SqlSessionTemplate ss;
	
	public int Eventex() {
		return ss.selectOne("event.exist");
	}
	
	public String event() {
		return ss.selectOne("event.show");
	}
}
