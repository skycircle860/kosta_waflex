package kr.or.kosta.mvc.controller;

import java.util.HashMap;import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;


/*
 * 而⑦듃濡ㅻ윭 遺�遺�
 * */
@Controller
public class DefaultController {

	@Autowired
	private DynamicExampleDao dao; 
	//Dao瑜� �삤�넗���씠�뼱�뱶 �떆�궡
	
	
	@GetMapping("/")//메인페이지
	public String MainPage() {
		return "u_main";
	}
	//index 異쒕젰�쓣 �쐞�븿.
	
	@GetMapping("/{path}")
	public String ex1(@PathVariable String path) {
		return path;
	}
	//媛곴컖 寃쎈줈瑜� �븣�븘�꽌 蹂대궡湲� �쐞�븳 Get Mapping
	
	

	@GetMapping(value={"/blank5"})
	public String movielist5(Model m) {
		Map<String, String> map= new HashMap<String, String>();		
		m.addAttribute("list",dao.getMovieList3(map));
		return "blank5";
	}
	//blank5 ( �쁺�솕 寃��깋 諛� 異붽� �벑)瑜� �쐞�븳 Get諛⑹떇�쓽 Mapping
	
	@GetMapping("/chartjs")
	public String sendchartvalue(String cmd, Model m) {
		List<Integer> result = null;
		result = dao.getprice1();
		System.out.println(result);
		m.addAttribute("chart1",dao.getprice1());
		return "chartjs";
	}
	//李⑦듃�뿉 媛믪쓣 蹂대궡湲� �쐞�븳 Mapping.
	
	@PostMapping("/blank5")
	public String searchTitle5(String searchType,String search,Model m) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("searchType", searchType);
		map.put("search", search); 
		System.out.println(search);
		m.addAttribute("list",dao.getMovieList3(map)); 
		m.addAttribute("searchType",searchType);
		return "blank5";
	}
	//寃��깋�뿉 媛믪쓣 諛쏄린 �쐞�븳 Post諛⑹떇�쓽 Mapping
	
	
	@RequestMapping(value="update.do", method=RequestMethod.POST)
	public String update(@ModelAttribute MovieVO vo) throws Exception{
		dao.updateprice(vo);
		return "redirect:blank5"; 
	}
	//�쁺�솕�뿉�꽌 �쁺�솕�쓽 媛�寃⑹씠 �뾽�뜲�씠�듃�떆 留ㅽ븨
	
	@RequestMapping(value="updatestatus.do", method=RequestMethod.POST)
	public String updatestatus(@ModelAttribute MovieVO vo) throws Exception{
	 	dao.updatestatus(vo);
		return "redirect:blank5";
	}
	//�쁺�솕�뿉�꽌 �쁺�솕�쓽 active_status_number �닔�젙�쓣 �쐞�븳 留ㅽ븨
	
	
	@RequestMapping(value="insert.do", method=RequestMethod.POST)
	public String insert(@ModelAttribute MovieVO vo) throws Exception{
		dao.createmovie(vo);
		return "redirect:blank5";
	}
	//�쁺�솕�뿉�꽌 �쁺�솕瑜� 異붽��븯湲� �쐞�븳 Mapping

	
	}
