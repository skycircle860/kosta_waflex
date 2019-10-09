package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.SearchVO;
import kr.or.kosta.mvc.dao.MovieDao;

@Controller
public class SearchController {
	@Autowired
	private MovieDao dm;
	//�˻��� �����ϱ� ���� ��Ʈ�ѷ�
	@GetMapping("/u_search")
	public String Search(SearchVO sevo, Model m) {
		List<MovieVO> list1 = dm.moviesearch(sevo);//�˻������ ����Ʈ�� �޾ƿ�
		List<String> list = new ArrayList<>();
		for(MovieVO mvo: list1) {
			String title = mvo.getMovie_title();
			//�޾ƿ� ����Ʈ���� ��ȭ�� ���� �������� ��� ��������Ƿ�, ���߿� �ʿ��� ������ ��ȭ ������ �̾� ����Ʈ�� ����� �۾��̴�.
			String a = '"'+title+'"';
			list.add(a);
		}
		m.addAttribute("list",list);
		return "u_searchsuccess";
	}
	
}
